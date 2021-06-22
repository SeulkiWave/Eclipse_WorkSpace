package lang;

public class StringMain {

	public static void main(String[] args) {
		
		// String 객체의 명시적 생성 - 생성자 호출!
		String name1 = new String("AAA");
		String name2 = new String("AAA");
		// 참조변수 name1, name2에는 주소값이 들어가있다...
		
		if (name1 != name2) { // name1과 name2의 주소값이 동일한가?
			System.out.println("name1와 name2의 주소가 동일하지 않다...");
		} else {
			System.out.println("name1와 name2의 주소가 같다.");
		}
		
		/*
		 * >>String<< 은 주소값 비교가 목적이 아닌 대입된 값을 value 배열 형식으로 취하고,
		 * 이에 따라 그것을 비교하고 연산하는데에 주목적을 두고 있다.
		 * name1.equals(name2)는 주소값 자체는 다르나,
		 * 안에 대입된 값의 char[]이 동일하기 때문에 같은 것으로 판단된다...
		 */
		if (name1.equals(name2)) {
			System.out.println("name1의 문자열의 값과 name2의 문자열의 값이 동일하다.");
		}else {
			System.out.println("name1와 name2의 문자열의 값이 동일하지 않다.");
		}
		
		
		// String 객체의 암시적 생성 - 생성자 호출 안 함!!!
		// 		- ""로 생성! ==> 생성자 자동 호출 . . . . . . (경우에 따라 다르다)
		// 문자열을 담는 기본 자료형은 존재하지 않는다~
		
		String name3 = "KIM"; // 리터럴 풀에 KIM 배열을 가진 객체 하나 만듦
		String name4 = "KIM"; // 이미 위에서 만드니까 안 만듦 (생성자를 호출하지 않은 경우 이렇게 한 번 만들고 계속 재사용)
		
		if (name3 == name4) {
			System.out.println("name3과 4의 주소가 같다.");
		} else {
			System.out.println("name3과 4의 주소가 다르다.");
		}
		
		if (name3 == "KIM"){
			System.out.println("name3과 \"KIM\"의 주소가 같다");
		} else {
			System.out.println("name3과 KIM의 주소가 다르다");
		}
		
		
		/*
		 * << S T R I N G >>
		 * Compare this string to the specified object.
		 * 
		 * public boolean equals(Object anObject)
			: String 객체가 멤버(value)로 가지고 있는 문자열 비교
			
		 * Override: equals in class Object 
		 */
		
		System.out.println("E Q U A L S ==============================");
		// String 객체 비교는 equals 메소드를 사용하여야 한다~
		if (name1.equals(name4)) {
			System.out.println("name1과 name4[equals] 문자열이 동일하다! 주소는 다르지요...");
		}
		if (name1.equals(name2)) {
			System.out.println("name1과 name4[equals] 문자열이 동일하다! 주소는 다르지요...");
		}
		if (name1.equals(name3)) {
			System.out.println("name1과 name4[equals] 문자열이 동일하다! 주소는 다르지요...");
		}
		if (name1.equals("KIM")) {
			System.out.println("name1과 name4[equals] 문자열이 동일하다! 주소는 다르지요...");
		}
		if ("KIM".equals("KIM")) {
			System.out.println("name1과 name4[equals] 문자열이 동일하다! 주소는 다르지요...");
		}
		
		System.out.println("==================================================");
		
		/*
		 * << C O M P A R E  T O >>
		 * 
		 * public int compareTo(String anotherString)
		 * 
		 * Compares two strings lexicographically(사전순).
		 * The comparison is bared
		 * on the Unicode value of each character in the strings.
		 * 
		 * Return: the value 0 - if the argument string is equal to this string;
		 * a value less than 0 if this string is lexicographically less than the string argument;
		 * and a value greater than 0 if this lexicographically greater than the string argument..
		 * 
		 * this.charAt(k) - anotherString.charAt(k)
		 * 
		 */
		
		String nname1 = "김슬기";
		String nname2 = "김슬긲";
		
		int getUnicode = nname1.compareTo(nname2); // 유니코드 차이가 반환됨
		System.out.println("문자열간 유니코드 값의 차이: "+getUnicode);
		
		getUnicode = nname2.compareTo(nname1); // 유니코드 차이가 반환됨
		System.out.println("문자열간 유니코드 값의 차이: "+getUnicode);
		
		if (getUnicode > 0) {
			System.out.println("nname1, nname2 교환 [오름차순]");
		}
		
		
		
	}

}
