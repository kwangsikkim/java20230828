package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {

        // sleep : 업무 흐름을 잠깐 멈췄다가 재개
        System.out.println("code1");
        Thread.sleep(1000);
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
