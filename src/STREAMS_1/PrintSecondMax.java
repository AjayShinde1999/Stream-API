package STREAMS_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintSecondMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 500, 10, 20, 20, 40, 50);

        Integer secondMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
    }
}
