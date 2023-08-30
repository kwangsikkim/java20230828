package ch07extends.book.exercise.p06;

public class Child extends Parent{
    public int studentNo;

    public Child(String name, int studentNo) {
        //this.name = name; // 에러 발생
        super(name);

        this.studentNo = studentNo;
    }
}
