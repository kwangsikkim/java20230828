package ch06class;

public class C08static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();
        o1.name = "java";   // 권장 안함
        o1.printName();

        MyClass08.name = "spring";  // 권장함
        MyClass08.printName();

    }
}
class MyClass08{
    static String name;


    static void printName(){
        System.out.println("name = "+name);
    }
}