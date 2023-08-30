package ch07extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();

        Animal26 a2 = new Fish26();
        a2.breath();
    }
}

abstract class Animal26{            // 추상메소드를 가진 클래스는 무조건 추상 클래스가 되어야 함
    abstract public void breath();   // 추상 메소드 : 몸통이 없는 메소드
}

class Dog26 extends Animal26{
    // 추상메소드를 부모삼은 자식클래스가 인스턴스를 사용하기 위해서는 추상메소드를 꼭 재정의 해야함
    @Override
    public void breath(){
        System.out.println("폐 호흡");
    }
}
class Fish26 extends Animal26{
    @Override
    public void breath(){
        System.out.println("아가미 호흡");
    }
}
