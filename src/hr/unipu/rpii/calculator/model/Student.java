package hr.unipu.rpii.calculator.model;

import hr.unipu.rpii.calculator.studentdata.ItdActivityData;
import hr.unipu.rpii.calculator.studentdata.ItdFirstSeminarData;
import hr.unipu.rpii.calculator.studentdata.ItdSecondSeminarData;

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
        ItdFirstSeminar result = null;
        for (ItdFirstSeminar seminar : ItdFirstSeminarData.getSeminars()) {
            if(seminar.getStudentId() == id) {
                result = seminar;
                break;
            }
        }
        if(result == null)
            throw new RuntimeException("Can't find first seminar for student with id:" + id);

        return result;
    }

    public ItdSecondSeminar getSecondSeminar() {
        ItdSecondSeminar result = null;
        for (ItdSecondSeminar seminar : ItdSecondSeminarData.getSeminars()) {
            if(seminar.getStudentId() == id) {
                result = seminar;
                break;
            }
        }
        if(result == null)
            throw new RuntimeException("Can't find second seminar for student with id:" + id);

        return result;
    }

    public ItdActivity getItdActivity() {
        ItdActivity result = null;
        for (ItdActivity activity : ItdActivityData.getActivities()) {
            if(activity.getStudentId() == id) {
                result = activity;
                break;
            }
        }
        if(result == null)
            throw new RuntimeException("Can't find activity for student with id:" + id);

        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", jmbag='" + jmbag + '\'' +
                '}';
    }
}
