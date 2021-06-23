package lang.wrap;

public class WrapperClassCompareMain {

	public static void main(String[] args) {
		
		Integer wi1 = new Integer(89);
		Integer wi2 = new Integer(89);
		Integer wi3 = wi1; // wi1와 wi3의 주소가 같다!
		
		/*
		 * Wrapper, String 객체!
		 *   - 비교 연산자 (==)를 사용하면 주소 비교! (사용금지 ㅡㅡ)
		 *   - equals 메소드 사용! : 멤버 필드의 기본형 값을 비교한다~.~ [재정의된 메소드! 권장!] 
		 */
		/*
		if (wi1 == wi2) {
			System.out.println("wi1와 wi2의 '주소'가 같다");
		} else {
			System.out.println("wi1와 wi2의 주소가 다르다~"); // wi3은 같겠지~
		}
		*/
		// if (wi1 == 89) {} --> wi1.intValue == 89 비교..
		
		if (wi1.equals(wi2)) {
			System.out.println("wi1와 wi2의 값이 같다?");
		}
		
		
		
		
		
		
	}

}
