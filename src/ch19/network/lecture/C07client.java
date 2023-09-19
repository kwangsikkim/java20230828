package ch19.network.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class C07client {
    public static void main(String[] args) {
        // server 가 client 에게 파일 보내기
        try {
            Socket socket = new Socket("172.30.1.81", 5000);

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);


            String path = "C:/Temp/test-server.jpg";
            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try(bos; fos; bis; is; socket) {
                byte[] bytes = new byte[1024];
                int len = 0;

                while ((len = bis.read(bytes)) !=-1) {
                    bos.write(bytes, 0, len);
                }
                bos.flush();
                System.out.println("다 받음");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
