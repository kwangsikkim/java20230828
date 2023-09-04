package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        // lambda
        // (파라미터 목록) -> { 메소드 몸통}

        MyInterface02 o1 = () -> {
                System.out.println("C02lambda.method");
        };
        o1.method();

        // 메소드 몸통이 1줄일 경우, 중괄호까지 생략 가능!
        MyInterface02 o2 = () -> System.out.println("메소드 내 코드가 1줄임");
        o2.method();
    }
}
@FunctionalInterface
interface MyInterface02{
    // 파라미터 없는 메소드
    // 리턴 없음
    void method();
}
