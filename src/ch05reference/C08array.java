package ch05reference;

public class C08array {

	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = {3, 4, 5};
		int[] c = a;
		
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
	
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
		
		// a, c 는 같은 인스턴스 주소를 가지고 있음
		
		System.out.println(a[0]);  // 3
		a[0] = 33;
		
		System.out.println(a[0]);  // 33
		System.out.println(c[0]);  // 33
		
		System.out.println(b[0]);  // b는 다른 인스턴스. 따라서 3
		
	}

}
