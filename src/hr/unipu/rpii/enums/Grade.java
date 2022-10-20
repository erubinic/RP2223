package hr.unipu.rpii.enums;


import java.util.stream.Stream;

public enum Grade {
    A(5, 90),
    B(4, 80),
    C(3, 70),
    D(2, 60),
    E(2, 50);

    final int numericGrade;
    final int minimumPoints;

    Grade(int numericGrade, int minimumPoints) {
        this.numericGrade = numericGrade;
        this.minimumPoints = minimumPoints;
    }

    public static Grade fromPoints(int points) {
        return Stream.of(Grade.values())
                .filter(it -> it.minimumPoints <= points)
                .findFirst().orElse(Grade.E);

    }
}
