package hr.unipu.rpii.streams;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Student pero = new Student(
                "Pero", "Peric", "1213", 5, true
        );

        // imperative approach
        if(nameStartsWithLetterP_v2(pero) && isSuperStudent(pero)) {
            System.out.println(pero);
        }else {
            System.out.println("Ime ne pocinje s P ili nije super student");
        }

        // declarative approach
        Predicate<Student> nameStartsWithP = s -> s.getName().startsWith("P");
        Predicate<Student> isSuperStudent = s -> s.isSuperStudent();

        if(nameStartsWithP.test(pero) && isSuperStudent.test(pero))
            System.out.println(pero);
        else
            System.out.println("Ime ne pocinje s P ili nije super student");

        // v2
        if(nameStartsWithP.and(isSuperStudent).test(pero))
            System.out.println(pero);
        else
            System.out.println("Ime ne pocinje s P ili nije super student");

        // v3
        BiPredicate<String, Boolean> nameStartsWithPAndIsSuperBi = (name, isSuper) -> {
            if(name.startsWith("P") && isSuper)
                return true;
            return false;
        };

        //BiPredicate<String, Boolean> nameStartsWithPAndIsSuperBi =
        //        (name, isSuper) -> name.startsWith("P") && isSuper;

        if(nameStartsWithPAndIsSuperBi.test(pero.getName(), pero.isSuperStudent()))
            System.out.println(pero);
        else
            System.out.println("Ime ne pocinje s P ili nije super student");
    }

    public static boolean nameStartsWithLetterP(Student student) {
        if (student.getName().startsWith("P"))
            return true;
        return false;
    }

    public static boolean nameStartsWithLetterP_v2(Student student) {
        return student.getName()
                .startsWith("P");
    }

    public static boolean isSuperStudent(Student student) {
        return student.isSuperStudent();
    }
}
