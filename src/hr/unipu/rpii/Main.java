package hr.unipu.rpii;

import hr.unipu.rpii.calculator.ItdResultsService;
import hr.unipu.rpii.calculator.impl.ResultsServiceImpl;
import hr.unipu.rpii.calculator.model.Student;
import hr.unipu.rpii.calculator.studentdata.StudentData;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    static ItdResultsService itdResultsService = new ResultsServiceImpl();

    public static void main(String[] args) {
       /* var results = StudentData.getStudents()
                .stream()
                .map(Student::getJmbag)
                .map(itdResultsService::getItdResult)
                .sorted(Comparator.comparing(it -> Integer.valueOf(it.getJmbag())))
                .collect(Collectors.toList());*/
    }
}
