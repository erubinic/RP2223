package hr.unipu.rpii.backendfinally.model.result;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(schema = "results", name = "ItdFirstSeminar")
public class ItdFirstSeminar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotNull
    int studentId;

    Integer presDesign;
    Integer presContent;
}
