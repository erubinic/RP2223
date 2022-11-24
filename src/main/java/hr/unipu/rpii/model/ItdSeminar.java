package hr.unipu.rpii.model;

abstract class ItdSeminar {
    private int Id;

    private int studentId;

    private Integer presDesign;

    private Integer presContent;

    private Integer presLive;

    private Integer quality;


    public ItdSeminar(int id, int studentId, Integer presDesign, Integer presContent, Integer presLive, Integer quality) {
        Id = id;
        this.studentId = studentId;
        this.presDesign = presDesign;
        this.presContent = presContent;
        this.presLive = presLive;
        this.quality = quality;
    }

    public int getId() {
        return Id;
    }

    public int getStudentId() {
        return studentId;
    }

    public Integer getPresDesign() {
        return presDesign;
    }

    public Integer getPresContent() {
        return presContent;
    }

    public Integer getPresLive() {
        return presLive;
    }

    public Integer getQuality() {
        return quality;
    }

}