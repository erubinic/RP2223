package hr.unipu.rpii.backendfinally.providers.impl;

import hr.unipu.rpii.backendfinally.model.result.ItdActivity;
import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;
import hr.unipu.rpii.backendfinally.model.result.ItdSecondSeminar;
import hr.unipu.rpii.backendfinally.repo.result.ItdActivityRepository;
import hr.unipu.rpii.backendfinally.repo.result.ItdFirstSeminarRepository;
import hr.unipu.rpii.backendfinally.repo.result.ItdSecondSeminarRepository;
import hr.unipu.rpii.backendfinally.providers.ItdProvider;
import org.springframework.stereotype.Component;

@Component
public class ItdProviderImpl implements ItdProvider {
    private final ItdFirstSeminarRepository itdFirstSeminarRepository;
    private final ItdSecondSeminarRepository itdSecondSeminarRepository;
    private final ItdActivityRepository itdActivityRepository;


    public ItdProviderImpl(ItdFirstSeminarRepository itdFirstSeminarRepository,
                           ItdSecondSeminarRepository itdSecondSeminarRepository,
                           ItdActivityRepository itdActivityRepository
    ) {
        this.itdFirstSeminarRepository = itdFirstSeminarRepository;
        this.itdSecondSeminarRepository = itdSecondSeminarRepository;
        this.itdActivityRepository = itdActivityRepository;
    }


    @Override
    public ItdFirstSeminar getFirstSeminar(int studentId) {
        return itdFirstSeminarRepository.findByStudentId(studentId)
                .orElseGet(null);
    }

    @Override
    public ItdSecondSeminar getSecondSeminar(int studentId) {
        return itdSecondSeminarRepository.findByStudentId(studentId)
                .orElseGet(null);
    }

    @Override
    public ItdActivity getActivity(int studentId) {
        return itdActivityRepository.findByStudentId(studentId)
                .orElseGet(null);
    }
}
