package hr.unipu.rpii.backendfinally.repo.result;

import hr.unipu.rpii.backendfinally.model.result.ItdSecondSeminar;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItdSecondSeminarRepository extends CrudRepository<ItdSecondSeminar, Integer> {
    Optional<ItdSecondSeminar> findByStudentId(int studentId);
}
