package STREAMS_1;

import java.util.Arrays;
import java.util.List;

public class PrintMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 500, 10, 20, 20, 40, 50);

        Integer integer = list.stream().reduce((a, b) -> a < b ? a : b).get();
        System.out.println(integer);

        Integer min = list.stream().sorted().findFirst().get();
        System.out.println(min);
    }
}
