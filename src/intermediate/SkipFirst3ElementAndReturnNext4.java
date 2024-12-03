package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirst3ElementAndReturnNext4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = numbers.stream().skip(3).limit(4).collect(Collectors.toList());
        System.out.println(collect);
    }
}
