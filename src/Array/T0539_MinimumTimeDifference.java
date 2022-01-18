package Array;

import java.util.List;

public class T0539_MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int min = 1440;
        int m = 1440;
        if (timePoints.size() > 1440) {
            min = 0;
        } else {
            for (int i = 0; i < timePoints.size() - 1; i++) {
                for (int j = i + 1; j < timePoints.size(); j++) {
                    m = time(timePoints.get(i), timePoints.get(j));
                    System.out.println(m);
                    min = Math.min(min, m);
                }
            }
        }
        return min;
    }

    public int time(String t1, String t2) {
        String[] temp1;
        temp1 = t1.split(":");
        String[] temp2;
        temp2 = t2.split(":");

        int m1 = Integer.parseInt(temp1[0]);
        int s1 = Integer.parseInt(temp1[1]);

        int m2 = Integer.parseInt(temp2[0]);
        int s2 = Integer.parseInt(temp2[1]);

        int diff = Math.abs((m1 * 60 + s1) - (m2 * 60 + s2));
        if (diff > 720)
            diff = 1440 - diff;
        return diff;
    }
}
