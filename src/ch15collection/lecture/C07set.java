package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        // Set : 객체(원소, 요소)를 담고 있는 객체
        // 특징 : 중복된 element를 저장하지 않는다

        Set<String> set1 = new HashSet<>();

        //  add : 원소 추가
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        // size : 원소의 갯수
        System.out.println(set1.size());        //  중복 허용 안하므로 3

        // contains : 있는지 확인
        System.out.println(set1.contains("java"));      // t
        System.out.println(set1.contains("html"));      // f

        // remove : 삭제
        set1.remove("java");
        boolean remove2 = set1.remove("html");
        System.out.println("remove2 = " + remove2); // 없는거 삭제한다하면 boolean->fasle 리턴.
        

        System.out.println(set1.size());    // 2

        // of : 새로운 수정불가 set 객체 생성
        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java");       // 안된다


        // 전체 탐색
        // 향상된 for문
        System.out.println("향상된 for문");
        for(String str : set2) {
            System.out.println(str);        //  넣은 순서대로 안나오고 반대로 나옴
        }

        // forEach
        System.out.println("forEach 사용");
//        set2.forEach(item -> System.out.println(item));
        // 또는
        set2.forEach(System.out::println);

    }
}
