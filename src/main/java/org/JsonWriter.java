package org;

import java.io.*;
import java.util.List;

public class JsonWriter {

    public static void saveStudentsToJson(List<Student> students, String filePath) throws IOException {
        StringBuilder json = new StringBuilder();
        json.append("[\n");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            json.append("  {\n");
            json.append("    \"id\": ").append(s.getId()).append(",\n");
            json.append("    \"name\": \"").append(escapeJson(s.getName())).append("\",\n");
            json.append("    \"age\": ").append(s.getAge()).append(",\n");
            json.append("    \"gpa\": ").append(String.format("%.2f", s.getGpa())).append(",\n");

            // enrolledCourses — массив строк
            json.append("    \"enrolledCourses\": [");
            List<String> courses = s.getEnrolledCourses();
            for (int j = 0; j < courses.size(); j++) {
                if (j > 0) json.append(", ");
                json.append("\"").append(escapeJson(courses.get(j))).append("\"");
            }
            json.append("]\n");

            json.append("  }");
            if (i < students.size() - 1) {
                json.append(",\n");
            } else {
                json.append("\n");
            }
        }

        json.append("]\n");

        // Запись в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(json.toString());
        }
    }

    private static String escapeJson(String str) {
        if (str == null) return "";
        return str.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}