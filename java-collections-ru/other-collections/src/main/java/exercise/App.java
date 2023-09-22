package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {

        public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
            LinkedHashMap<String, String> result = new LinkedHashMap<>();
            Set<String> keys1 = new TreeSet<>(data1.keySet());
            Set<String> keys2 = new TreeSet<>(data2.keySet());

            Set<String> keysAll = new TreeSet<>();
            keysAll.addAll(keys1);
            keysAll.addAll(keys2);

            for (var key : keysAll) {
                var value = getMapDiff(key, data1, data2);
                result.put(key, value);
            }

            return result;
        }

    private static String getMapDiff(String key, Map<String, Object> map1, Map<String, Object> map2) {
        if (map1.containsKey(key)) {
            if (map2.containsKey(key)) {
                return map1.get(key).equals(map2.get(key)) ? "unchanged" : "changed";
            }
            return "deleted";
        }
        return "added";
    }
}

//END
