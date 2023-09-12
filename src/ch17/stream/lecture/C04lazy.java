package ch17.stream.lecture;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class C04lazy {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println("중간 연산 실행 중....");
                return false;
            }
        })

        .count();
        System.out.println("프로그램 실행 중...");
    }
}
