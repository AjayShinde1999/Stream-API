package STREAMS_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDesc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 500, 10, 20, 20, 40, 50);

        List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
