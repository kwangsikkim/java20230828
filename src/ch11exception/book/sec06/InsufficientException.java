package ch11exception.book.sec06;

public class InsufficientException extends Exception{   // 일반 예외로 선언
    public InsufficientException() {                    // 두개의 생성자 선언

    }

    public InsufficientException(String message) {      // 두개의 생성자 선언
        super(message);
    }
}
