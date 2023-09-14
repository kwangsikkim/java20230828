package ch17.stream.book.exercise.p06;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        // 나이만 출력
        list.stream()
                .map(y -> y.getAge())
                .forEach(System.out::println);

        // 나이들의 합을 reduce로 구해서 출력
        Integer sum = list.stream()
                .map(x-> x.getAge())
                .reduce(0, (x, y) -> Integer.sum(x, y) );
        System.out.println("sum = " + sum);

        // 가장 많은 나이 reduce로 구해서 출력
        System.out.println("가장 많은 나이 출력");
        Integer max = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println("max = " + max);

        // 가장 적은 나이 reduce로 구해서 출력
        System.out.println("가장 적은 나이 출력");
        Integer min = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MAX_VALUE, (x, y) -> Math.min(x, y));
        System.out.println("min = " + min);

        // 평균 구하기
        System.out.println("평균 구하기");
        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);


    }
}












