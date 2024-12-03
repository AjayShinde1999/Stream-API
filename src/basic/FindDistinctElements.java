package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 2, 5, 6);

        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
