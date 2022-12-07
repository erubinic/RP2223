package hr.unipu.rpii.backendfinally.repo.result;

import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;
import hr.unipu.rpii.backendfinally.model.student.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItdFirstSeminarRepository extends CrudRepository<ItdFirstSeminar, Integer> {
    Optional<ItdFirstSeminar> findByStudentId(int studentId);
}
