package ch07extends.book.sec08.exam02;

public class Taxi extends Vehicle{
    // 메소드 오버라이딩
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}
