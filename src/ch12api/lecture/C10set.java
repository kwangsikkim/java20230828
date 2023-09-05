package ch12api.lecture;

import java.util.HashSet;

public class C10set {
    public static void main(String[] args) {
        // set : 집합
        HashSet set = new HashSet();
        set.add(new Object());
        set.add(new Object());

        System.out.println(set.size()); // 2

        set.add(new String("java"));

        System.out.println(set.size()); // 3

        set.add(new String("java"));    // 같은 객체이기 때문에 들어가지 않음.

        System.out.println(set.size()); // 3
    }
}
