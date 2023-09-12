package ch15collection.lecture;

import java.util.Stack;

public class C14stack {
    public static void main(String[] args) {
        // stack(LIFO: Last In First Out)
        // 주요 메소드
        // push : 마지막에 아이템 추가
        // pop :  마지막아이템 꺼내기
        // peek : 마지막 아에템 보기

        // push
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(3);

        System.out.println("stack.size() = " + stack.size());   //3개

        // pop
        //stack.pop();
        Integer popped = stack.pop();   // 마지막에 넣은 3 꺼냄
        System.out.println("popped = " + popped);   // 3
        
        System.out.println("stack.size() = " + stack.size());   // 2개

        // peek
        Integer peeked = stack.peek();
        System.out.println("peeked = " + peeked);   // 마지막에 있는 수 확인 : 8
    }
}
