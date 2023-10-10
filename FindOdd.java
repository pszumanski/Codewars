import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (counter.containsKey(a[i])) {
                counter.put(a[i], counter.get(a[i]) + 1);
            } else {
                counter.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> i: counter.entrySet()) {
            if (i.getValue() % 2 != 0)
            {
                return i.getKey();
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }
}