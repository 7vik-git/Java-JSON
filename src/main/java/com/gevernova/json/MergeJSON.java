package com.gevernova.json;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Bob");

        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("email", "bob@example.com");

        obj1.setAll(obj2);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1));
    }
}

