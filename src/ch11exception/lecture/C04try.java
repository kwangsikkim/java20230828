package ch11exception.lecture;

public class C04try {
    public static void main(String[] args) {
        System.out.println("code....1");
        System.out.println("code....2");        // 실행

        try{

        int i = 0;
        int j = 0 / i;

        System.out.println("code....3");
        System.out.println("code....4");        // 실행 x

        }  catch (ArithmeticException e){

            System.out.println("exception code1");  // 실행
            System.out.println("exception code2");

        }

        System.out.println("code....5");        // 실행



    }
}
