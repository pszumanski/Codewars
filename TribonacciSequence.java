import java.util.Arrays;

public class TribonacciSequence {
    public static double[] tribonacci(double[] s, int n) {
        switch (n) {
            case 2 -> {
                double[] arrayFinal = new double[2];
                System.arraycopy(s, 0, arrayFinal, 0, 2);
                return arrayFinal;
            }
            case 1 -> {
                double[] arraySingle = new double[1];
                arraySingle[0] = s[0];
                return arraySingle;
            }
            case 0 -> {
                return new double[0];
            }
            default -> {
                double[] array = new double[n];
                for (int i = 0; i < 3; i++) {
                    array[i] = s[i];
                }
                for (int i = 3; i < n; i++) {
                    array[i] = array[i - 1] + array[i - 2] + array[i - 3];
                }
                return array;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
    }
}
