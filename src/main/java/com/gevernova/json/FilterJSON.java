package com.gevernova.json;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.File;

public class FilterJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode array = mapper.readTree(new File("people.json"));
        for (JsonNode person : array) {
            if (person.get("age").asInt() > 25) {
                System.out.println(person);
            }
        }
    }
}

