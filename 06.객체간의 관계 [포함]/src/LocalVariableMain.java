
public class LocalVariableMain {

	public static void main(String[] args) {
		
		/*
		 * 지역 변수 Local Variable
		 *  - 메소드 블록 안에서 선언된 변수
		 *  - 매개변수를 포함한다
		
		 * 멤버 필드(변수) : instance Variable, field
		 * - 클래스 블록 안에 선언된 변수
		 */
		
		
		int a = 9;
		int b = 10;
		
		int t = a;
		a = b;
		b = t; // t값이 사라지지 않는다. t = 9;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		// 로컬 변수는 초기화(값을 대입)하지 않으면 사용할 수 없다!!!
		// 로컬 변수는 반드시 초기화 과정을 꼭 거쳐야 한다~
		// The local variable tot may not have been initialized~
		// int tot;
		// System.out.println(tot);
		
		// boolean condition = true;
		// if (condition) {
		int tot = 0;
		// }
		// System.out.println("local variable tot: " +tot);
		// tot는 if문 내에서 초기화가 됐지만! if 연산이 끝난 후 사라지는 매개변수다~
		// condition이 false면 안 될 수도 있어~
		
		// ~THE LOCAL VARIABLE MAY NOW HAVE BEEN INITIALIZED~ //
		
		Member localM = null;
		
		
		Member m = new Member(1111, "김슬긲");
		m.method(13);
	}

}
