package ch09nested.lecture;

public class C01nested {
    public static void main(String[] args) {
        // 외부 클래스 밖에서 쓸 떄.
//        MyClass01.NestedClass01 o1 = new MyClass01.NestedClass01(); // 안됨
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();   //  이렇게 먼저 외부 클래스 객체를 통해 사용

    }
}
class MyClass01 {
    // 중첩 클래스
    // 외부 클래스 내에서만 사용할 목적으로 만듦 (외부 클래스 밖에서도 사용 가능하긴 함)

    class NestedClass01{
        // 필드

        // 생성자

        // 메소드
    }
    void method1(){
        // 외부 클래스 내에서 사용할 떄
        NestedClass01 o1 = new NestedClass01();
    }
}
