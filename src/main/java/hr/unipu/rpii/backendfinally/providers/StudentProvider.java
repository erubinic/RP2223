package hr.unipu.rpii.backendfinally.providers;

import hr.unipu.rpii.backendfinally.model.student.Student;

public interface StudentProvider {
    Student getById(int id);

    Student getByJmbag(String jmbag);
}
