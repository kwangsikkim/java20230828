package ch07extends.lecture;

public class C21constructor {
    public static void main(String[] args) {
        MyClass21 o1 = new MyClass21(30);
        o1.printAge();

        MyClass21 o2 = new MyClass21(50);
        o2.printAge();

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));

    }
}
class MyClass21{
    private int age;

    // 생성자 : 인스턴스 만들 때 처음 해야하는 일(코드) 작성
    // 주로 필드 초기화 코드 작성
    MyClass21(int age){
        this.age = age;
    }
    public void printAge(){
        System.out.println("age = "+age);
    }
}
