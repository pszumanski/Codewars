import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedWords {
    public static String reverseWords(final String original)
    {
        String result = "";
        char[] chars = original.toCharArray();
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                indexes.add(i);
            }
        }
        List<Character> temp = new ArrayList<Character>();
        for (int i = 0; i <= chars.length; i++) {
            if (i != chars.length && !indexes.contains(i)) {
                temp.add(chars[i]);
            } else {
                for (int j = 0; j < temp.size(); j++) {
                    chars[i - 1 - j] = temp.get(j);
                }
                temp.clear();
            }
            System.out.println(temp);
        }
        result = String.valueOf(chars);
        return result;
    }

    public static void main(String[] args) {
        reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god");
    }
}
