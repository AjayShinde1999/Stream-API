package basic;

import java.util.Arrays;
import java.util.List;

public class SecondMinNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 1000, 5, 100,200);

        Integer secondMin = list.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondMin);
    }
}
