package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 1000, 5, 100, 200);

        Integer ans = list.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(ans);

        // same using method reference
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);

        Integer integer = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(integer);

        Integer integer1 = list.stream().reduce((a, b) -> a > b ? a : b).get();
        System.out.println(integer1);
    }
}
