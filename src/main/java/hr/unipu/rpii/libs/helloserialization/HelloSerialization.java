package hr.unipu.rpii.libs.helloserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import hr.unipu.rpii.libs.hellolombok.StudentLombok2;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public class HelloSerialization {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        StudentLombok2 student = new StudentLombok2(
                "Pero",
                3,
                BigDecimal.ONE,
                1990,
                "095949494"
        );

        try {
            File directory = new File("jackson");
            if (!directory.exists())
                directory.mkdir();

            mapper.writeValue(new File("jackson/studentPero.json"), student);

            // byte[] studentBytes = mapper.writeValueAsBytes(student);

            StudentLombok2 studentPeroFromJsonFile = mapper.readValue(new File("jackson/studentPero.json"),
                    StudentLombok2.class);
            System.out.println(studentPeroFromJsonFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
