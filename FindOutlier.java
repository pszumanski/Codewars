public class FindOutlier {
    static int find(int[] integers) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even: " + even + " odd:" + odd);
        if (even > odd) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            }
            return 0;
        } else if (odd > even) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    return integers[i];
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
    }
}