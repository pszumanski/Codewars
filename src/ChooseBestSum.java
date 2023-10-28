import java.util.*;


public class ChooseBestSum {
    // ls contains distances between towns
    // t is maximum amount of distance
    // k is amount of towns to visit

    public static void main(String[] args) {
        System.out.println(chooseBestSum(34400, 6, new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87, 23, 32, 23, 53, 69, 79, 19))));
    }

    static int[] indexes;
    static int highestIndex;

    public static void increaseIndex(int position, int k) {
        if (indexes[position - 1] == highestIndex - k + position) {
            increaseIndex(position - 1, k);
            indexes[position] = indexes[position - 1] + 1;
        } else {
            indexes[position - 1]++;
            indexes[position] = indexes[position - 1] + 1;
        }
    }
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int temp;

        if (k > ls.size()) {
            return null;
        } else if (k == ls.size()) {
            temp = 0;

            for (int i = 0; i < k; i++) {
                temp += ls.get(i);
            }

            if (temp <= t) {
                return temp;
            } else {
                return null;
            }
        }

        indexes = new int[k];
        int max = 0;
        highestIndex = ls.size() - 1;
        Set<Integer> unique = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            indexes[i] = i;
        }


        do {
            System.out.println(Arrays.toString(indexes));
            temp = 0;

            for (int i = 0; i < k; i++) {
                temp += ls.get(indexes[i]);
                unique.add(indexes[i]);
            }

            if (temp <= t && unique.size() == k) {
                max = Math.max(max, temp);
            }

            unique.clear();

            if (indexes[k - 1] == highestIndex) {
                increaseIndex(k - 1, k);
            } else {
                indexes[k - 1]++;
            }

        } while (indexes[0] != highestIndex - k + 1 && max != t);

        System.out.println(Arrays.toString(indexes));
        System.out.println("MAXIMUM: " + max + " LIMIT: " + t + " ITEMS: " + k);

        if (max != 0) {
                return max;
            } else {
                return null;
        }
    }
}
