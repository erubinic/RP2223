package hr.unipu.rpii.backendfinally.model.student;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(schema="student", name="Student")
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

    public int getId() {
        return id;
    }

    public String getJmbag() {
        return jmbag;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
