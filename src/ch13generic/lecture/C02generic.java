package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();     // 이때, T 가 Object로 결정
        MyClass02<String> o2 = new MyClass02<String>();     // 이때, T 가 String으로 결정
        MyClass02<Integer> o3 = new MyClass02<Integer>();     // 이때, T 가 Integer으로 결정
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();     // 이때, T 가 Boolean으로 결정
        // 참조타입만 가능

//        MyClass02<int> o5 = new MyClass02<int>();         // 안됨

        MyClass02<Object> o6 = new MyClass02<>();
        MyClass02<String> o7 = new MyClass02<>();
        MyClass02<Integer> o8 = new MyClass02<>();
        MyClass02<Boolean> o9 = new MyClass02<>();      //  뒤 <> 는 생략 가능
    }
}
class MyClass02<T> {    // <T> : 타입 파라미터. 아직 결정이 안된 T라는 타입을 일단 쓰겠다.
    private T a;
}