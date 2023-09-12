package ch17.stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring");
        Stream<String> stream = list.stream();

        stream.count();

        stream.count();     // 안됨
        // 최종 연산이 끝난 stream을 재사용 할 수 없음.

        System.out.println("프로그램 실행 중....");


        Stream<String> stream1 = list.stream();
        stream1.count();
    }
}
