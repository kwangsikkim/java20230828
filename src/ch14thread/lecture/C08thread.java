package ch14thread.lecture;

public class C08thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            for (int i=0; i<5; i++) {
                System.out.println("t1 thread");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            for (int i=0; i<5; i++) {
                System.out.println("t2 thread");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
