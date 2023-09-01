package ch09nested.lecture;

public class C07localClass {
        // 로컬 클래스 사용시 주의할 점

    void method(){
        // 로컬 클래스에서 사용되는
        // 감싸고 있는 메소드의 지역변수는
        // 값을 변경할 수 없다. (즉, final 이어야 한다.)
        int value = 0; // 안써도 final(effectively final)

        class LocalClass{
            void method1(){
                // 로컬클래스에서 외부 클래스의 지역변수를 사용
                System.out.println(value);
            }

        }
    }
    void method2(int param){
        // 파라미터가 local class에서 사용되면
        // 파라미터의 값을 변경할 수 없다.

        class LocalClass{
            void method(){
                System.out.println(param);
            }
        }
    }
}
