package ch12api.book.sec03.exam01;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();     // toString() 메소드 호출
        System.out.println(strObj);

        System.out.println(myPhone);            // toString() 메소드 호출
    }
}
