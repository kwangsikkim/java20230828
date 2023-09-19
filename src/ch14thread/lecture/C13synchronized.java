package ch14thread.lecture;

public class C13synchronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox box = new MyBox(0);
        Thread t1 = new Thread(new Task(box));
        t1.start();

        Thread t2 = new Thread(new Task(box));
        t2.start();

        t1.join();
        t2.join();
        System.out.println("box.getValue() = " + box.getValue());
    }
}

class Task implements Runnable {
    private MyBox box;

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
        box.increment();
        }
    }
}

class MyBox {
    private int value;

    // synchronized block
    public void increment(){
        synchronized (lock){    // 객체만 들어갈 수 있음
            value++;
        }
    }

    // monitor lock
    private Object lock = new Object();

    public MyBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
