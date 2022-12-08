package hr.unipu.rpii.backendfinally.service.model;


import lombok.RequiredArgsConstructor;

import java.util.stream.Stream;

@RequiredArgsConstructor
public enum Grade {
    A(5, 90),
    B(4, 80),
    C(3, 70),
    D(2, 60),
    E(2, 50);

    final int numericGrade;
    final int minimumPoints;

    public static Grade fromPoints(int points) {
        return Stream.of(Grade.values())
                .filter(it -> it.minimumPoints <= points)
                .findFirst().orElse(Grade.E);
    }
}

