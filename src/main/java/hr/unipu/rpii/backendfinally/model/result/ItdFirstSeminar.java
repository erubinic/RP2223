package hr.unipu.rpii.backendfinally.model.result;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(schema = "results", name = "ItdFirstSeminar")
public class ItdFirstSeminar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int studentId;

    private Integer presDesign;

    private Integer presContent;

    private Integer presLive;

    private Integer quality;

    @Column(name = "Size")
    private Integer quantity;

    private Integer formatting;
}
