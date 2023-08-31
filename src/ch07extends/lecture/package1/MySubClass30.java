package ch07extends.lecture.package1;

import ch07extends.lecture.MyClass30;

public class MySubClass30 extends MyClass30 {
    public void someMethod(){
        super.publicMethod();   // 됨
        super.protectedMethod();    // 됨
//        super.packagePrivateMethod();  // 안됨
//        super.privateMethod();    // 안됨
    }
}
