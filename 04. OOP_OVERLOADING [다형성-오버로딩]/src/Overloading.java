/*
 오버로딩(다중정의)

  1. 자바 다형성구현기법 중의하나이다.
  2. 정의: 같은메쏘드 이름으로 여러개를 정의하는방법
  - 규칙: 
    * 메소드의 이름(식별자)이 같아야한다.
    * 메소드의 매개 변수의 타입, 개수의 조합이 달라야 함..
    * 메소드의 리턴타입, 접근 지정자'는 상관없다.
*/

public class Overloading {
	
	public void method() {
		System.out.println("public void method()");
	}
	//duplicate ..
	
	public void method(int a) {
		System.out.println("public void method(int a)");
	}

	public void method(int a, int b) {
		System.out.println("public void method(int a, int b)");
	}
	
	public void method(int a, int b, int c) {
		System.out.println("public void method(int a, int b, int c)");
	}
	
	public void method(String a) {
		System.out.println("public void method(String a)");
	}
	
	public void method(String a, String b) {
		System.out.println("public void method(String a, String b)");
	}
	
	public void method(int a, int b, String c) {
		System.out.println("public void method(int a, int b, String c)");
	}
	
	/*
	public int method(int a, int b, String c) {
		System.out.println("public void method(int a, int b, String c)");
	}
	
	Duplicate
	
	*/
	
}
