package ch16lambda.book.sec05.exam01;

public class Person {
    public void action(Calcuable calcucable) {
        double result = calcucable.calc(10, 4);
        System.out.println("result = " + result);
    }
}
