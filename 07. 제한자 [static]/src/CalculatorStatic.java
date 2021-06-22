
public class CalculatorStatic {
	
	// 객체 생성의 의미가 없기 때문에 생성자에 접근 제한을 둚..
	private CalculatorStatic() {
		
	}
			
	
	// 덧셈
	public static int add (int a, int b) {
		int result = a + b;
		return result;
	}
		
	// 뺄셈
	public static int sub (int a, int b) {
		int result = a - b;
		return result;
	}
		
	//곱셈
	public static int mul (int a, int b) {
		int result = a * b ;
		return result;
	}

	// 나눗셈
	public static int div (int a, int b) {
		int result = a / b;
		return result;
	}
	
}
