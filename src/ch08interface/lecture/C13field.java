package ch08interface.lecture;

public class C13field {
    public static void main(String[] args) {

        // public static final 이므로 바로 접근해서 사용 가능
        System.out.println(MyInterface13.VALUE);
        System.out.println(MyInterface13.NAME);
        System.out.println(MyInterface13.HOME_ADDRESS);
    }

}
interface MyInterface13 {
    int VALUE = 30;     // public static final (자동으로)
    public static final String NAME = "java";

    String HOME_ADDRESS = "seoul";       // public static final

    // 상수명은 대문자로 쓰는 것이 불문율
}
