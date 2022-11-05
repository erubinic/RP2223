package hr.unipu.rpii.calculator.model;

public class ItdSecondSeminar extends ItdSeminar {

    private Integer negativePoints;

    public ItdSecondSeminar(int id, int studentId, Integer presDesign, Integer presContent, Integer presLive, Integer quality, Integer negativePoints) {
        super(id, studentId, presDesign, presContent, presLive, quality);
        this.negativePoints = negativePoints;
    }

    public Integer getNegativePoints() {
        return negativePoints;
    }
}