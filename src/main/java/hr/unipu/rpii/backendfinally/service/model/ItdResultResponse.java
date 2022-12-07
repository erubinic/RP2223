package hr.unipu.rpii.backendfinally.service.model;

import lombok.Data;

@Data
public class ItdResultResponse {
    String jmbag;
    ItdSeminarOneDetails firstSeminarDetails;
    ItdSeminarTwoDetails secondSeminarDetails;
    Integer activity;
    ItdFinalResults finalResults;

    String error;
}
