package com.gevernova.json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadSpecificFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));
        System.out.println("Name: " + root.get("name").asText());
        System.out.println("Email: " + root.get("email").asText());
    }
}

