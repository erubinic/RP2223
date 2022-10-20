package hr.unipu.rpii;

import hr.unipu.rpii.impl.ResultsServiceImpl;

public class Main {
    static ItdResultsService itdResultsService = new ResultsServiceImpl();

    public static void main(String[] args) {







        itdResultsService.getItdResult("10");

    }
}
