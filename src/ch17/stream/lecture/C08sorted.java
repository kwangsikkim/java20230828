package ch17.stream.lecture;

import java.util.List;
import java.util.Set;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(3, 1, 3, 4, 5, 10, 11, 0);
        list.stream()
                .sorted()           //   값을 정렬
                .forEach(System.out::println);



    }
}
