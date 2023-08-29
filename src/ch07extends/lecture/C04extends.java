package ch07extends.lecture;

public class C04extends {
    public static void main(String[] args) {
        MySubClass041 o1 = new MySubClass041();
        o1.method1();
        o1.method2();

        MySybClass042 o2 = new MySybClass042();
        o2.method1();
        o2.method3();
    }

}

class MyClass04 {
    void method1(){
        System.out.println("MyClass04.method1");
    }
}

class MySubClass041 extends MyClass04{
    private int age;
    void method2(){
        System.out.println("MySubClass041.method2");
    }
}

class MySybClass042 extends MyClass04 {
    private String name;
    void method3(){
        System.out.println("MySybClass042.method3");
    }
}