package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("kangin");
        set.add("min jae");

        set.forEach(System.out::println);       //  넣은 반대 순서로 나옴..

        System.out.println("시간이 흐르고");

        set.forEach(System.out::println);       // 순서가 같다는 보장이 없음..
    }
}
