package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c = "java";

        String s = (String) c;  // ok
        Object o = (Object) c;  // ok
        Serializable se = (Serializable) c; // ok
        Comparable co = (Comparable) c; // ok
        Constable con = (Constable) c;  // ok
        ConstantDesc cd = (ConstantDesc) c; // ok

        Number n = (Number) c;

        System.out.println("프로그램 종료");
    }
}
