package ch18io.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(file)){
            byte[] b = new byte[3];
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));   // 65, 66, 67

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));   // 68. 69, 65

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));   // 66. 67, 67

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
            // 68 이후에는 없어서 나머지 두 바이트는 건드리지 않고 이전 값이 남아 있음  67, 67

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
