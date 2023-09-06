package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        // String : 문자열
        String a = "java";
        String b = "java";
        String c = new String("java"); // 참조값이 다름

        System.out.println(a == b);     // true
        System.out.println(a == c);     // false

        System.out.println(a.equals(b));    // true
        System.out.println(a.equals(c));    // true  문자열 비교!

    }
}
