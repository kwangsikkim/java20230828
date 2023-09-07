package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {

    // wrapper class : 기본 타입을 감싸고 있는 클래스

    // 기본타입 : byte, short, int, long, float, double, char, boolean
    // wrapper class : Byte, Short, Integer, Long, Float, Character, Boolean

    // boxing: 기본타입 -> 참조타입 변환
    // unboxing: 참조타입 -> 기본타입 변환

        // boxing
    int i = 500;
    Integer j = new Integer(i);     // Deprecated, for removal 사용 중단된 방법
    Integer k = Integer.valueOf(i);     // 권장된 방법

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


        // unboxing
    Integer l = Integer.valueOf(1000);
    int m = l.intValue();

        System.out.println(l);
        System.out.println(m);

        // auto boxing
        int n = 777;
//        Integer o = Integer.valueOf(n);  이라고 하던 것을
        Integer o = n;  // auto boxing

        // auto unboxing
        Integer p = Integer.valueOf(888);
        int q = p;

    }
}
