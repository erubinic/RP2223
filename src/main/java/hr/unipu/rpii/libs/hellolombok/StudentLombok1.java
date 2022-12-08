package hr.unipu.rpii.libs.hellolombok;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class StudentLombok1 {
    String name;
    Integer yearOfStudy;
    BigDecimal averageGrade;
    Integer birthYear;
    String phoneNumber;

    public static void main(String[] args) {
        StudentLombok1 student = new StudentLombok1("pero", 3, BigDecimal.ONE, 1990, "095");
        System.out.println(student);

        student.setYearOfStudy(5);

        Integer yos  = student.getYearOfStudy();
    }
}
