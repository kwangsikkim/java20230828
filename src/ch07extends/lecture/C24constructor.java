package ch07extends.lecture;

public class C24constructor {

}
class MyClass24{
    int age;

    // 파라미터 있는 생성자 작성하면,
    // 파라미터 없는 생성자 (기본 생성자, 0-args-constructor)
    // 자동으로 생성되지 않는다
    MyClass24(int age){
        this.age = age;
    }
}
class MySubClass241 extends MyClass24{
        MySubClass241(){
       // super();    // 자동으로 생성되지 않는다.

            // 명시적으로 상위 클래스의 생성자 호출 코드를 작성해야함.
            super(30);
    }
}