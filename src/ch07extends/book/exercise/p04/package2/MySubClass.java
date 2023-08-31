package ch07extends.book.exercise.p04.package2;

import ch07extends.book.exercise.p04.package1.MyClass;

public class MySubClass extends MyClass {
    @Override
    public void method1(){

    }

    @Override
    protected void method2(){

    }

    @Override
    public void method3(){      // 부모의 접근 제한보다 넓은 범위로는 가능. 하지만 좁은 범위로 강화는 안됨.

    }
}
