package ch12api.book.exercise.p17;

public class patternMatcherExample {
    public static void main(String[] args) {
        String id = "5angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean isMatch = id.matches(regExp);
//      =  boolean isMatch = Pattern.matches(regExp, id);
        if(isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
