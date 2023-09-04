package ch16lambda.book.sec01.exam01;

public class LambdaExample {
    public static void main(String[] args) {
//        action(new Calculable() {
//            @Override
//            public void calculate(int x, int y) {
//                int result = x + y;
//                System.out.println("result: " + result);
//            }
//        });
        //  위의 코드를 람다로 작성 가능

        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        action((x, y)-> {
           int result = x - y;
            System.out.println("result: "+result);
        });
    }

    public static void action(Calculable calculable){
        // 데이터
        int x = 10;
        int y = 4;

        // 데이터 처리
        calculable.calculate(x, y);
    }
}
