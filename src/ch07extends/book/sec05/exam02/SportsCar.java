package ch07extends.book.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp(){
        speed += 10;
    }

    // 오버라이딩 할 수 없음
//    public void stop(){
//        System.out.println("스포츠카 정차");
//        speed = 0;
//    }
}
