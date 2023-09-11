package ch15collection.lecture;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C11equals {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");

        System.out.println("set.size() = " + set.size());  // 1

        Set<MyClass11> set2 = new HashSet<>();
        set2.add(new MyClass11("홍길동"));
        set2.add(new MyClass11("홍길동"));
        System.out.println("set2.size() = " + set2.size());     // 2(equals, hashcode 재정의 전) 후는 1

    }

}
class MyClass11 {
    private String name;
    public  MyClass11(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass11 myClass11 = (MyClass11) o;

        return Objects.equals(name, myClass11.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
