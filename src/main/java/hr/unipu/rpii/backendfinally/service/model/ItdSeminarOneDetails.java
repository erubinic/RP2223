package hr.unipu.rpii.backendfinally.service.model;

import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
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

    public static ItdSeminarOneDetails fromItdSeminar(ItdFirstSeminar req) {
        return ItdSeminarOneDetails.builder()
                .presDesign(req.getPresDesign())
                .presContent(req.getPresContent())
                .presLive(req.getPresLive())
                .size(req.getQuantity())
                .formatting(req.getFormatting())
                .quality(req.getQuality())
                .build();
    }

    public Integer calculateResult() {
        if(quality == null)
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
