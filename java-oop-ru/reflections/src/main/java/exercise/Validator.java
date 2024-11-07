package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        Field[] fields = address.getClass().getDeclaredFields();
        var notValidFields = new ArrayList<String>();

        Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(NotNull.class))
                .forEach(f -> {
                    try {
                        f.setAccessible(true);
                        if (f.get(address) == null) {
                            notValidFields.add(f.getName());
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return notValidFields;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Field[] fields = address.getClass().getDeclaredFields();
        var notValidFields = new HashMap<String, List<String>>();

        Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(NotNull.class) || f.isAnnotationPresent(MinLength.class))
                .forEach(f -> {
                    try {
                        f.setAccessible(true);
                        if (f.isAnnotationPresent(MinLength.class)) {
                            MinLength annotation = f.getAnnotation(MinLength.class);
                            var annotationLength = annotation.minLength();

                            if (f.get(address) == null) {
                                notValidFields.computeIfAbsent(f.getName(), k -> new ArrayList<>()).
                                        add("length less than " + annotationLength);
                            } else {
                                var fieldLength = f.get(address).toString().length();

                                if (fieldLength < annotationLength) {
                                    notValidFields.computeIfAbsent(f.getName(), k -> new ArrayList<>()).
                                            add("length less than " + annotationLength);
                                }
                            }
                        }

                        if (f.isAnnotationPresent(NotNull.class)) {
                            if (f.get(address) == null) {
                                notValidFields.computeIfAbsent(f.getName(), k -> new ArrayList<>()).add("can not be null");
                            }
                        }
                    }
                    catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return notValidFields;
    }
}


// END
