package ch17.stream.book.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(m -> m.getJob()));

        System.out.println("[개발자]");
        groupingMap.get("개발자").forEach(System.out::println);

        System.out.println("[디자이너]");
        groupingMap.get("디자이너").forEach(System.out::println);


        System.out.println("개발자");
        list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .toList()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("디자이너");
        list.stream()
                .filter(m -> m.getJob().equals("디자이너"))
                .toList()
                .forEach(System.out::println);

    }
}
