package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("Spring");
        set.add("css");

        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item = " + item);
            iterator.remove();

        }


//        for (String elem : set) {
//            // 반복문 사용 중, collection item 삭제 시,
//            // exception 발생 할 수 있음..
//            System.out.println("elem = " + elem);
//            if (elem.equals("css")){
//                set.remove("css");
//            }
//        }

    }
}
