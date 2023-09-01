package ch09nested.lecture;
        // 외부, 내부 클래스의 멤버가 우연히 이름이 같아졌다면...?
public class C05access {

    String name = "java";
    class InnerClass{
        String name = "spring";
        void method(){
            System.out.println(name);
            System.out.println(this.name);      // 둘 모두 내부 클래스 안의 name..

            System.out.println(C05access.this.name);
        }
    }

            public static void main(String[] args) {
                C05access o2 = new C05access();

                InnerClass o1 = o2.new InnerClass();
                o1.method();
            }

}


