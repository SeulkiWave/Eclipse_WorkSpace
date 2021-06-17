
public class IfTest2 {

	public static void main(String[] args) {
		
		int x = 21; // main block이 실행되는 동안만 의미를 가지는 함수: 지역변수
		int y = 30;
		
		if (x > y) {
			System.out.println("true --> " +x+" > "+y);
		} else {
			System.out.println("false --> " +x+" > "+y);			
		}
		
		if (x < y) {
			System.out.println("true --> "+x+ " > "+y);
		} else {
			System.out.println("false --> "+x+ " > "+y);			
		}
		
		if (x == y) {
			System.out.println("true --> "+x+" == "+y);
		}
		if (x != y) {
			System.out.println("true --> "+x+" != "+y);
		}
		
		
		
		System.out.println("---------- 블록 / (지역) 변수의 범위scope ----------");
		// main 내부에서 선언된 변수! main 외 타 블록도 포함이지만 main은 제외~
		
		int kor = 90; // View-Variable에서 L은 local variable의 l
		if (kor > 90) {
			char grade = 'A';
			System.out.println("kor= "+kor);
			System.out.println("grade= "+grade);
			String msg = "참 잘했어요~";
		}		
		System.out.println("kor= "+kor);
		// System.out.println("grade= "+grade); // grade cannot be resolved to a variable
		// System.out.println("msg= "+msg); // msg cannot be resolved to a variable
		
		return; // main thread를 JVM으로 반환! 생략 가능하다~
	} // end main

} // end class
