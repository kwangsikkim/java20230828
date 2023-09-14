package ch17.stream.lecture;

import java.util.stream.IntStream;

public class C20primitive {
    public static void main(String[] args) {
        // 기본 타입 stream : IntStream, LongStream, DoubleStream
        // 참조 타입 stream : Stream<T>

        // 기본 타입 stream -> 참조 타입 stream
        // boxed 메소드
        Integer max = IntStream.of(3, 9, 1, 2, 7)
                .boxed()
                .max(Math::max)
                .get();

        System.out.println("max = " + max);

    }
}
