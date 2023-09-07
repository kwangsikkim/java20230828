package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i);
        Object k = j;       // 가능

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7;


        int s = 30; //  4byte
        long t = s;   // 8byte. 가능

        Integer u = 300;
//        Long v = u; // 안됨. 왜? 다형성 때문

        float w = 3.14f;
        double x = w; // 가능

        Float y = 3.14f;
//        Double z = y;  // 안됨.


    }
}
