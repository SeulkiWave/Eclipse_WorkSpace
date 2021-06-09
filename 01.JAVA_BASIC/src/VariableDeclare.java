/*
변수의선언
	- 의미: JVM에게 메모리를 할당해달라고 요청하는작업
	- 형태: 데이터타입 식별자(이름); ex> int number;
	- 변수 식별자 규직 (클래스 이름, 변수 이름, 메소드 이름)
	- 영문/한글 시작
	- 특수 문자 사용 불가 (_,$)
	- 키워드 사용 금지
*/

public class VariableDeclare {

	public static void main(String[] args) {
		int score1; // 변수 선언(=정의). 변수 자료형은 정수형 int이고 이름은 score1이다.
		score1 = 78; // score1에 78이라는 데이터가 대입된 것! 같다(==)와 다르다. 변수에 값이 대입된 순간 변수가 선언됐다고 판단!!!!!!
		System.out.println(score1); // 변수 score1의 값을 출력한다. 
		score1 = 99; // 다시 변수 score1에 99라는 데이터를 대입한다.
		System.out.println(score1); // 변수 score1 값 출력
		
		int score2 = 28;
		System.out.println(score2);
		
		int _number;
		int $number;
		int 번호;
		_number = 3;
		$number = 4;
		번호 = 5;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);
		// int 7number, my score, my-score; 모두 불가능
		
		int kor, eng, math;
		kor = 89;
		eng = 90;
		math = 93;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		/*
		int kor; // duplicate local variable.
		history = 88; // cam't be resolved to a variable.
		*/
		
		String name; // 변수 선언 - 데이터타입(String, 문자열 타입~) 식별자(이름, name);
		name = "김슬기";
		System.out.println(name);
		
	} // JVM으로 실행 흐름 thread가 되돌아감: return 

}
