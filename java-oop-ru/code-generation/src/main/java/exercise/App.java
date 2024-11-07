package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        var jsonCar = Car.serialize(car);

        try {
            Files.writeString(path, jsonCar);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car extract(Path path) {
        String jsonCar = "";
        
        try {
            jsonCar = Files.readString(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return Car.deserialize(jsonCar);
    }
}
// END
