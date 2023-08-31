package ch08interface.book.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle = new Bus();

        // 인터페이스를 통해 호출
        vehicle.run();
//        vehicle.checkFare();    // 안됨

        // 강제 타입 면환 후 호춯
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
