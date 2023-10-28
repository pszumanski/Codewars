import java.math.BigInteger;
public class LastDigitOfBigInteger {

    public static void main(String[] args) {
        System.out.println(lastDigit(new BigInteger("10"), new BigInteger("4")));
    }
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if (n2.equals(new BigInteger("0"))) {
            return 1;
        }
        int temp = n1.remainder(new BigInteger("10")).intValue();
        int i = 0;

        switch (temp) {
            case 0 -> i = 0;
            case 1 -> i = 1;
            case 2 -> {
                switch (n2.remainder(new BigInteger("4")).intValue()) {
                    case 0 -> i = 6;
                    case 1 -> i = 2;
                    case 2 -> i = 4;
                    case 3 -> i = 8;
                }
            }
            case 3 -> {
                switch (n2.remainder(new BigInteger("4")).intValue()) {
                    case 0 -> i = 1;
                    case 1 -> i = 3;
                    case 2 -> i = 9;
                    case 3 -> i = 7;
                }
            }
            case 4 -> {
                switch (n2.remainder(new BigInteger("2")).intValue()) {
                    case 0 -> i = 6;
                    case 1 -> i = 4;
                }
            }
            case 5 -> i = 5;
            case 6 -> i = 6;
            case 7 -> {
                switch (n2.remainder(new BigInteger("4")).intValue()) {
                    case 0 -> i = 1;
                    case 1 -> i = 7;
                    case 2 -> i = 9;
                    case 3 -> i = 3;
                }
            }
            case 8 -> {
                switch (n2.remainder(new BigInteger("4")).intValue()) {
                    case 0 -> i = 6;
                    case 1 -> i = 8;
                    case 2 -> i = 4;
                    case 3 -> i = 2;
                }
            }
            case 9 -> {
                switch (n2.remainder(new BigInteger("2")).intValue()) {
                    case 0 -> i = 1;
                    case 1 -> i = 9;
                }
            }
        }
        return i;
    }
}
