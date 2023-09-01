package ch09nested.lecture;

public class C04access {
    // static 멤버는 instance 멤버에 접근할 수 없다.

    int instanceField;
    static int staticField;

    static class StaticNestedClass{
        void method1(){
            System.out.println(staticField);    // 가능
//            System.out.println(instanceField);  // 불가능
        }
    }

    class InnerClass {
        void method1(){
            System.out.println(instanceField);   //  접근 가능
            System.out.println(staticField);   //  접근 가능
        }
    }
}
