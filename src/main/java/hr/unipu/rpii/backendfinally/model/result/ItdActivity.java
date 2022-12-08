package hr.unipu.rpii.backendfinally.model.result;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(schema = "results", name = "ItdActivity")
@Getter
public class ItdActivity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private int studentId;

    private int activity;

    /*
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId", insertable = false, updatable = false)
    Student student;
     */
}
