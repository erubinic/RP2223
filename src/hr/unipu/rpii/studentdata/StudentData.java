package hr.unipu.rpii.studentdata;

import hr.unipu.rpii.model.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentData {
    private static Set<Student> students = new HashSet<>();

    static {
        for (int id = 1; id < 27; id++)
            students.add(new Student(id, String.valueOf(id*10)));
    }

    public static Set<Student> getStudents() {
        return students;
    }
}
