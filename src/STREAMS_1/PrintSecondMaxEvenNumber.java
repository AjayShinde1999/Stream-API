package STREAMS_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintSecondMaxEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 2, 1, 4);

        Integer secondMaxEven = list.stream().filter(n -> n % 2 == 0).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMaxEven);

        int[] arr = {1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 2, 1, 4};

        Integer integer = Arrays.stream(arr).boxed().filter(n -> n % 2 == 0).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);
    }
}
