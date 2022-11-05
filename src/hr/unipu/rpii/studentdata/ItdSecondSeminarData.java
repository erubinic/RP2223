package hr.unipu.rpii.studentdata;

import hr.unipu.rpii.model.ItdSecondSeminar;

import java.util.HashSet;
import java.util.Set;

public class ItdSecondSeminarData {
    private static Set<ItdSecondSeminar> seminars = new HashSet<>();

    static {
        seminars.add(new ItdSecondSeminar(1, 1, 8, 8, 7, 17, null));
        seminars.add(new ItdSecondSeminar(2, 2, 7, 5, 5, 8, null));
        seminars.add(new ItdSecondSeminar(3, 3, 7, 5, 6, 9, null));
        seminars.add(new ItdSecondSeminar(4, 4, 8, 6, 8, 15, null));
        seminars.add(new ItdSecondSeminar(5, 5, 6, 6, 8, 13, null));
        seminars.add(new ItdSecondSeminar(6, 6, 10, 8, 7, 11, 1));
        seminars.add(new ItdSecondSeminar(7, 7, 7, 10, 9, 16, 2));
        seminars.add(new ItdSecondSeminar(8, 8, 7, 9, 10, 12, null));
        seminars.add(new ItdSecondSeminar(9, 9, 10, 10, 9, 14, null));
        seminars.add(new ItdSecondSeminar(10, 10, 6, 10, 10, 20, 3));
        seminars.add(new ItdSecondSeminar(11, 11, 7, 5, 5, 6, 6));
        seminars.add(new ItdSecondSeminar(12, 12, 8, 8, 10, 17, 1));
        seminars.add(new ItdSecondSeminar(13, 13, 6, 5, 8, 15, null));
        seminars.add(new ItdSecondSeminar(14, 14, 10, 10, 10, 20, null));
        seminars.add(new ItdSecondSeminar(15, 15, 6, 5, 5, 14, null));
        seminars.add(new ItdSecondSeminar(16, 16, 8, 8, 7, 16, 2));
        seminars.add(new ItdSecondSeminar(17, 17, 9, 8, 8, 18, 2));
        seminars.add(new ItdSecondSeminar(18, 18, 10, 10, 7, 18, null));
        seminars.add(new ItdSecondSeminar(19, 19, 10, 9, 7, 17, 1));
        seminars.add(new ItdSecondSeminar(20, 20, 10, 8, 10, 20, null));
        seminars.add(new ItdSecondSeminar(21, 21, 5, 8, 5, 19, null));
        seminars.add(new ItdSecondSeminar(22, 22, 7, 6, 6, 20, null));
        seminars.add(new ItdSecondSeminar(23, 23, 7, 7, 8, 16, null));
        seminars.add(new ItdSecondSeminar(24, 24, 8, 10, 9, 20, 1));
        seminars.add(new ItdSecondSeminar(25, 25, 9, 9, 10, 19, 2));
        seminars.add(new ItdSecondSeminar(26, 26, 6, 8, 9, 14, null));
    }

    public static Set<ItdSecondSeminar> getSeminars() {
        return seminars;
    }
}
