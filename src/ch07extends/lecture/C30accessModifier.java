package ch07extends.lecture;

public class C30accessModifier {

    public static void main(String[] args) {

    // 접근 제한자(access modifier)
    // public  : 가장 넓은 범위. 어디서든지 접근 가능.
    // protected    : 같은 패키지+ 다른 패키지에서 상속한 자식 클래스에서 접근 가능
    // (package private, default)   : 같은 패키지 내에서만 접근 가능
    // private  : 가장 좁은 범위. 클래스 내에서만 접근 가능
        MyClass30 o1 = new MyClass30();
        o1.publicMethod();  // 가능
//        o1.privateMethod();   // 불가능
        o1.packagePrivateMethod();  // 가능
        o1.protectedMethod();   // 가능

    }
}
