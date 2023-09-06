package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
    // substring : 부분 문자열 추출

        String a = "spring";
        a.substring(0, 2);

        String sub1 = a.substring(0, 2);
        System.out.println(sub1);

        String sub2 = a.substring(2, 5);
        System.out.println(sub2);

        System.out.println(a.substring(2, 6));

        System.out.println(a.substring(2));
        System.out.println(a.substring(0));


    }
}