package STREAMS_1;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer integer = list.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a + b).get();
        System.out.println(integer);
    }
}
