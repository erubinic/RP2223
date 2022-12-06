package hr.unipu.rpii.backendfinally.service.impl;

import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;
import hr.unipu.rpii.backendfinally.providers.StudentProvider;
import hr.unipu.rpii.backendfinally.repo.student.ItdFirstSeminarRepository;
import hr.unipu.rpii.backendfinally.service.ResultService;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {
    private final StudentProvider studentProvider;
    private final ItdFirstSeminarRepository itdFirstSeminarRepository;

    public ResultServiceImpl(StudentProvider studentProvider, ItdFirstSeminarRepository itdFirstSeminarRepository) {
        this.studentProvider = studentProvider;
        this.itdFirstSeminarRepository = itdFirstSeminarRepository;
    }

    @Override
    public ItdFirstSeminar getResultsByJmbag(String jmbag) {
        var student = studentProvider.getByJmbag(jmbag);

        if (student != null) {
            return itdFirstSeminarRepository.findByStudentid(student.getId())
                    .orElseGet(null);
        }
        else
            return null;
    }
}
