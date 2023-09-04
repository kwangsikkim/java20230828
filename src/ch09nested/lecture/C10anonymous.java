package ch09nested.lecture;

public class C10anonymous {
    public static void main(String[] args) {
//        MyClass10 o1 = new MyClass10(); // 추상 클래스로는 인스턴스를 만들 수 없다.

        MyClass10 o2 = new MySubClass101();
        MyClass10 o3 = new MyClass10(){

        };

    }
}

abstract class MyClass10 {
    // 추상 클래스로는 인스턴스를 만들 수 없다.
}
class  MySubClass101 extends MyClass10 {

}
