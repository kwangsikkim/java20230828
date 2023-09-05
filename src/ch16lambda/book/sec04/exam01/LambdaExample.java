package ch16lambda.book.sec04.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두개 이상일 경우
        person.action((x, y)->{
            double result = x+y;
            return result;
        });

        // 리턴문이 하나만 있을 경우(연산식)
        person.action((x, y) -> (x+y));

        // 고전적 방법
        // person.action((x, y) -> {
        // return (x+y);
        //});
//        person.action(new Calculable() {
//            @Override
//            public double calc(double x, double y) {
//                return (x + y);
//            }
//        });




        // 리턴문이 하나만 있을 경우(메소드 호출)
//        person.action((x,y)->{
//            return sum(x, y);
//        });
        person.action((x, y)-> sum(x, y));

        // 고전적 방법
        person.action(new Calculable() {
            @Override
            public double calc(double x, double y) {
                return sum(x, y);
            }
        });
    }

    public static double sum(double x, double y) {
        return (x+y);
    }
}
