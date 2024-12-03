package intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 2, 3, 6, 6, 6);

        Set<Integer> collect = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
