import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreInSorted {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(new String[]{"live", "arp", "cow"}, new String[]{"alive", "sharp"})));
    }
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> array3 = new ArrayList<>();
        for (String i: array1) {
            for (String j: array2) {
                if (j.contains(i)) {
                    array3.add(i);
                    break;
                }
            }
        }
        array3.sort(null);
        return array3.toArray(new String[0]);
    }
}
