package hr.unipu.rpii.backendfinally.model.result;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(schema = "results", name = "ItdSecondSeminar")
@Getter
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
}
