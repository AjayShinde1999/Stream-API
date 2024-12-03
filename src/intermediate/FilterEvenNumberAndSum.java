package intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumberAndSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // approach 1
        Integer sum = numbers.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a + b).get();
        System.out.println(sum);

        // approach 2
        int sum1 = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);


    }
}
