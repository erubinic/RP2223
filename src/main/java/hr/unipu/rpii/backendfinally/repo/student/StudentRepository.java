package hr.unipu.rpii.backendfinally.repo.student;

import hr.unipu.rpii.backendfinally.model.student.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Optional<Student> findByJmbag(String jmbag);
}
