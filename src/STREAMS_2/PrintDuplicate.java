package STREAMS_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 7, 8, 9);

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);

        Set<Integer> duplicate = collect.entrySet().stream().filter(n -> n.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(duplicate);
    }
}
