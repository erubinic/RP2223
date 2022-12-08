package hr.unipu.rpii.libs.hellolombok;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentLombok2 {
    @Getter
    private String name;
    private Integer yearOfStudy;
    private BigDecimal averageGrade;
    @Setter
    private Integer birthYear;
    private String phoneNumber;

    public static void main(String[] args) {
        StudentLombok2 student = new StudentLombok2("pero", 3, BigDecimal.ONE, 1990, "095");
        System.out.println(student);

        student.getName();
        // student.getYearOfStudy(); baca gresku

        student.setBirthYear(55);
        // student.setYearOfStudy(5); baca gresku

    }
}
