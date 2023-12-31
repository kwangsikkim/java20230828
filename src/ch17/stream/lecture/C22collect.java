package ch17.stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html");

        List<Integer> res1 = new ArrayList<>();
        for (String str : list) {
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1);

        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("res2 = " + res2);

        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(Collectors.toSet());

        System.out.println("res3 = " + res3);   // set은 중복 저장 x, 순서 보장 x

        Map<String, Integer> res4 = list.stream()
                .collect(Collectors.toMap(x -> x, String::length));

        System.out.println("res4 = " + res4);

        Map<String, Integer> res5 = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("res5 = " + res5);
    }
}


















