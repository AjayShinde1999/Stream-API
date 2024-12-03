package string_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoLists {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana");
        List<String> list2 = Arrays.asList("cherry", "date");

        List<String> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
