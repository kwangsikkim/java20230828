package ch11exception.book.exercise.p06;

public class P06 {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;
        for(int i=0; i<=2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환 불가");
            } finally {
                System.out.println(value);
            }
        }
    }
}
// 10
// 숫자로 변환불가
// 10
// 인덱스 초과
// 10