package ch07extends.lecture;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 33;
        o1.method1();

        MyCubClass011 o2 = new MyCubClass011();
        o2.age = 44;
        o2.method1();

    }
}

class MyCubClass011 extends MyClass01{
    // MyClass01의 멤버(field, method)를 상속함

}
class MyClass01{
    int age;

    void method1(){
        System.out.println("MyClass01.method1");
        System.out.println(age);
    }
}