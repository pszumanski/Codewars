public class SumOfIntervals {

    public static int sumIntervals(int[][] intervals) {
        int sum = 0;
        int changes = 0;
        do {
            changes = 0;
            for (int i = 0; i < intervals.length; i++) {
                for (int j = 0; j < intervals.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (intervals[j][0] >= intervals[i][0] && intervals[j][0] < intervals[i][1]) {
                        if (intervals[j][1] <= intervals[i][1]) {
                            if (intervals[j][0] == 0 && intervals[j][1] == 0) {
                                continue;
                            } else {
                                intervals[j][0] = 0;
                                intervals[j][1] = 0;
                                changes++;
                            }
                        } else {
                            intervals[i][1] = intervals[j][1];
                            intervals[j][0] = 0;
                            intervals[j][1] = 0;
                            changes++;
                        }
                    }
                }
            }
        } while (changes != 0);
        for (int i = 0; i < intervals.length; i++) {
            sum += intervals[i][1] - intervals[i][0];
        }
        return sum;
    }
}
