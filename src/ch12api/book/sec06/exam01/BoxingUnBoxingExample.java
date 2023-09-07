package ch12api.book.sec06.exam01;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());
        // intValue() 메소드는 Integer 객체 내부늬 int 값을 리턴

        // Unboxing
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 Ubboxing
        int result = obj + 100;
        System.out.println("result: " + result);


    }
}
