package ch11exception.lecture;

public class C05printStackTrace {
    public static void main(String[] args) {
        System.out.println("code.....1");

        try{
            int i =0;
            int j = 3 / i;                      // exception 발생해서 catch로 넘어가고
            System.out.println("code......2");
        } catch (ArithmeticException e) {
                                                // 실행 후  아래로 가는데 아무 것도 없으면 눈에 안보임..
            e.printStackTrace();                // 그래서 사용

        }
        System.out.println("code.....3");

    }
}
