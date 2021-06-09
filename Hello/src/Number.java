/*
 숫자형 자료형
 (1) 정수형 : byte, short, int, long
 			- 정수형 리터럴은 음수도 가능. 소숫점만 불가능, 1, -4 ...
 (2) 실수형 : float, double
 			- 실수형 리터럴 : 0.1, .1 ...
 			
 byte는 8bit(1byte)
 byte b4 = 0b01111111; // 2진수~
 -128 ~ 127
 */

public class Number {

	public static void main(String[] args) {
		byte b1 = 3; // 정수에서 가장 작음. 1byte
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b01111111; // 2진수 표기법에 따라 127이 나옴..
		System.out.printf("%d %d %d %d",b1, b2, b3,b4);
		
		short s1 = 766; // 2byte
		short s2 = -32768; // 최소값
		short s3 = 32767; // 최대값. int는 21억까지 가능
		short s4 = 0b0111111111111111;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s3); //컴퓨터는 2진법 계산을 하기 때문에 같은 것으로 취급
		
		int i1 = 90; // 4byte. 정수형 리터럴!
		int i2 = -2147483628;
		int i3 = 2147483647;
		int i4 = 0b01111111111111111111111111111111;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i4);
		System.out.println(i3);
		
		long l1 = 232; // 8byte
		long l2 = 9890;
		long l3 = -2147483648; // i3는 2147483647을 포함시킬 수 있는데... 
		long l4 = 2147483648l;  // 얘는 안 됨
		// The literal 2147483648 of type int is out of range..
		// 정수형 리터럴은 무조건 4byte로 잡으나, 위 수를 2148483648으로 (4byte 초과) 정수형 리터럴에 들어갈 수 없다.
		// 대신 8byte의 long 자료형을 사용하기 위해 숫자 뒤 l을 붙여야 함.
		long l5 = 0b011111111111111111111111111111111;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);		
		
		
		float f1 = 0.1f; // 4byte.
		// 실수형 리터럴(데이터) 또한 정수형 리터럴처럼 8byte에 대입해줘야 한다.
		// 실수형 자료형 double으로 변수를 선언하거나, float형에 대입하기 위해 숫자 뒤에 f를 넣어야 한다.
		// 기본적으로 실수형 자료형은 8 byte이며 double 자료형을 사용하는 것이 일반적이다!
		float f2 = 3.14f;
		float f3 = 1000.0f;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		// byte < short < int < long < float < double
		// char < String
		
		/*
		 [ 문자형 자료형 ]
		
		'ABBA' 저장 -> 컴퓨터는 0과 1을 사용한 2진법으로 저장 -> 
		- 문자를 숫자로 표현하는 것을 '인코딩 테이블'이라고 표현한다.
		- 예시> 2진법 인코딩: A(00) B(01) C(10) D(11)
		- 인코딩 테이블을 참고해 문자를 기계어로 바꾸는 과정: 인코딩
		- 인코딩 테이블을 참고해 기계어를 문자로 바꾸는 과정: 디코딩
		
		char (2byte = 16bit = 약 6만개의 글자를 표현할 수 있다...)
		char은 부호가 없는 숫자 형태로 저장됨... (인코딩 테이블을 참고해 인코딩/디코딩 저장, 출력)
		 */
		
		char text1 = 65; // char를 출력할 때 문자열을 참고해 변환시킴! char이니까! (내부에 숫자로 저장된다는 이야기~)
		char text2 = 'A';
		System.out.println(text1);
		System.out.println(text2); // 본질적으로 char형에서는 65와 'A'가 같다.
		char text3 = 49836;
		char text4 = '슬';
		System.out.println(text3);
		System.out.println(text4);
		
	}

}
