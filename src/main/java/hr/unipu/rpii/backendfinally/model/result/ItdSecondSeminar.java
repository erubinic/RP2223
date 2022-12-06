package hr.unipu.rpii.backendfinally.model.result;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(schema = "results", name = "ItdSecondSeminar")
public class ItdSecondSeminar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int studentId;

    private Integer presDesign;

    private Integer presContent;

    private Integer presLive;

    private Integer quality;

    private Integer negativePoints;

    public int getId() {
        return id;
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

    public Integer getNegativePoints() {
        return negativePoints;
    }
}
