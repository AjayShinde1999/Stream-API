package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMaxNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 1000, 5, 100,200);

        Integer secondMax = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
    }
}
