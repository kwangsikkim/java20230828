package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
    MySubClass021 o1 = new MySubClass021();
    o1.name = "spring";
    o1.method03();
    }
}
//위 코드에 문법오류가 없도록 MyClass02를 작성

class MyClass02 {
    String name;

    void method03() {
        System.out.println("MyClass02.method03");
    }
}
class MySubClass021 extends MyClass02{

}
