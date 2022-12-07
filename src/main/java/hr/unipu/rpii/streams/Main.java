package hr.unipu.rpii.streams;

import hr.unipu.rpii.firstresultscalculator.ItdResultsService;
import hr.unipu.rpii.firstresultscalculator.impl.ResultsServiceImpl;
import hr.unipu.rpii.firstresultscalculator.model.ItdResultResponse;
import hr.unipu.rpii.firstresultscalculator.studentdata.StudentData;
import hr.unipu.rpii.firstresultscalculator.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// gleda studente iz firstresultscalculator
public class Main {
    static ItdResultsService itdResultsService = new ResultsServiceImpl();

    public static void main(String[] args) {
        Function<Student, String> getJmbag = Student::getJmbag;
        Function<String, ItdResultResponse> getItdResult = itdResultsService::getItdResult;
        Comparator<ItdResultResponse> comparing = Comparator.comparing(it -> Integer.valueOf(it.getJmbag()));
        Collector<ItdResultResponse, ?, List<ItdResultResponse>> itdResultResponseListCollector = Collectors.toList();


        var results = StudentData.getStudents()
                .stream()
                .map(getJmbag)
                .map(getItdResult)
                .sorted(comparing)
                .collect(itdResultResponseListCollector);
    }
}
