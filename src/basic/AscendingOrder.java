package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);

        List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
        System.out.println(asc);
    }
}
