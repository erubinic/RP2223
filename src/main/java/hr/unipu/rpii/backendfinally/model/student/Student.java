package hr.unipu.rpii.backendfinally.model.student;


import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(schema="student", name="Student")
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotNull
    String jmbag;

    @Column(name="name")
    @NotNull
    String firstName;

    @NotNull
    String surname;

    /*
    @OneToOne(fetch = FetchType.EAGER, mappedBy="student")
    private ItdActivity itdActivity;
     */
}
