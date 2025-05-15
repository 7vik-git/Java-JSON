package com.gevernova.json;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Map;
public class StudentJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> student = Map.of(
                "name", "Alice",
                "age", 20,
                "subjects", List.of("Math", "Science", "English")
        );
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(json);
    }
}

