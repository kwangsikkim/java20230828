package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C22throws {
   // public static void main(String[] args) throws SQLException, FileNotFoundException, ClassNotFoundException {

                                                // 여러 Exception 의 상위로 한번에 처리
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("", "", "");   //SQLException

        var input = new FileInputStream("");        // FileNotFoundException

        Class.forName("");    // ClassNotFoundException
    }
}
