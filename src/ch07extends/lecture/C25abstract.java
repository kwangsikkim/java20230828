package ch07extends.lecture;

public class C25abstract {
    public static void main(String[] args) {
        Dog25 d1 = new Dog25();
        Cat25 c1 = new Cat25();

        Animal25 a1 = d1;
        Animal25 a2 = c1;

        //Animal25 a3 = new Animal25(); // 안되게 하고싶음

    }
}
// 추상 클래스(abstract class)로 인스턴스 생성 불가!
abstract class  Animal25{
    // 필드, 생성자, 메소드 등 모두 가능.
    // 인스턴스 생성만 불가
}
class Dog25 extends Animal25 {

}

class Cat25 extends Animal25{

}
