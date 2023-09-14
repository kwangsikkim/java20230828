package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16checked {
    public static void main(String[] args) {
        try {
            var input  = new FileInputStream("file");
            // checked exception 은
            // 예외 처리 코드 꼭 작성
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
