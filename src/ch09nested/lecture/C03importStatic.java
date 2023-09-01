package ch09nested.lecture;
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class C03importStatic {
    public static void main(String[] args) {
        // 중첩 클래스와 관련 없이
        // 잠깐 다른 길로 빠짐...

        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        // .... 여러번 쓰기 불편하다면..
        // import 후에 가능
        double random4 = random();
        double random5 = random();
        double random6 = random();
        double random7 = random();
    }
}
