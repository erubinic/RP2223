package hr.unipu.rpii.model;


public class ItdSeminarTwoDetails {
    private static final int MAX_ACTUAL_POINTS = 35;
    private static final int TEACHER_PRES_MAX_RATING = 10;
    private static final int TEACHER_QUALITY_MAX_RATING = 20;

    // sum of bellow metrics bellow should be 100
    private static final int PRES_DESIGN_PERCENTAGE = 10;
    private static final int PRES_CONTENT_PERCENTAGE = 10;
    private static final int PRES_LIVE_PERCENTAGE = 20;
    private static final int QUALITY_PERCENTAGE = 60;

    private Integer presDesign;
    private Integer presContent;
    private Integer presLive;
    private Integer quality;
    private Integer negativePoints;

    public ItdSeminarTwoDetails(Integer presDesign, Integer presContent, Integer presLive, Integer quality, Integer negativePoints) {
        this.presDesign = presDesign;
        this.presContent = presContent;
        this.presLive = presLive;
        this.quality = quality;
        this.negativePoints = negativePoints;
    }

    public static ItdSeminarTwoDetails fromItdSeminar(ItdSecondSeminar req) {
        return new ItdSeminarTwoDetails(
                req.getPresDesign(),
                req.getPresContent(),
                req.getPresLive(),
                req.getQuality(),
                req.getNegativePoints()
        );
    }

    public Integer calculateResult() {
        if (!isValid())
            throw new RuntimeException("Invalid scores for second seminar.");

        float points = calculateOneMetricPoint(presDesign, PRES_DESIGN_PERCENTAGE, TEACHER_PRES_MAX_RATING) +
                calculateOneMetricPoint(presContent, PRES_CONTENT_PERCENTAGE, TEACHER_PRES_MAX_RATING) +
                calculateOneMetricPoint(presLive, PRES_LIVE_PERCENTAGE, TEACHER_PRES_MAX_RATING) +
                calculateOneMetricPoint(quality, QUALITY_PERCENTAGE, TEACHER_QUALITY_MAX_RATING);

        points = (points / 100F) * MAX_ACTUAL_POINTS;

        // minimal results should be 0, it should not go negative because of negative points
        if(negativePoints != null && points - negativePoints >= 0)
            points -= negativePoints;

        return Math.round(points);
    }

    private boolean isValid() {
        if (presDesign == null)
            return false;
        if (presContent == null)
            return false;
        if (presLive == null)
            return false;
        if (quality == null)
            return false;
        if (negativePoints != null && negativePoints < 0)
            return false;

        return true;
    }

    private float calculateOneMetricPoint(Integer value, int percentage, int teacherMaxRating) {
        if (value == null)
            value = 0;

        return ((float) value / teacherMaxRating) * percentage;
    }

}
