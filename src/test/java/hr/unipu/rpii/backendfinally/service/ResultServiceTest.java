package hr.unipu.rpii.backendfinally.service;

import hr.unipu.rpii.backendfinally.TestHelper;
import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.repo.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultServiceTest extends TestHelper {
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void getFirst(){
        Student student = studentRepository.findByJmbag("123456").get();

        assertEquals("Pero", student.getFirstName());
    }
}
