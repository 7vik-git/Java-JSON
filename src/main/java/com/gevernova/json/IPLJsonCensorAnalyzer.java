package com.gevernova.json;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class IPLJsonCensorAnalyzer {
    static List<String> bannedWords = Arrays.asList("fixing", "gambling", "abuse");

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Map<String, Object>> matches = mapper.readValue(
                    new File("ipl_matches.json"),
                    new TypeReference<List<Map<String, Object>>>() {}
            );

            for (Map<String, Object> match : matches) {
                String commentary = (String) match.get("commentary");
                if (commentary != null) {
                    for (String banned : bannedWords) {
                        commentary = commentary.replaceAll("(?i)" + banned, "***");
                    }
                    match.put("commentary", commentary);
                }
            }

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File("ipl_sanitized_matches.json"), matches);

            System.out.println("Sanitized data written to ipl_sanitized_matches.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

