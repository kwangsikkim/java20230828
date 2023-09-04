package ch16lambda.book.sec03.exam01;

public class Person {
    public void action1(Workable workable) {
        workable.work("김기동", "감독");
    }

    public void action2(Speakable speakable) {
        speakable.speak("안녕하세요");
    }
}
