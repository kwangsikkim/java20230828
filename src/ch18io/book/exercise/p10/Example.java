package ch18io.book.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {

        Scanner scanner = new Scanner(System.in);

        System.out.print("원본 파일 경로: ");
        String original = scanner.nextLine();

        System.out.print("복사 파일 경로: ");
        String copy = scanner.nextLine();

        File originalFile = new File(original);
        if(!originalFile.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            System.exit(0);
        }

        File copyFile = new File(copy);
        File newFile = copyFile.getParentFile();
        if (!newFile.exists()){
            newFile.mkdirs();
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(original));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copy));

//        InputStream is = new FileInputStream(original);
//        OutputStream os = new FileOutputStream(copy);

        byte[] data = new byte[10000];
        int num = -1;
        while (true) {
            num = bis.read(data);
            if(num == -1){
                break;
            }
            bos.write(data, 0, num);
        }
        System.out.println("복사가 성공했습니다.");

        bis.close();
        bos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
//        is.close();
//        os.close();
    }
}
