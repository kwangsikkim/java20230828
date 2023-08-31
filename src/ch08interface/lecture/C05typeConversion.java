package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.concurrent.atomic.AtomicInteger;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        Number n = i;
        Comparable<Integer> ci = i;
        Constable c = i;
        ConstantDesc cd = i;

        Object o = i;
        Serializable s = i;



    }
}
