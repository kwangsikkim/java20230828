package ch07extends.book.sec06.package1;

public class B {            // A와 같은 패키지
    // 메소드 선언
    public void method(){
        A a = new A();      // 가능
        a.field = "value";  // 가능
        a.method();         // 가능
    }
}
