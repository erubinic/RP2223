package hr.unipu.rpii.streams;

public class Student {
    private String name;
    private String surname;
    private String jmbag;
    private int yearOfStudy;
    private boolean superStudent;

    public Student(String name,
                   String surname,
                   String jmbag,
                   int yearOfStudy,
                   boolean superStudent) {
        this.name = name;
        this.surname = surname;
        this.jmbag = jmbag;
        this.yearOfStudy = yearOfStudy;
        this.superStudent = superStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", jmbag='" + jmbag + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJmbag() {
        return jmbag;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public boolean isSuperStudent() {
        return superStudent;
    }
}
