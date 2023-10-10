import java.util.HashMap;
import java.util.Map;

public class PrimeDecompFactors {
    public static String factors(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        int temp = n;
        int i = 2;
        int max = 1;
        while (i <= temp) {
            while (temp % i == 0) {
                temp /= i;
                if (factors.containsKey(i)) {
                    factors.put(i, factors.get(i) + 1);
                } else {
                    factors.put(i, 1);
                    max = i;
                }
            }
            i++;
        }
        String result = new String();
        for (int j = 2; j <= n; j++) {
            if (factors.containsKey(j))
            {
                temp = factors.get(j);
                if (temp == 1)
                {
                    result += "(" + j + ")";
                } else {
                    result += "(" + j + "**" + temp + ")";
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factors(7775460));
    }
}
