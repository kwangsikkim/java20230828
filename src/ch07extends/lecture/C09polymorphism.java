package ch07extends.lecture;

public class C09polymorphism {  //polymorphism : 다형성
    public static void main(String[] args) {
        MySubClass091 o1 = new MySubClass091();
        MyClass09 o2 = o1;  // 자식 클래스는 부모 클래스 타입에 할당하는 것이 가능

//        String o3 = o3;       안됨
//        MyClass08 04 = o1;    안됨
        MyClass09 o3 = new MyClass09();

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));
        // o1과 o2 참조값은 같고, o3 만 다르다.

        o1.method1();   // 변수의 타입과 관계없이 실제 인스턴스의 메소드 실행
        o2.method1();   // 실제 인스턴스의 메소드 실행
        o3.method1();
    }
}

class MyClass09 {
//    MySubClass091 o5 = o3;   안됨
    void method1(){
        System.out.println("부모 메소드");
    }
}

class MySubClass091 extends MyClass09{
    @Override
    void method1(){
        System.out.println("자식 메소드");
    }
}
