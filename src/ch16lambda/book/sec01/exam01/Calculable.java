package ch16lambda.book.sec01.exam01;

@FunctionalInterface    // 컴파일러가 이 인터페이스가 추상 메소드가 하나가 맞는지 검증해주는 어노베이션
// 추상 메소드가 하나인 인터페이스
public interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);

}
