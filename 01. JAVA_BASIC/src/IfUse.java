
public class IfUse {

	public static void main(String[] args) {
		
		/*
		 * << 짝/홀수 판별 후 출력 >>
		 */
		
		int no1 = 56;
		
		if (no1 % 2 == 0) {
			System.out.println(no1+"는 짝수입니다.");
			System.out.printf("%d는 %s입니다. %n", no1, "짝수"); // 숫자일 때 %d, 문자열은 %s, enter는 %n
		} else {
			System.out.println(no1+"는 홀수입니다.");
			System.out.printf("%d는 %s입니다.", no1, "홀수");
		}
		
		
		// 4의 배수 판별 후 출력
		
		int no2 = 5684;
		if (no2 % 4 == 0) {
			System.out.printf("%d는 4의 배수입니다.%n", no2);
		} else {
			System.out.printf("%d는 4의 배수가 아닙니다.%n", no2);			
		}
	
		
		// 점수의 유효성 체크
		int kor = -93;
		if (kor >=0 && kor <= 100) {
			System.out.printf("%d은(는) 유효한 점수입니다.%n", kor);
		} else {
			System.out.printf("%d은(는) 유효한 점수가 아닙니다.%n", kor);			
		}
		
		
		// 윤년 여부 체크
		int year1 = 2021;
		
		if ((year1 % 4 == 0 && !(year1 % 100 == 0)) // !(year1%100==0) == year1%100!=0 
				|| year1 % 400 == 0) {
			System.out.printf("%d은(는) 윤력입니다.%n", year1);
		} else {
			System.out.printf("%d은(는) 평년입니다.%n", year1);			
		}
		
		
		/*
		 * << 문자 판단 >>
		 * - 한글, 알파벳 대소문자, 숫자형태의 문자, 'A'
		 */
		char c = '김';
		
		if (c >= '가' && c <= '힣') {
			System.out.printf("%c은(는) 한글입니다. %n", c);
		}
		
		if (c >= 'A' && c <= 'Z') {
			System.out.printf("%c은(는) 알파벳 대문자입니다. %n", c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf("%c은(는) 알파벳 소문자입니다. %n", c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf("%c은(는) 숫자 형태의 문자입니다. %n", c);
		}
		
		
	} // main end

} // class end
