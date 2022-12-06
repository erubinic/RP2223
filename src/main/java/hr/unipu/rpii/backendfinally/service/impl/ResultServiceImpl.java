package hr.unipu.rpii.backendfinally.service.impl;

import hr.unipu.rpii.backendfinally.model.result.ItdActivity;
import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.providers.ItdProvider;
import hr.unipu.rpii.backendfinally.providers.StudentProvider;
import hr.unipu.rpii.backendfinally.service.ResultService;
import hr.unipu.rpii.backendfinally.service.model.ItdFinalResults;
import hr.unipu.rpii.backendfinally.service.model.ItdResultResponse;
import hr.unipu.rpii.backendfinally.service.model.ItdSeminarOneDetails;
import hr.unipu.rpii.backendfinally.service.model.ItdSeminarTwoDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResultServiceImpl implements ResultService {
    private final StudentProvider studentProvider;
    private final ItdProvider itdProvider;

    public ResultServiceImpl(StudentProvider studentProvider, ItdProvider itdProvider) {
        this.studentProvider = studentProvider;
        this.itdProvider = itdProvider;
    }


    @Override
    public ItdResultResponse getItdResultsByJmbag(String jmbag) {
        ItdResultResponse response = new ItdResultResponse();

        try {
            Student student = studentProvider.getByJmbag(jmbag);

            response.setJmbag(student.getJmbag());
            response.setFirstSeminarDetails(
                    ItdSeminarOneDetails.fromItdSeminar(itdProvider.getFirstSeminar(student.getId())));
            response.setSecondSeminarDetails(
                    ItdSeminarTwoDetails.fromItdSeminar(itdProvider.getSecondSeminar(student.getId())));
            response.setActivity(resolveActivity(student));
            response.setFinalResults(ItdFinalResults.fromItdFinalResponse(response));
        } catch (Exception ex) {
           System.err.println("Error getting ITD results for jmbag: " + jmbag + " " + ex.getMessage());
            response.setError(ex.getMessage());
        }

        return response;
    }

    private Integer resolveActivity(Student student) {
        return Optional.ofNullable(itdProvider.getActivity(student.getId()))
                .map(ItdActivity::getActivity)
                .orElse(null);
    }
}
