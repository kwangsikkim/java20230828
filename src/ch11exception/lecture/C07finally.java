package ch11exception.lecture;

public class C07finally {
    public static void main(String[] args) {

        // 리턴 없고, 예외 발생 시 1,3,4,5
        // 리턴 없고, 예외 없을 시 1,2,4,5
        // 리턴 있고, 예외 발생 시 1,3,4,5
        // 리턴 없고, 예외 없을 시 1,2,4

        System.out.println("code...1");

        try {
            int j = 3 / 0;
            System.out.println("code...2");
            return;
        } catch (ArithmeticException e){

            System.out.println("code...3");
        } finally {
            System.out.println("code...4");
        }
            System.out.println("code...5");


//        System.out.println("code...");  // retrun 후에는 실행 될 수 없음.

    }
}
