
public class OperatorArithmatic2 {

	public static void main(String[] args) {
		// 문 자 연 산 //
		System.out.println("====================");
				
		char ca = 'A'; // 인코딩 테이블: A - 65
		char cz = 'Z';
		
		int numOfAlphabet = cz - ca + 1;
		System.out.println("numOfAlphaber: " +numOfAlphabet);
		
		
		char c = 'A';
		System.out.println(c);
		c = 'A' + 1; // 대입 연산자가 마지막에 실행된다 -> 우측이 먼저 실행된다
		System.out.println(c);
		c = 'A' + 2;
		System.out.println(c);
		c = 'A' + 3;
		System.out.println(c); // 인코딩 테이블 내 글자가 연속적으로 배치되어 있는 것을 확인할 수 있다
		
		
		int numOfKor = '힣' - '가' +1 ;
		System.out.println("numOfKor: " + numOfKor);
		
		
		
		
		// 비 트 연 산 //
		// << , >> : 좌/우측으로 비트를 이동한다
		
		// int d = 1;
		int d = 0b00000000000000000000000000000001; // int는 4byte 정수 자료형.. 2진법 표기법..
		int result;
		result = d << 1; // 좌측으로 비트를 하나 민다?
		// int d = 1 	   (== 00000000'00000000'00000000'00000001)
		// result = d << 1 (== 00000000'00000000'00000000'00000010) // 1이 자리수가 하나 증가함 
		// d를 1 비트 좌측으로 민다!
		
		System.out.println(result);
		
		result = d<<2;
		System.out.println(result);
		
		result = d<<3;
		System.out.println(result); // 2의 지수대로 증가한다... 산술연산..............
		
		result = d<<4;
		System.out.println(result);
		
		
		/*
		 * d =  1  (== 00000000'00000000'00000000'00000001)
		 * d >> 1  (== 00000000'00000000'00000000'00000000) // 우측으로 이동할 때 자리수가 이동하므로 /2의 효과가 난다..
		 */
		
		d = 128;		
		System.out.println("main " +d);
		result = d >> 1;
		System.out.println(result);
		result = d >> 2;
		System.out.println(result);
		result = d >> 3;
		System.out.println(result);
		result = d >> 4;
		System.out.println(result);
		
		
		
	}

}
