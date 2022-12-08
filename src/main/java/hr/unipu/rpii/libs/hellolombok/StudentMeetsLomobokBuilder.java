package hr.unipu.rpii.libs.hellolombok;


import lombok.Builder;
import lombok.ToString;

import java.math.BigDecimal;

@Builder
@ToString
public class StudentMeetsLomobokBuilder {
    private String name;
    private Integer yearOfStudy;
    private BigDecimal averageGrade;
    private Integer birthYear;
    private String phoneNumber;

    public static void main(String[] args) {
        StudentMeetsLomobokBuilder student = StudentMeetsLomobokBuilder.builder()
                .name("Pero")
                .phoneNumber("0959494940")
                .yearOfStudy(5)
                .averageGrade(BigDecimal.valueOf(3.5))
                //.birthYear(1800)
                .build();

        System.out.println(student);
    }
}
