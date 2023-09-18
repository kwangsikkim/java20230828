package ch18io.book.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        try {
            // 문자 기반 출력 스트림 생성
            Writer writer = new FileWriter("C:/Temp/test.txt");

            // 1 문자씩 출력
            char a = 'A';
            writer.write(a);

            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
