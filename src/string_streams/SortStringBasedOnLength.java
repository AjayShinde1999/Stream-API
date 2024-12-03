package string_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringBasedOnLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "cat", "elephant", "dog");
        List<String> collect = words.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
        System.out.println(collect);
    }
}
