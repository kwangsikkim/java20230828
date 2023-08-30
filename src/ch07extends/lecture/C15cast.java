package ch07extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        System.out.println("프로그램 실행 시작!");
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1;      // 된다
        Cat15 c1 = (Cat15) ani2;      // 된다

        System.out.println("프로그램 실행 계속 됨...");

        // 강제 형 변환
//        Cat15 c2 = (Cat15) ani1;      // 안된다. 문법 오류는 아니지만.. 실행이 안됨..
//        Dog15 d2 = (Dog15) ani2;      // 안된다. 문법 오류는 아니지만.. 실행이 안됨..

        Animal15 ani3 = new Animal15();
//        Dog15 d3 = (Dog15) ani3;      // 안된다. 문법 오류는 아니지만.. 실행이 안됨..
//        Cat15 c3 = (Cat15) ani3;      // 안된다. 문법 오류는 아니지만.. 실행이 안됨..
    }
}

class Animal15{}
class Dog15 extends Animal15{}
class Cat15 extends Animal15{}