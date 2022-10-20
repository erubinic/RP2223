package hr.unipu.rpii.impl;



import hr.unipu.rpii.ItdResultsService;
import hr.unipu.rpii.model.*;
import hr.unipu.rpii.studentdata.StudentData;

import java.util.Optional;

public class ResultsServiceImpl implements ItdResultsService {

    @Override
    public ItdResultResponse getItdResult(String jmbag) {
        ItdResultResponse response = new ItdResultResponse();

        try {
            Student student = getStudent(jmbag).get();

            response.setJmbag(student.getJmbag());
            response.setFirstSeminarDetails(
                    ItdSeminarOneDetails.fromItdSeminar(student.getFirstSeminar()));
            response.setSecondSeminarDetails(
                    ItdSeminarTwoDetails.fromItdSeminar(student.getSecondSeminar()));
            response.setActivity(resolveActivity(student));
            response.setFinalResults(ItdFinalResults.fromItdFinalResponse(response));
        } catch (Exception ex) {
            System.err.println("Error getting ITD results for jmbag:" + jmbag + ", " + ex.getMessage());
            response.setError(ex.getMessage());
        }

        return response;
    }


    private Optional<Student> getStudent(String jmbag) {
        return StudentData.getStudents().stream().filter(it -> it.getJmbag().equals(jmbag)).findFirst(); // TODO: find student by jmbag
    }

    private Integer resolveActivity(Student student) {
        return null; // TODO: find student activity
                /*Optional.ofNullable(student.getItdActivity())
                .map(ItdActivity::getActivity)
                .orElse(null);
                */
    }

}
