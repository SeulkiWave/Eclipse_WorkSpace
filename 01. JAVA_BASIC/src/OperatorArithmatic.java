
public class OperatorArithmatic {

	public static void main(String[] args) {
		// String[] - 타입, args - 식별자 : 이대로 변수가 선언됨..
		// 외부에서 클래스를 실행시켰을 때 args에 들어옴????????????
		int a = 1; // thread가 대기suspend 상태
		int b = 2;
		int result = 0;
		
		
		result = (a + b);
		System.out.println("a + b --> " + result);
		
		result = (a - b);
		System.out.println("a - b --> " + result);
		
		result = (a * b);
		System.out.println("a * b --> " + result);
		
		result = (a / b);
		System.out.println("a / b --> " + result); // 1/2는 int형 변수에 넣을 수 없으므로 0이 나옴..
		
		
		double deresult = 0.0;
		System.out.println("a / b --> " + deresult);
		
		deresult = (a / b); // int간의 계산에서 이미 소숫점 아래 자리수가 날아감
		System.out.println("a / b --> " + deresult);
		
		
		
		// 나머지 연산자
		// a % b == a 를 b로 나눈 나머지 값
		result = (a % b);
		System.out.println("a % b --> " + result);
		
		
		int year = 2021;
		result = (year % 4); // 나올 수 있는 수: 0, 1, 2, 3
		System.out.println("2021 % 4 --> " + result);
		
		result = year % 100; // 0~99
		System.out.println("2021 % 100 --> " + result);
	
		result = (year % 400); // 0~399
		System.out.println("2021 % 400 --> " + result);
		
		
		int no = 16;
		result = (no % 4);
		System.out.println(("result 값이 0이면 4의 배수: " + result));
		
		
		
		// 문 자 연 산 //
		System.out.println("====================");
		
		char ca = 'A'; // 인코딩 테이블: A - 65
		char cz = 'Z';
		result = ca;
		System.out.println(ca); // ca는 char형 변수이기 때문에 인코딩 테이블을 통해 인코딩된 글자 'A'가 나온다
		System.out.println(result);
		// result는 char형 변수 ca가 인코딩 테이블을 통해 숫자로 저장된 상태에서 다시 디코딩을 거치지 않고
		// 'A'의 숫자 값을 그대로 갖고 나오는 int형 변수이기 때문에 65가 출력됨.
		
		System.out.println("A의 10진수: " + result);
		
		result = ca + 1; // 결과 값은 66. 대입 연산자 =가 가장 마지막에 처리됨.
		System.out.println("A+1의 10진수: " + result);
		
		// char result = result;
		// 강제 형변환. result는 4byte의 int형 변수, char는 2byte형이기 떄문에
		// 강제 형변환의 구조가 필요하다
		char cresult = (char)result;
		System.out.println("cresult: "+ cresult); // 결과: B.
		// 인코딩 테이블에서 A와 B는 1씩 증가하며 배치되어 있기 떄문에,
		// 강제 형변환을 해준 result의 값 66은 인코딩 테이블 A(65) 다음의 B를 가리키게 된다.
		
		int numOfAlphabet = cz - ca + 1; // 어렵다.. 이 부분 다시 이해하기
		System.out.println("number Of Alphabet: " +numOfAlphabet);
				
		int numOfKor = '힣' - '가'+1;
		System.out.println("number Of Korean: " + numOfKor);
		
		char ch1 = '가' + 1;
		System.out.println("가 + 1 --> " + ch1); //각.............
		
		char ch2 = '가' + 11171;
		System.out.println("가 + 11171 --> " + ch2); // 힣
		
		
		
	}

}
