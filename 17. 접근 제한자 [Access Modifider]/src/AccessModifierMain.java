/*
클래스의 접근을 제한하는 제한자
	1. 클래스의 접근 제한
	2. 클래스의 멤버(필드, 메소드, 생성자)의 접근 제한
	3. 접근 제한자: public,protected,(default),private 
		A. public
			- 외부의 모든 클래스(객체)에서 접근가능
		B. protected
			- 같은 패키지에 있는 모든 클래스(객체)에서 접근 가능
			- 다른 패키지의 모든 클래스(객체)에서는 접근이 불가능하다... 그러나!
			- '다른 패키지'에 있는 '상속 관계에 있는 자식 클래스'에서 접근 가능
			- 언제?
		C. (default)
			- 같은 패키지에 있는 모든 클래스(객체)에서 접근 가능
			- 다른 패키지에 있는 모든 클래스(객체)에서 접근 불가능!
 		D. private
			- 외부의 모든 클래스(객체)에서 접근 불가능
 */
public class AccessModifierMain {

	public static void main(String[] args) {
		
		// 자바에서 제공하는 패키지 이름과 동일한 패키지는 생성할 수 없다...
		// Prohibited package name: java.lang
		
		
	}

}
