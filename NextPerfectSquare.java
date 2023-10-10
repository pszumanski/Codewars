import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class NextPerfectSquare {
        public static long findNextSquare(long sq) {
            if (sq < 0 || sqrt(sq) < 0 || sqrt(sq) % 1 != 0) {
                return -1;
            }
            return (long) pow((sqrt(sq) + 1), 2);
        }

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
    }
}
