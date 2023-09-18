package ch18io.book.sec03.exam01;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/Temp/test1.db");

            while (true) {
                int data = is.read();  //1바이트씩 읽기
                if(data == -1) {
                    break;
                }
                System.out.println(data);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
