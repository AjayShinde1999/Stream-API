package string_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> collect = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
