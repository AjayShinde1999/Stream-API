package intermediate;

import java.util.Arrays;
import java.util.List;

public class FindTheFirstElementDivisibleBy3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 12, 17, 24, 35);

        Integer integer = numbers.stream().filter(n -> n % 3 == 0).findFirst().get();
        System.out.println(integer);
    }
}
