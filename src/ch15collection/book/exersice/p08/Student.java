package ch15collection.book.exersice.p08;

public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        if(studentNum != student.studentNum) return false;
        return true;
    }

}
