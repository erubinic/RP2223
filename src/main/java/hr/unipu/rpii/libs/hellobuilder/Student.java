package hr.unipu.rpii.libs.hellobuilder;

import java.math.BigDecimal;

public class Student {
    String name;
    Integer yearOfStudy;
    BigDecimal averageGrade;
    Integer birthYear;
    String phoneNumber;

    private Student(Builder builder) {
        this.name = builder.name;
        this.yearOfStudy = builder.yearOfStudy;
        this.averageGrade = builder.averageGrade;
        this.birthYear = builder.birthYear;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public BigDecimal getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(BigDecimal averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", averageGrade=" + averageGrade +
                ", birthYear=" + birthYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    public static class Builder {
        private final String name;
        private Integer yearOfStudy;
        private BigDecimal averageGrade;
        private Integer birthYear;
        private String phoneNumber;

        public Builder(String name) {
            this.name = name;
        }

        public Builder yearOfStudy(Integer yearOfStudy) {
            this.yearOfStudy = yearOfStudy;
            return this;
        }

        public Builder averageGrade(BigDecimal averageGrade) {
            this.averageGrade = averageGrade;
            return this;
        }

        public Builder birthYear(Integer birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }

    public static void main(String[] args) {
        Student student = new Builder("Pero")
                .build();

        System.out.println(student);

        student = new Builder("Pero")
                .yearOfStudy(4)
                .averageGrade(new BigDecimal(3.5))
                .phoneNumber("095949494")
                .birthYear(1990)
                .build();

        System.out.println(student);

        student = new Builder("Pero")
                .yearOfStudy(4)
                .averageGrade(new BigDecimal(3.5))
                .birthYear(1990)
                .build();

        System.out.println(student);

        student = new Builder("Pero").yearOfStudy(2).averageGrade(new BigDecimal(4.5)).build();

        System.out.println(student);

    }

}
