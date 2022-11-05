package hr.unipu.rpii.streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Student lara = new Student(
                "Lara", "Peric", "1213", 5, true
        );

        printBasicInfo(lara);

        Consumer<Student> printBasicInfo = s ->
                System.out.println(s.getName() + " je na " + s.getYearOfStudy()
                        + ". godini studija");

        Consumer<Student> printJmbag = s ->
                System.out.println("Jmbag je:" + s.getJmbag());

        printBasicInfo.accept(lara);

        //

        printBasicInfo.andThen(printJmbag).accept(lara);

        //

        BiConsumer<String, Integer> consumeNameAndYear = (n, y) ->
                System.out.println(n + " je na " + y
                        + ". godini studija");

        consumeNameAndYear.accept(lara.getName(), lara.getYearOfStudy());
    }

    public static void printBasicInfo(Student student) {
        System.out.println(student.getName() + " je na " + student.getYearOfStudy()
                + ". godini studija");
    }

}
