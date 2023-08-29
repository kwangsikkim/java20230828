package ch06class;
    // 특별한 이유가 없다면,
    // 필드는 private 로
    // 관련된 메소드는 (주로 getter, setter)를 public으로 작성
public class C10capsule {

}

class MyClass10{
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}
