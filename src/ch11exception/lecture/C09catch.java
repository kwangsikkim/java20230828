package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {

        try {

        int[] arr = {1, 0,};
        int i = 3 /arr[2];

            System.out.println("try 내의 흐름");

            // try block에서
            // 여러 exception 이 발생 할 수 있으면
            // arr[1] 이면 ArithmeticException
            // arr[2] 면 IndexOutOfBoundsException 발생..
            // 이땐, 여러 catch 블럭을 작성하면 됨
        } catch (ArithmeticException e) {
            System.out.println("잘못된 산술 연산");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 참조");
            e.printStackTrace();
        }

        System.out.println("실행 흐름 이어감...");
    }
}
