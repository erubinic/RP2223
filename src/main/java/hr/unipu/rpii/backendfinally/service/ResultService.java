package hr.unipu.rpii.backendfinally.service;

import hr.unipu.rpii.backendfinally.model.result.ItdFirstSeminar;

public interface ResultService {
    ItdFirstSeminar getResultsByJmbag(String jmbag);
}
