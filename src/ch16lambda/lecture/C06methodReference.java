package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);

        // 파라미터로 받은 값이 메소드 호출로만 끝나는 것이라면
        // 메소드 참조
        MyInterface06 o2 = C06methodReference::someMethod;
        // 로 생략 가능.

//        MyInterface06 o2 = x -> someMethod(x);        // 위의 메소드 레퍼런스를 람다로 바꾼 것.


    }
    public static void someMethod(int x){

    }
}
interface MyInterface06{
    void  method(int a);
}
