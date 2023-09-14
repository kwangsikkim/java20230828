package ch11exception.lecture;

import org.junit.platform.engine.discovery.ClassSelector;

public class C17checked {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
