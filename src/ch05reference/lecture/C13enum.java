package ch05reference.lecture;

public class C13enum {
    public static void main(String[] args) {
        MyEnum v1 = MyEnum.VALUE1;
        MyEnum v2 = MyEnum.VALUE2;
        MyEnum v3 = MyEnum.VALUE3;
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.VALUE3;
        // MyEnum으로 만들 수 있는 객체는 딱 4개로 한정

        // 참조 타입은 equals 비교를 해야하지만
        // enum 은 값이 한정되어 있기에, == 비교도 무관함!

        System.out.println("(v1==v2) = " + (v1==v2));
        System.out.println("(v1==v2) = " + (v1==v4));
        System.out.println("(v3==v5) = " + (v3==v5));

        System.out.println("v1.equals(v2) = " + v1.equals(v2));
        System.out.println("v3.equals(v5) = " + v3.equals(v5));
    }

}

enum MyEnum {
    // 콤마로 구분한 값 나열
    // 값의 이름 작성 관습 : UPPER_SNAKE_CASE
    VALUE1,
    VALUE2,
    VALUE3,
    MY_FIRST_VALUE

}
