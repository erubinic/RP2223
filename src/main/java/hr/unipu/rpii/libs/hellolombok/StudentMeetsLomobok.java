package hr.unipu.rpii.libs.hellolombok;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class StudentMeetsLomobok {
    private final String name;
    private final Integer yearOfStudy;
    private final BigDecimal averageGrade;
    private Integer birthYear;
    private String phoneNumber;
}
