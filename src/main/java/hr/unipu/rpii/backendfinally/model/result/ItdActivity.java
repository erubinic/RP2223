package hr.unipu.rpii.backendfinally.model.result;

import javax.persistence.*;

@Entity
@Table(schema = "results", name = "ItdActivity")
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
