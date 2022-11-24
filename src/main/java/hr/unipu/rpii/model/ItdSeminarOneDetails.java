package hr.unipu.rpii.model;

public class ItdSeminarOneDetails {
    private static final int MAX_ACTUAL_POINTS = 25;
    private static final int TEACHER_MAX_RATING = 10;

    // sum of bellow metrics bellow should be 100
    private static final int PRES_DESIGN_PERCENTAGE = 10;
    private static final int PRES_CONTENT_PERCENTAGE = 10;
    private static final int PRES_LIVE_PERCENTAGE = 20;
    private static final int SIZE_PERCENTAGE = 15;
    private static final int FORMATTING_PERCENTAGE = 15;
    private static final int QUALITY_PERCENTAGE = 30;

    private Integer presDesign;
    private Integer presContent;
    private Integer presLive;
    private Integer size;
    private Integer formatting;
    private Integer quality;

    public ItdSeminarOneDetails(Integer presDesign, Integer presContent, Integer presLive, Integer size, Integer formatting, Integer quality) {
        this.presDesign = presDesign;
        this.presContent = presContent;
        this.presLive = presLive;
        this.size = size;
        this.formatting = formatting;
        this.quality = quality;
    }

    public static ItdSeminarOneDetails fromItdSeminar(ItdFirstSeminar req) {
        return new ItdSeminarOneDetails(
                req.getPresDesign(),
                req.getPresContent(),
                req.getPresLive(),
                req.getSize(),
                req.getFormatting(),
                req.getQuality()
        );
    }

    public Integer calculateResult() {
        if (quality == null)
            throw new RuntimeException("No score for first seminar (quality).");

        int percentageToAdd = percentageToAdd(presDesign, PRES_DESIGN_PERCENTAGE) +
                percentageToAdd(presContent, PRES_CONTENT_PERCENTAGE) +
                percentageToAdd(presLive, PRES_LIVE_PERCENTAGE) +
                percentageToAdd(size, SIZE_PERCENTAGE) +
                percentageToAdd(formatting, FORMATTING_PERCENTAGE) +
                percentageToAdd(quality, QUALITY_PERCENTAGE);

        float points = calculateOneMetricPoint(presDesign, PRES_CONTENT_PERCENTAGE) +
                calculateOneMetricPoint(presContent, PRES_CONTENT_PERCENTAGE) +
                calculateOneMetricPoint(presLive, PRES_LIVE_PERCENTAGE) +
                calculateOneMetricPoint(size, SIZE_PERCENTAGE) +
                calculateOneMetricPoint(formatting, FORMATTING_PERCENTAGE) +
                calculateOneMetricPoint(quality, QUALITY_PERCENTAGE);

        points += 100F * ((float) percentageToAdd / 100F);

        points = (points / 100F) * MAX_ACTUAL_POINTS;

        return Math.round(points);
    }

    private static int percentageToAdd(Integer value, int percentage) {
        if (value == null)
            return percentage;
        else
            return 0;
    }

    private float calculateOneMetricPoint(Integer value, int percentage) {
        if (value == null)
            value = 0;

        return ((float) value / TEACHER_MAX_RATING) * percentage;
    }


}
