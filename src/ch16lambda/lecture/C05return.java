package ch16lambda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = () -> {
            System.out.println("명령문 1");
            System.out.println("명령문 2");
            return 0;
        };

//        MyInterface05 o2 = () -> {return 0;};
//        return 명령어를 포함한 몸통은 한줄 일때 중괄호 생략이 가능하지만,
//        이때는 return 키워드까지 함께 생략해야한다

        MyInterface05 o2 = () -> 0;
    }

}
@FunctionalInterface
interface MyInterface05 {
    int method();
}
class MyClass05 implements MyInterface05{
    @Override
    public int method() {
        return 0;

        // 메소드에 return한다고 명시했으니 return에 대해 코드를 작성해야 함
    }
}