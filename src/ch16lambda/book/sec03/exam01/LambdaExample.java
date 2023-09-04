package ch16lambda.book.sec03.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 매개 변수가 두 개일 경우
        person.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

        // 매개 변수가 한개일 경우
        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });

        person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
    }
}
class MySpeakable implements Speakable {
    @Override
    public void speak(String fuck) {
        System.out.println(fuck + "라고 소리칩니다.");
    }
    //fuck 부분에 아무거나 써도 되기 때문에 16줄에 content가 word로 바뀌어 있음. 무엇으로 바뀌어도 상관 없음.
}