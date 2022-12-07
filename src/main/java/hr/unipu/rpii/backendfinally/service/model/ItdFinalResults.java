package hr.unipu.rpii.backendfinally.service.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ItdFinalResults {
    Integer firstSeminar;
    Integer secondSeminar;
    Integer activity;
    Integer pointsBeforeFinalExam;
    Integer finalPoints;
    Grade grade;

    public static ItdFinalResults fromItdFinalResponse(ItdResultResponse itdResponse) {
        if (itdResponse.getError() != null)
            return null;

        return ItdFinalResults.builder()
                .firstSeminar(itdResponse.getFirstSeminarDetails().calculateResult())
                .secondSeminar(itdResponse.getSecondSeminarDetails().calculateResult())
                .activity(itdResponse.getActivity())
                .build()
                .addTotalAndGrade();
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