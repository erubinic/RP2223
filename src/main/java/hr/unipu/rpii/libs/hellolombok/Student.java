package hr.unipu.rpii.libs.hellolombok;

import java.math.BigDecimal;
import java.util.Objects;

public class Student {
    String name;
    Integer yearOfStudy;
    BigDecimal averageGrade;
    Integer birthYear;
    String phoneNumber;

    public Student(String name, Integer yearOfStudy, BigDecimal averageGrade, Integer birthYear, String phoneNumber) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = averageGrade;
        this.birthYear = birthYear;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(yearOfStudy, student.yearOfStudy) &&
                Objects.equals(averageGrade, student.averageGrade) &&
                Objects.equals(birthYear, student.birthYear) &&
                Objects.equals(phoneNumber, student.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfStudy, averageGrade, birthYear, phoneNumber);
    }
}
