package ch05reference.lecture;

public class C14enum {
    public static void main(String[] args) {
        MySeason v1 = MySeason.AUTUMN;

        System.out.println("v1.toString() = " + v1.toString());
        System.out.println("v1.hashCode() = " + v1.hashCode());
        System.out.println("v1.equals(null) = " + v1.equals(null));

        System.out.println("v1.name() = " + v1.name());
        System.out.println("v1.ordinal() = " + v1.ordinal()); //  순서. 0부터 시작.
    }
}

enum MySeason {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER,
}
