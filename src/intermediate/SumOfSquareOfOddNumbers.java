package intermediate;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        Integer integer = numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce((a, b) -> a + b).get();
        System.out.println(integer);

        Integer integer1 = numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(Integer::sum).get();
        System.out.println(integer1);
    }
}
