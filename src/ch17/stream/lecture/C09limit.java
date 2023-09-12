package ch17.stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C09limit {
    public static void main(String[] args) {
        var list = List.of(3, 10, 9, 11, 1, 0, -3);

        list.stream()
                .limit(3)       // size 갯수 만큼 짤라냄
                .forEach(System.out::println);

        System.out.println("정렬 후 가장 작은 값 3개 출력");
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("앞에서 3개를 정렬 후 출력");
        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}