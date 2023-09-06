package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regex : regular expression; 정규식/정규표현식/정규식표현 등등
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x"));   // true

        System.out.println("a".matches("a"));       // a라는 글자는 a라는 패턴과 일치한다
        System.out.println("a".matches("x"));       // a라는 글자는 x라는 패턴과 일치하지 않는다

        System.out.println();

        // 문자들
        System.out.println("xyz".matches("xyz"));   // true
        System.out.println("xxx".matches("xxx"));   // true
        System.out.println("xyz".matches("x"));   // flase

        System.out.println();

        // 수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); // true
        System.out.println("aaa".matches("a{3}")); // true
        System.out.println("aa".matches("a{3}")); // false
        System.out.println("aaa".matches("a{1,3}")); // true
        System.out.println("aa".matches("a{1,3}")); // true
        System.out.println("a".matches("a{1,3}")); // true
                                            // a 가 한번 나와도 되고, 두번 나와도, 세번 나와도 됨
                                            // { }(수량자) 바로 앞의 패턴이 반복됨

        System.out.println();

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));     // 모두 true

        System.out.println("dodog".matches("(do){1,3}g"));
        System.out.println("dododog".matches("(do){1,3}g"));
        System.out.println("dog".matches("(do){1,3}g"));     // 모두 true
                                            // 그룹이라면 ( )로 묶어서

        System.out.println();

        // 수량
        System.out.println("dog".matches("do{1,}g"));       // 1개 이상 (, 이후 비움)
        System.out.println("doooooog".matches("do{1,}g"));
        System.out.println("dooooooooog".matches("do{1,}g"));
        System.out.println("dooog".matches("do{1,}g"));
        System.out.println("doooooooog".matches("do{1,}g"));    // 모두 true

        System.out.println();

        // 수량 ? : 없거나 한번
        System.out.println("dg".matches("do?g"));   // true
        System.out.println("dog".matches("do?g"));   // true
        System.out.println("doog".matches("do?g"));   // flase

        System.out.println("0번 이상");

        // 수량 * : 0번 이상
        System.out.println("dg".matches("do*g"));
        System.out.println("doog".matches("do*g"));
        System.out.println("doooog".matches("do*g"));
        System.out.println("doooooooog".matches("do*g"));   // 모두 true

        System.out.println();

        // 수량 + : 1번 이상
        System.out.println("dg".matches("do+g"));       // false
        System.out.println("dog".matches("do+g"));      // true
        System.out.println("dooog".matches("do+g"));    // true
        System.out.println("dooooog".matches("do+g"));  // true
        System.out.println("doog".matches("do+g"));     // true

        System.out.println();

        // 문자 분류 (Character classes)
        System.out.println("dog".matches("dog"));
        System.out.println("dig".matches("dog"));       // o 거나 i 가 true 이면 좋겠다면?
        System.out.println("dig".matches("d[oi]g"));
        System.out.println("dag".matches("dog"));

        System.out.println();

        System.out.println("dog".matches("d[^oi]g"));   // false
        System.out.println("dig".matches("d[^oi]g"));   // false
        System.out.println("dag".matches("d[^oi]g"));   // true

        System.out.println();

        System.out.println("dog".matches("d[a-z]g"));   // true
        System.out.println("dag".matches("d[a-z]g"));   // true
        System.out.println("dig".matches("d[a-z]g"));   // true
        System.out.println("dug".matches("d[a-z]g"));   // true
        System.out.println("deg".matches("d[a-z]g"));   // true

        System.out.println();

        System.out.println("dag".matches("d[a-cx-z]g"));    // t
        System.out.println("dbg".matches("d[a-cx-z]g"));    // t
        System.out.println("dcg".matches("d[a-cx-z]g"));    // t
        System.out.println("dog".matches("d[a-cx-z]g"));    // f
        System.out.println("dpg".matches("d[a-cx-z]g"));    // f
        System.out.println("dqg".matches("d[a-cx-z]g"));    // f
        System.out.println("dxg".matches("d[a-cx-z]g"));    // t
        System.out.println("dyg".matches("d[a-cx-z]g"));    // t
        System.out.println("dzg".matches("d[a-cx-z]g"));    // t

        System.out.println();

        // 문자 분류 기호 \d -> java에서 큰따옴표 안에 \ 는 한번 더 써야함.
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("0".matches("\\d"));
        System.out.println("7".matches("\\d"));     // 모두 t

        System.out.println();

        System.out.println("a".matches("[a-zA-Z0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));     // 모두 t


        System.out.println();
        // 예제 자바 변수명 작성 규칙
        // : 숫자로 시작하면 안되고, 영문대소문자, _, $
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("a12".matches(pattern)); // t
        System.out.println("$a12".matches(pattern)); // t
        System.out.println("_a12".matches(pattern)); // t
        System.out.println("12a".matches(pattern)); // f

        System.out.println();
        // 예제 전화번호 패턴
        // 숫자 2~3개 - 3~4개 - 4개 , -가 중간에 있어도 되고 없어도되고
        String call = "[0-9]{2,3}-?[0-9]{3,4}-?[0-9]{4}";
        System.out.println("010-4444-8888".matches(call));
        System.out.println("01044448888".matches(call));
        System.out.println("01044448889999".matches(call));
        System.out.println("0212345678".matches(call));
        System.out.println("021235678".matches(call));

        System.out.println();

        // 모든 문자: .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("$".matches("."));
        System.out.println("_".matches("."));       // 모두 t

        System.out.println();

        // 모든 문자가 아닌, . 만 나타내고 싶을 때 -> \.
        System.out.println(" ".matches("\\."));
        System.out.println(".".matches("\\."));

        System.out.println();

        // 예제 이메일 패턴
        // 영문 소문자, 숫자가 여러개 + @ + 영문소문자, 숫자가 여러개 + . + 영문소문자, 숫자 여러개
        String email = "[a-z0-9]*@[a-z0-9]*\\.[a-z0-9]*";
//        String email = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";
        System.out.println("kks8461230@naver.com9".matches(email));
        System.out.println("kasdn47258@nafjkla312v5er.cdasom9".matches(email));

        System.out.println();

        // or : |
        System.out.println("sfghdogasjkdn".matches(".*dog.*")); // t
        System.out.println("sfghascatjkdn".matches(".*cat.*")); // t

        System.out.println("sfghdogasjkdn".matches(".*(dog|cat).*"));  // t
        System.out.println("sfghascatjkdn".matches(".*(dog|cat).*"));  // t

    }
}
