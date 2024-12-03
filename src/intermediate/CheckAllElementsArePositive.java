package intermediate;

import java.util.Arrays;
import java.util.List;

public class CheckAllElementsArePositive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, -1, 7, 9);

        boolean result = numbers.stream().allMatch(n -> n > 0);
        System.out.println(result);
    }
}
