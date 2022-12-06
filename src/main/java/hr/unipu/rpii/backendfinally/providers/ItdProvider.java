package hr.unipu.rpii.backendfinally.providers;

import hr.unipu.rpii.backendfinally.model.result.ItdActivity;
import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;
import hr.unipu.rpii.backendfinally.model.result.ItdSecondSeminar;

public interface ItdProvider {
    ItdFirstSeminar getFirstSeminar(int studentId);

    ItdSecondSeminar getSecondSeminar(int studentId);

    ItdActivity getActivity(int studentId);
}
