package it.hr.unipu.rpii.backendfinally.service;

import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.repo.student.StudentRepository;
import hr.unipu.rpii.firstresultscalculator.ItdResultsService;
import hr.unipu.rpii.firstresultscalculator.model.ItdResultResponse;
import it.hr.unipu.rpii.backendfinally.helper.TestHelper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class ResultServiceTest extends TestHelper {
    // here we should write Results service tests (here are not written, but you can do it for pratice)
    // example: add results data for stuent pero in test-changelogs and test if ResultService returns expected ItdResultResponse

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ItdResultsService itdResultsService;

    @Test
    public void getFirst() {
        Student student = studentRepository.findByJmbag("123456").get();

        assertEquals("Pero", student.getFirstName());
    }

    @Test
    public void testMock() {
        Student student = studentRepository.findByJmbag("123456").get();

        assertEquals("Pero", student.getFirstName());
    }

    @Test
    public void printAll() {
        List<ItdResultResponse> resposes = new ArrayList<>();

        studentRepository.findAll().forEach(student -> {
            ItdResultResponse response = itdResultsService.getItdResult(student.getJmbag());
            if (response != null)
                resposes.add(itdResultsService.getItdResult(student.getJmbag()));
        });

        resposes.forEach(r -> {
            if (r.getError() != null) {
                log.warn("\t{}\t{}\t{}\t{}\t{}",
                        r.getJmbag(),
                        null,
                        null,
                        null,
                        r.getError());
                return;
            }
            log.warn("\t{}\t{}\t{}\t{}\t{}",
                    r.getJmbag(),
                    r.getFinalResults(),
                    r.getFinalResults(),
                    r.getFinalResults(),
                    r.getError());
        });

    }
}
