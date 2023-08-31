package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.A;

public class D extends A {          // A와 다른 패키지, 상속
    // 생성자 선언
    public D(){
        // A()생성자 호출
        super();        // 가능
    }

    // 메소드 선언
    public void method(){
        // A 필드값 변경
        this.field = "value";   // 가능
        // A 메소드 호출
        this.method();          // 가능
                // 상속을 통해서는 사용 가능
    }

    // 메소드 선언
    public void method2(){
//        A a = "value"; = new A(); // 불가능
//        a.field = "value";        // 불가능
//        a.method();               // 불가능
                //  직접 메소드 생성해서 사용하는 것은 불가능
    }
}
