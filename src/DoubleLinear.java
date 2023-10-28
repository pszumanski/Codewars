import java.util.SortedSet;
import java.util.TreeSet;


public class DoubleLinear {

    public static void main(String[] args) {
        System.out.println(dblLinear(50));
    }
    public static int dblLinear (int n) {
//        List<Integer> sequence = new ArrayList<>();
//        sequence.add(1);
//        for (int i = 0; i < n; i++) {
//            sequence.add((sequence.get(i)) * 2 + 1);
//            sequence.add((sequence.get(i)) * 3 + 1);
//            sort(sequence.subList(i, Math.min(n, sequence.size())));
//        }
//        sequence = sequence.stream().distinct().collect(Collectors.toList());
//        sort(sequence);
//        System.out.println("searching for index: " + n + " found: " + sequence.get(n) + " S: "+sequence);
//        return sequence.get(n);
        SortedSet<Integer> sequence = new TreeSet<>();
        sequence.add(1);
        for (int i = 0; i < n; i++) {
            sequence.add(sequence.first() * 2 + 1);
            sequence.add(sequence.first() * 3 + 1);
            sequence.remove(sequence.first());
        }
        //System.out.println(sequence.first());
        return sequence.first();
    }
}
