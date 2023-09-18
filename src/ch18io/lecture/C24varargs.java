package ch18io.lecture;

public class C24varargs {
    public static void main(String[] args) {
        // varargs(가변인자) : ...
        method1(3);
        method1(5, 6);
        method1(new int[]{10, 20, 30});

        // 가변인자 이후에는,
        method2();
        method2(2);
        method2(3, 4);
        method2(6, 7, 8);
        method2(new int[]{1, 2, 3, 4});




    }
    public static void method1(int a) {

    }
    public static void method1(int a, int b){

    }
    public static void method1(int[] arr) {

    }
    // 가변인자가 없던 시절에는 계속 메소드를 오버로딩 해야했음

    // 가변인자 사용
    public static void method2(int... nums){ // 가변인자
        // 가변인자 사용법
        // 배열로 사용
        for (int i=0; i< nums.length; i++){
            System.out.println("nums[i] = " + nums[i]);
        }
    }
    public static void method3(String s, Double d, int...args){
        // 가변인자 사용 시 주의할 점
        // 파라미터 목록 마지막에 사용해야함
    }
}
