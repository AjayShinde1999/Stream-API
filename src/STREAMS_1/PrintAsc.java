package STREAMS_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAsc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 50, 10, 20, 20, 40, 50);

        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
