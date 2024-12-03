package string_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, sort them in alphabetical order and collect them into a new list.
public class SortAndCollectIntoList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "cat", "elephant", "dog");

        List<String> collect = words.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
