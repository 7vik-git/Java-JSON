package com.gevernova.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
public class ValidateJSON {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"email\":\"john@example.com\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(json);
            if (node.has("name") && node.has("email")) {
                System.out.println("Valid structure");
            } else {
                System.out.println("Missing required fields");
            }
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
