package ch19.network.lecture;

import java.io.*;
import java.net.Socket;

public class C10client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.81", 7000);
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(writer);

            try (socket; writer; bw) {
                bw.write("바위");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

