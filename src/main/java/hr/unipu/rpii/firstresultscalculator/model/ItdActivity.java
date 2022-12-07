package hr.unipu.rpii.firstresultscalculator.model;

public class ItdActivity {
    private int id;

    private int studentId;

    // from 0 to 10
    private int activity;


    public ItdActivity(int id, int studentId, int activity) {
        this.id = id;
        this.studentId = studentId;
        this.activity = activity;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getActivity() {
        return activity;
    }
}