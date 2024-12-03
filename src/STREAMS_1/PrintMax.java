package STREAMS_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 500, 10, 20, 20, 40, 50);

        Integer integer = list.stream().max(Integer::compareTo).get();
        System.out.println(integer);

        Integer integer1 = list.stream().reduce((a, b) -> a > b ? a : b).get();
        System.out.println(integer1);

        Integer max = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);

    }
}
