package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (RuntimeException e) {
            // NullPointerException
            // ArithmeticException
            // 예외 처리
        }
//        catch (ClassCastException e) {
//            // ClassCastException
//            // 를 따로 처리하려 했는데...
              // try 블록의 작성 순서대로 catch하기 때문에 ClassCastException은 이미 잡힘..
//        }
    }
}
