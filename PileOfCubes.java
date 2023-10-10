import static java.lang.Math.pow;

public class PileOfCubes {
    public static long findNb(long m) {
        int counter = 0;
        for (long i = 1L; m > 0; i++) {
            m -= (long) pow(i, 3);
            counter ++;
        }
        if (m == 0) {
            return counter;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findNb(4183059834009L));
    }
}
