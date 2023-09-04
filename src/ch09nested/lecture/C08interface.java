package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface{
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
                c.method2();
    }
}

class MyClass081 implements MyClass08.NestedInterface{
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}
class MyClass08{            // 클래스 내부에 인터페이스 생성 가능
   public static interface NestedInterface{     // 안써도 public static
        // public final static field
        // public abstract instance method (****** 중요)
        // private instance method
        // default instance method
        // public static method
        // private static method

        void method2();         // 추상메소드
    }

    void method1(){
        // 메소드 내부에 클래스 선언
        class ConcreteClass implements NestedInterface{
            @Override
            public void method2() {
                // 오버라이딩
            }
        }

        // 인스턴스 생성
        ConcreteClass c = new ConcreteClass();
    }
}