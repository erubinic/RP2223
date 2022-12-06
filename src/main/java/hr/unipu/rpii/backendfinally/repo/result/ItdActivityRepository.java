package hr.unipu.rpii.backendfinally.repo.result;

import hr.unipu.rpii.backendfinally.model.result.ItdActivity;
import hr.unipu.rpii.backendfinally.model.result.ItdSecondSeminar;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItdActivityRepository extends CrudRepository<ItdActivity, Integer> {
    Optional<ItdActivity> findByStudentId(int studentId);
}
