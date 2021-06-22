/*
 * << 코 드 정 렬 >>
 * ctrl + shift + F
 */

public class IfTest1 {

	public static void main(String[] args) {

		System.out.println("stmt1");
		boolean condition = false;

		if (condition) {
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		} // if end
		System.out.println("stmt5");
		System.out.println("stmt6");
		System.out.println("stmt7");

		if (condition) {
			System.out.println("testTrue");
		} else {
			System.out.println("testTrue_else");
		}
		System.out.println("test_ifout");

		if(condition)
			System.out.println("test2"); // 조건문이 true일 때 실행된다!
		//괄호는 실행문이 여러개일 때 붂기 위한 용도로 사용됨~ else도 동일.
		System.out.println("test2_ifout");
		
		
	} // end main

} // end class
