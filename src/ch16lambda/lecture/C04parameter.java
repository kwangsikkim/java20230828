package ch16lambda.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        // 파라미터가 1개 일때

        MyInterface04 o1 = (int x) -> {
            //몸통
        };

        MyInterface04 o2 = (x) -> {
            //몸통. 타입 생략가능
        };

        MyInterface04 o3 = x -> {
            //몸통.  파라미터가 1개면 둥근 괄호도 생략 가능하다.
        };

        List<String> list = List.of("java", "spring", "css", "html");
        list.forEach(e -> System.out.println(e));

        int[] arr = {10, 20, 40, 100, 200, 300};
        Arrays.stream(arr).forEach(e -> System.out.println(e));
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }
}
interface MyInterface04 {
    void method(int x);
}
