package ch09nested.book.sec06.exam03;

import ch07extends.book.exercise.p12.C;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메솓,
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();       // Button이 클릭되었을 때 실행되는 메소드 선언
    }
}
