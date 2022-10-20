package hr.unipu.rpii.model;

public class Student {
    private int id;

    private String jmbag;


    public Student(int id, String jmbag) {
        this.id = id;
        this.jmbag = jmbag;
    }


    public int getId() {
        return id;
    }

    public String getJmbag() {
        return jmbag;
    }

    public ItdFirstSeminar getFirstSeminar() {
        return null; // TODO: find first seminar
    }

    public ItdSecondSeminar getSecondSeminar() {
        return null; // TODO: implement
    }

    public ItdActivity getItdActivity() {
        return null;// TODO: implement
    }
}
