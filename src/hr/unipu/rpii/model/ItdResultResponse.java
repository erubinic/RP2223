package hr.unipu.rpii.model;

public class ItdResultResponse {
    String jmbag;
    ItdSeminarOneDetails firstSeminarDetails;
    ItdSeminarTwoDetails secondSeminarDetails;
    Integer activity;
    ItdFinalResults finalResults;

    String error;

    public String getJmbag() {
        return jmbag;
    }

    public ItdSeminarOneDetails getFirstSeminarDetails() {
        return firstSeminarDetails;
    }

    public ItdSeminarTwoDetails getSecondSeminarDetails() {
        return secondSeminarDetails;
    }

    public Integer getActivity() {
        return activity;
    }

    public ItdFinalResults getFinalResults() {
        return finalResults;
    }

    public String getError() {
        return error;
    }

    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }

    public void setFirstSeminarDetails(ItdSeminarOneDetails firstSeminarDetails) {
        this.firstSeminarDetails = firstSeminarDetails;
    }

    public void setSecondSeminarDetails(ItdSeminarTwoDetails secondSeminarDetails) {
        this.secondSeminarDetails = secondSeminarDetails;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public void setFinalResults(ItdFinalResults finalResults) {
        this.finalResults = finalResults;
    }

    public void setError(String error) {
        this.error = error;
    }
}
