package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int amount) {
        if (homes.isEmpty()) {
            return new ArrayList<>();
        }
        var sortedHomes = homes.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .collect(Collectors.toList());

        var cutHomes = sortedHomes.subList(0, amount);

        return cutHomes.stream()
                .map(Object::toString)
                .toList();
    }
}
// END
