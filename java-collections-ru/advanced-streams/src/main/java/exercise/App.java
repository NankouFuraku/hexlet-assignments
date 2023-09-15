package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        String [] configs = config.split("\n");
        List<String> content = new ArrayList<>(List.of(configs));

        return content.stream()
                .filter(content1 -> content1.startsWith("environment"))
                .map(content2 -> content2.replaceAll("environment=", "").replaceAll("\"", ""))
                .peek(s -> System.out.println(s + "!!!!!!!!!!!!!!"))
                .map(x -> x.split(","))
                .flatMap(Arrays::stream)
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));

    }
}
//END
