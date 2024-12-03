package practice;


import java.util.*;
import java.util.stream.Collectors;


public class Demo {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("my", "name", "is", "my", "name", "ajay");
//
//        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//        System.out.println(collect);

        List<String> list = Arrays.asList("my name is my name ajay");
        Map<String, Long> collect = Arrays.stream(list.get(0).split(" "))  // Split the sentence into words
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(collect);
    }
}
