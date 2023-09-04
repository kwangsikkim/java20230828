package ch16lambda.lecture;

public class C03parameter {
    public static void main(String[] args) {
        MyInterface03 o1 = (int x, int y) -> {
            // 작성된 몸통
        };

        MyInterface03 o2 = (x, y) -> {
            // 몸통          ㄴ 파라미터 타입도 인터페이스에서 알 수 있으므로 생략가능.
        };
    }
}
@FunctionalInterface
interface MyInterface03{
    void method(int x, int y);
}
