package hr.unipu.rpii.streams;


import hr.unipu.rpii.calculator.model.ItdFirstSeminar;
import hr.unipu.rpii.calculator.studentdata.ItdFirstSeminarData;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class StreamExample {
    static Set<ItdFirstSeminar> seminars = ItdFirstSeminarData.getSeminars();

    public static void main(String[] args) {

        Optional<ItdFirstSeminar> opResult = getResultForStudentWithId(23);

        ItdFirstSeminar result = opResult.isPresent() ? opResult.get() : null;

        //

        var studentIds = getStudentIdsWherePresDesignEquals(10);

        printStudentIdsWherePresDesignEquals(null);
        printStudentIdsWherePresDesignEquals_v2(null);
        printStudentIdsWherePresDesignEquals_v3(null);
    }

    public static Optional<ItdFirstSeminar> getResultForStudentWithId(int studentId) {
        return seminars.stream()
                .filter(ifs -> ifs.getStudentId() == studentId)
                .findFirst();
    }

    public static Optional<ItdFirstSeminar> getResultForStudentWithId_v2(int studentId) {
        Predicate<ItdFirstSeminar> itdFirstSeminarPredicate = ifs -> ifs.getStudentId() == studentId;

        return seminars.stream()
                .filter(itdFirstSeminarPredicate)
                .findFirst();
    }

    public static Set<Integer> getStudentIdsWherePresDesignEquals(Integer presDesignResult) {
        return seminars.stream()
                .filter(it -> it.getPresDesign() == presDesignResult)
                .map(it -> it.getStudentId())
                .collect(Collectors.toSet());
    }

    public static void printStudentIdsWherePresDesignEquals(Integer presDesignResult) {
        seminars.stream()
                .filter(it -> it.getPresDesign() == presDesignResult)
                .map(it -> it.getStudentId())
                .forEach(it -> out.println(it));
    }

    public static void printStudentIdsWherePresDesignEquals_v2(Integer presDesignResult) {
        seminars.stream()
                .filter(it -> it.getPresDesign() == presDesignResult)
                .map(ItdFirstSeminar::getStudentId)
                .forEach(out::println);
    }

    public static void printStudentIdsWherePresDesignEquals_v3(Integer presDesignResult) {
        seminars.stream()
                .filter(it -> it.getPresDesign() == presDesignResult)
                .map(ItdFirstSeminar::getStudentId)
                .forEach(StreamExample::printId);
    }

    public static void printId(int id) {
        out.println("StudentId:" + id);
    }



}
