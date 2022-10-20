package hr.unipu.rpii.model;

import hr.unipu.rpii.enums.Grade;


public class ItdFinalResults {
    Integer firstSeminar;
    Integer secondSeminar;
    Integer activity;
    Integer pointsBeforeFinalExam;
    Integer finalPoints;
    Grade grade;

    public ItdFinalResults(Integer firstSeminar, Integer secondSeminar, Integer activity) {
        this.firstSeminar = firstSeminar;
        this.secondSeminar = secondSeminar;
        this.activity = activity;
    }

    public static ItdFinalResults fromItdFinalResponse(ItdResultResponse itdResponse) {
        if (itdResponse.getError() != null)
            return null;

        ItdFinalResults tmp = new ItdFinalResults(
                itdResponse.getFirstSeminarDetails().calculateResult(),
                itdResponse.getSecondSeminarDetails().calculateResult(),
                itdResponse.getActivity()
        );

        return tmp.addTotalAndGrade();
    }

    private ItdFinalResults addTotalAndGrade() {
        pointsBeforeFinalExam = firstSeminar + secondSeminar + activity;

        int minimumForScaling = 40;
        int minimumFinal = 50;
        int finalExamMin = 15;
        int finalExamMax = 30;

        float tmpFinal;
        if (pointsBeforeFinalExam < minimumFinal) {
            tmpFinal = minimumFinal;
        } else {
            tmpFinal = ((float) finalExamMin / finalExamMax) * (pointsBeforeFinalExam - minimumForScaling);
            tmpFinal += 15F;
            tmpFinal += pointsBeforeFinalExam;
        }

        finalPoints = Math.round(tmpFinal);

        grade = Grade.fromPoints(finalPoints);

        return this;
    }
}
