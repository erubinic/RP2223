package hr.unipu.rpii.firstresultscalculator.enums;


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
        /*
        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            if(points >= grade.minimumPoints) {
                return  grade;
            }
        }
        return Grade.E;
        */

        return Stream.of(Grade.values())
                .filter(it -> it.minimumPoints <= points)
                .findFirst()
                .orElse(Grade.E);
    }

    public static void main(String[] args) {
        System.out.println(fromPoints(60));
        System.out.println(fromPoints(50));
        System.out.println(fromPoints(55));
        System.out.println(fromPoints(65));
        System.out.println(fromPoints(70));
        System.out.println(fromPoints(95));
    }
}
