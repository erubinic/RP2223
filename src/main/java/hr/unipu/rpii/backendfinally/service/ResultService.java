package hr.unipu.rpii.backendfinally.service;

import hr.unipu.rpii.backendfinally.service.model.ItdResultResponse;

public interface ResultService {
    ItdResultResponse getItdResultsByJmbag(String jmbag);
}
