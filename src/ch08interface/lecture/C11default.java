package ch08interface.lecture;

public class C11default {
    public static void main(String[] args) {
        MyInterface11 o1 = new MyClass111();
        MyInterface11 o2 = new MyClass112();

        o1.method1();
        o1.method2();
        System.out.println("--------");
        o2.method1();
        o2.method2();
    }

}

interface MyInterface11 {
    void method1(); // 몸통 없는 메소드
    default void method2(){
        // 몸통이 있는 instance 메소드 (static 아님, 쓰지 않아도 public으로 생성)
        System.out.println("MyInterface11.method2");
    }
}

class MyClass111 implements MyInterface11{
    @Override
    public void method1() {
        System.out.println("MyClass111.method1");
    }
    public void method2(){
        System.out.println("MyClass111.method2");
        // 필요하다면 default 메소드도 재정의가 가능함.
    }
}
class  MyClass112 implements MyInterface11{
    @Override
    public void method1() {
        System.out.println("MyClass112.method1");
    }
}