package hr.unipu.rpii.backendfinally.controller;

import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.providers.StudentProvider;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentProvider studentProvider;

    public StudentController(StudentProvider studentProvider) {
        this.studentProvider = studentProvider;
    }

    @RequestMapping("/get/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return studentProvider.getById(id);
    }
}
