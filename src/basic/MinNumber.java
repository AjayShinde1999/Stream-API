package basic;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 1000, 5, 100,200);

        Integer ans = list.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(ans);

        // same using method reference
        Integer min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);

        Integer integer = list.stream().sorted().findFirst().get();
        System.out.println(integer);
    }
}
