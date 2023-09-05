package ch12api.lecture;

public class C06hashcode {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1 == o2);       // false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1 == o3);       // false
        System.out.println(o1.hashCode());  // 하지만
        System.out.println(o3.hashCode());  // 둘은 같은 해시코드값을 가짐..
                                            // 문자열의 길이가 같고, 각 문자열의 나열이 같으면 객체의 해시코드가 같음.

        Object o4 = o1;
        Object o5 = o3;

        System.out.println(o4.hashCode());
        System.out.println(o5.hashCode());      // 이 둘도 모두 같음.

    }
}
