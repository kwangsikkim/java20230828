package ch07extends.lecture;

public class C14type {
    public static void main(String[] args) {
        // 기본타입
        int a = 3;
        double e = 3.14;


        // 참조타입
        String b = "java;";
        Object o = "java";

        Child c = new Child();
        Parent d = new Child();

    }
}
class Parent{

}
class Child extends Parent {

}