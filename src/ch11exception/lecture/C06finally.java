package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        // exception 발생 시 : 1 -> 3 -> 4
        // exception 발생 안할 시 : 1 -> 2 -> 4
        // finally 추가시, exception 발생 안할 시 : 1 -> 2 -> 꼭 -> 4
        // finally 추가시, exception 발생 시 : 1 -> 3 -> 꼭 -> 4

        System.out.println("code.....1");

        try{
            int i = 0;
            int j = 3 / i;
            System.out.println("code......2");
        } catch (ArithmeticException e) {
            System.out.println("code.....3");

        } finally {
            // finally block
            // exception 발생과 관계없이 실행되는 block
            System.out.println("꼭 실행되는 코드");

        }
        System.out.println("code.....4");
    }
}
