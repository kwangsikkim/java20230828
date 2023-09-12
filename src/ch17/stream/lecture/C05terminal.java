package ch17.stream.lecture;

import java.util.List;

public class C05terminal {
    public static void main(String[] args) {
        List<String> list = List.of("css", "html", "spring");
        list.stream();
        long count = list.stream()
                .count();

        System.out.println("count = " + count);
        System.out.println("list.size() : " + list.size());
    }
}
