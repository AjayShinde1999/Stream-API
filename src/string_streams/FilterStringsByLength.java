package string_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "cat", "elephant", "dog");

        List<String> collect = words.stream().filter(word -> word.length() > 4).collect(Collectors.toList());
        System.out.println(collect);
    }
}
