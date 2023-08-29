package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}

class MyClass03 {
    private String name;

    void printName() {
        System.out.println("name = " + name);

    }
}

class MySubClass031 extends MyClass03 {
    void setName(String name) {
//            this.name = name; 오류!!!
    }
    // 상위 클래스의 필드가 private이기 때문에 상속 받을 수 없다.
    // 주로 상속은 메소드 상속을 염두에 두고 사용해야 한다.
}

