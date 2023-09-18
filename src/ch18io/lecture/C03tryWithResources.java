package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03tryWithResources {

    public void method1() {
        OutputStream os =null;                  // 3. 그래서 여기서 선언
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

//            os.close();         // 1. io stream 을 꼭 닫아야 함!!
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();            // 2. 그래서 이 곳으로 이동. 하지만 try블록 안의 변수라 여기서 이용 안됨
                                        // 4. 그래도 close에 checked exception 발생 그래서 try/catch 생성
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method2() {
        try(OutputStream os = new FileOutputStream("")) {
                                // 위의 과정을 간단하게 한
                                // try-with-resource 문법
                                // 변수의 타입은 AutoCloseable 이어야 함
          os.write(33);
          os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method3() {
        try(
        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");
        ){
        fos.write(234);
        fis.read();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void method4(){
        Scanner scanner = new Scanner("");
        try (scanner) {         // 값을 한번만 할당했을 때는 변수를 넣는 것도 가능.
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try (fio;fos;) {

                fio.read();
                fos.write(33);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void method6() throws IOException {
        // 안좋은 코드임...

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}





























