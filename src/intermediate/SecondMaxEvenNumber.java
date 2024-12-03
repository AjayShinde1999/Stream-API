package intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMaxEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer integer = numbers.stream().filter(n -> n % 2 == 0).sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);
    }
}
