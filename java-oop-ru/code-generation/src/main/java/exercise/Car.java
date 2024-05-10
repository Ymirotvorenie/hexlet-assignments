package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Value;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        var mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public static Car unserialize(String json) throws IOException {
        var mapper = new ObjectMapper();
        return mapper.readValue(json, Car.class);
    }
    // END
}
