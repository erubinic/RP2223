package hr.unipu.rpii.studentdata;

import hr.unipu.rpii.model.ItdActivity;

import java.util.HashSet;
import java.util.Set;

public class ItdActivityData {
    private static Set<ItdActivity> activities = new HashSet<>();

    static  {
        activities.add(new ItdActivity(1, 1, 7));
        activities.add(new ItdActivity(2, 2, 5));
        activities.add(new ItdActivity(3, 3, 5));
        activities.add(new ItdActivity(4, 4, 8));
        activities.add(new ItdActivity(5, 5, 6));
        activities.add(new ItdActivity(6, 6, 9));
        activities.add(new ItdActivity(7, 7, 5));
        activities.add(new ItdActivity(8, 8, 4));
        activities.add(new ItdActivity(9, 9, 7));
        activities.add(new ItdActivity(10, 10, 10));
        activities.add(new ItdActivity(11, 11, 5));
        activities.add(new ItdActivity(12, 12, 10));
        activities.add(new ItdActivity(13, 13, 10));
        activities.add(new ItdActivity(14, 14, 7));
        activities.add(new ItdActivity(15, 15, 4));
        activities.add(new ItdActivity(16, 16, 6));
        activities.add(new ItdActivity(17, 17, 6));
        activities.add(new ItdActivity(18, 18, 10));
        activities.add(new ItdActivity(19, 19, 6));
        activities.add(new ItdActivity(20, 20, 10));
        activities.add(new ItdActivity(21, 21, 5));
        activities.add(new ItdActivity(22, 22, 10));
        activities.add(new ItdActivity(23, 23, 8));
        activities.add(new ItdActivity(24, 24, 10));
        activities.add(new ItdActivity(25, 25, 6));
        activities.add(new ItdActivity(26, 26, 6));
    }

    public static Set<ItdActivity> getActivities() {
        return activities;
    }
}
