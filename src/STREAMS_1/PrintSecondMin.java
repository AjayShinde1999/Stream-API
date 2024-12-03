package STREAMS_1;

import java.util.Arrays;
import java.util.List;

public class PrintSecondMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 500, 10, 20, 20, 40, 50);

        Integer secondMin = list.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondMin);
    }
}
