package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 = new MySubClass091();
        // 09타입으로 091 객체 생성 가능
        o1.method1();


        // anonymous class (익명 크래스)
        MyClass09 o2 = new  MyClass09(){
            // 자식 클래스의 몸통이 되는 부분
            // 바로 몸통을 붙여서 만듦
            // 이미 인스턴스에 만들었기 때문에 field, method 생성 가능
            // 생성자는 불가능

            // 클래스 상속과 인스턴스 생성을 동시에 진행했기 때문에,
            // 자식 클래스에 이름이 없고, 생성자 만들기가 불가능.
            void method1(){
                System.out.println("C09anonymous.method1");
            }
        };
        o2.method1();
    }
}
class MyClass09 {
    void method1(){
        System.out.println("MyClass09.method1");
    }
}
class MySubClass091 extends MyClass09 {
    // 이름이 있는 091이 09를 상속받음
    @Override
    void method1(){
        System.out.println("MySubClass091.method1");
    }
}
