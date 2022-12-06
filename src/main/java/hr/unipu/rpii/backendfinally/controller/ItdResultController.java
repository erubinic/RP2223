package hr.unipu.rpii.backendfinally.controller;

import hr.unipu.rpii.backendfinally.service.ResultService;
import hr.unipu.rpii.backendfinally.service.model.ItdResultResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itd/results/")
public class ItdResultController {
    private final ResultService resultService;

    public ItdResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @RequestMapping("/get/{jmbag}")
    public ItdResultResponse getStudentById(@PathVariable("jmbag") String jmbag) {
        return resultService.getItdResultsByJmbag(jmbag);
    }
}
