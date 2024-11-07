package exercise;

import lombok.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.CharArrayReader;

// BEGIN
@Getter
@NoArgsConstructor
@AllArgsConstructor
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public static String serialize(Car car) {
        var mapper = new ObjectMapper();
        String jsonCar = "";

        try {
            jsonCar = mapper.writeValueAsString(car);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return jsonCar;
    }

    public static Car deserialize(String jsonCar) {
        var mapper = new ObjectMapper();
        Car car = new Car();

        try {
            car = mapper.readValue(jsonCar, Car.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return car;
    }
    // END
}
