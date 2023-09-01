package ch09nested.lecture;

public class C02staticNested {
    public static void main(String[] args) {
        // static 내부 클래스는 외부클래스 객체 생성없이 내부클래스 객체 생성 가능
        MyClass02.NestedClass02 o1 = new MyClass02.NestedClass02();
    }

}
class MyClass02{
    static class NestedClass02{
        // 필드, 생성자, 메소드 가능
    }
    void method1(){
        NestedClass02 o2 = new NestedClass02();
    }
}
