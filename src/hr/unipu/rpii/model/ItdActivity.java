package hr.unipu.rpii.model;

public class ItdActivity {
    private int Id;

    private int studentId;

    private int activity;


    public ItdActivity(int id, int studentId, int activity) {
        Id = id;
        this.studentId = studentId;
        this.activity = activity;
    }
}