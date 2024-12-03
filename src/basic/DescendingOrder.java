package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> desc1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc1);

        List<Integer> desc2 = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(desc2);

        List<Integer> desc3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc3);
    }
}
