package hr.unipu.rpii.firstresultscalculator.model;

public class ItdFirstSeminar extends ItdSeminar {
    private Integer size;

    private Integer formatting;

    public ItdFirstSeminar(int id, int studentId, Integer presDesign, Integer presContent, Integer presLive, Integer size, Integer formatting, Integer quality) {
        super(id, studentId, presDesign, presContent, presLive, quality);
        this.size = size;
        this.formatting = formatting;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getFormatting() {
        return formatting;
    }
}
