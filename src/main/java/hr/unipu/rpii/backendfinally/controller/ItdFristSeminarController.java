package hr.unipu.rpii.backendfinally.controller;

import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;
import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.providers.StudentProvider;
import hr.unipu.rpii.backendfinally.service.ResultService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class ItdFristSeminarController {
    private final ResultService resultService;

    public ItdFristSeminarController(ResultService resultService) {
        this.resultService = resultService;
    }

    @RequestMapping("/get/{jmbag}")
        public ItdFirstSeminar getStudentById(@PathVariable("jmbag") String jmbag){
        return resultService.getResultsByJmbag(jmbag);
    }
}
