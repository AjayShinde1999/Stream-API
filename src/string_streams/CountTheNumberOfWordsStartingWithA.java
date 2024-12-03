package string_streams;

import java.util.Arrays;
import java.util.List;

public class CountTheNumberOfWordsStartingWithA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "avocado", "banana", "apricot", "mango");

        long result = words.stream().filter(word -> word.toUpperCase().startsWith("A")).count();
        System.out.println(result);
    }
}
