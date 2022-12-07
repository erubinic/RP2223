package hr.unipu.rpii.firstresultscalculator.studentdata;

import hr.unipu.rpii.firstresultscalculator.model.ItdFirstSeminar;

import java.util.HashSet;
import java.util.Set;

public class ItdFirstSeminarData {
    private static Set<ItdFirstSeminar> seminars = new HashSet<>();

    static  {
        seminars.add(new ItdFirstSeminar(1, 1, 7, 7, 9, 10, 7, 8));
        seminars.add(new ItdFirstSeminar(2, 2, 7, 9, 6, 10, 8, 7));
        seminars.add(new ItdFirstSeminar(3, 3, 8, 9, 8, 8, 7, 9));
        seminars.add(new ItdFirstSeminar(4, 4, 6, 9, 6, 5, 7, 7));
        seminars.add(new ItdFirstSeminar(5, 5, 10, 10, 10, 10, 9, 9));
        seminars.add(new ItdFirstSeminar(6, 6, 3, 5, 6, 10, 6, 8));
        seminars.add(new ItdFirstSeminar(7, 7, 8, 10, 10, 10, 8, 9));
        seminars.add(new ItdFirstSeminar(8, 8, 7, 8, 10, 10, 10, 9));
        seminars.add(new ItdFirstSeminar(9, 9, null, null, null, 10, 10, 9));
        seminars.add(new ItdFirstSeminar(10, 10, 8, 10, 10, 10, 10, 10));
        seminars.add(new ItdFirstSeminar(11, 11, 9, 7, 10, 7, 8, 8));
        seminars.add(new ItdFirstSeminar(12, 12, null, null, 7, 10, 9, 10));
        seminars.add(new ItdFirstSeminar(13, 13, 5, 7, 10, 10, 10, 10));
        seminars.add(new ItdFirstSeminar(14, 14, 10, 9, 8, 10, 10, 10));
        seminars.add(new ItdFirstSeminar(15, 15, 7, 3, 7, 9, 7, 8));
        seminars.add(new ItdFirstSeminar(16, 16, 10, 10, 8, 7, 8, 7));
        seminars.add(new ItdFirstSeminar(17, 17, 9, 10, 9, 10, 7, 9));
        seminars.add(new ItdFirstSeminar(18, 18, 9, 7, 6, 10, 8, 7));
        seminars.add(new ItdFirstSeminar(19, 19, 10, 8, 7, 10, 8, 9));
        seminars.add(new ItdFirstSeminar(20, 20, 9, 10, 10, 10, 9, 10));
        seminars.add(new ItdFirstSeminar(21, 21, 5, 8, 5, 10, 7, 8));
        seminars.add(new ItdFirstSeminar(22, 22, 8, 5, 5, 8, 8, 8));
        seminars.add(new ItdFirstSeminar(23, 23, 10, 10, 8, 10, 10, 7));
        seminars.add(new ItdFirstSeminar(24, 24, 10, 10, 8, 10, 10, 10));
        seminars.add(new ItdFirstSeminar(25, 25, 8, 8, 8, 10, 8, 8));
        seminars.add(new ItdFirstSeminar(26, 26, 7, 7, 8, 9, 7, 7));
    }

    public static Set<ItdFirstSeminar> getSeminars() {
        return seminars;
    }
}
