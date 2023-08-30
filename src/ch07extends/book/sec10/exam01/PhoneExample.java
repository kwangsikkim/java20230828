package ch07extends.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();        // 추상 클래스의 인스턴스를 new 연산자로 직접 생성할 수 없음

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();                // Phone 의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff();               // Phone 의 메소드

        Phone phone = smartPhone;
        phone.turnOn();
        phone.turnOff();
//        phone.internetSearch();           // 사용 불가능
    }
}
