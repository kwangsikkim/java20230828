package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {


    // List : 순서가 있음, 중봉된 element(원소) 저장 가능
    List<String> list = new ArrayList<>();

    // element 추가
    list.add("java");
    list.add("spring");
    list.add("css");
    list.add("react");

    // element 꺼내기
    String s = list.get(0);
    String s1 = list.get(3);

        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

    // 몇개의 원소가 있는지?
    int size = list.size();
        System.out.println("size = " + size);


    list.add("react");
    list.add("css");

    System.out.println(list.size());

    // element 지우기
        list.remove("react");
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());
        // 같은 이름의 원소라면 앞부터 삭제

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        // 앞번호가 지워지면 순서대로 앞자리로 당겨짐


        // element 있는지 확인

        boolean contains = list.contains("java");
        boolean contains1 = list.contains("react");

        System.out.println("contains = " + contains);       // f
        System.out.println("contains1 = " + contains1);     // t

        // 전체 원소 탐색 (for)
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("향상된 for문 사용 전체 탐색");
        for(String item : list){
            System.out.println(item);
        }
        System.out.println("---------------------");
        System.out.println("foreach 메소드로 전체 탐색");
//        list.forEach((e -> System.out.println(e)));
        list.forEach((System.out::println));
    }
}