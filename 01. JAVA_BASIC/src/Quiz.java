import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) throws Exception {
		/*
		 * Quiz: 윤년 여부 판단
		 * - 4의 배수이면서 100의 배수가 아닌 수이거나
		 * - 400의 배수
		 */
		
		int year = 2020;
		boolean fourYear, hundYear, fhundYear, isVaild;
		
		fourYear = (year % 4)== 0;
		hundYear = ((year % 100) == 0);
		fhundYear = (year % 400) == 0;
		isVaild = (fourYear && !hundYear) || fhundYear;
		System.out.println(year+"년의 4의 배수 유무는 "+fourYear+"입니다.");
		System.out.println(year+"년의 100의 배수 유무는 "+hundYear+"입니다.");		
		System.out.println(year+"년의 400의 배수 유무는 "+fhundYear+"입니다.");		
		System.out.println(year+"년의 윤달 유무는 "+isVaild+"입니다.");
		System.out.println("---------------------------------------------");
		
		
		
		/*
		 * Quiz : 소수점 자리의 처리
		 * - 소수점 이하 첫째 자리를 남겨두고 Casting 강제 형변환
		 * - 소수점 이하 둘쨰 자리에서 반올림
		 */
		
		double avgd = 85.665;
		
		// 1
		double avgd2 = avgd * 10; // 85.665
		int avgi = (int)avgd2;
		double avgd3 = (double)avgi / 10;
		System.out.println(avgd3); // 효율적인 방법 고민해보기!
		
	
		// 2 : 변수를 여러번 사용해보기! 아래 실행문의 변수는 일회용품~
		double avgd4 = avgd * 100;
		int avgi2 = (int) avgd4+5;
		double avgd5 = (int) avgi2 / 10;
		double avgdFinal = avgd5 / 10;
		System.out.println(avgdFinal);
		
		
		/*
		 * Quiz:
		 * 다음 문자는 아이디의 첫 글자입니다.
		 * 이 문자가 아이디의 첫 글자로 유효한지 판단 후 출력하세요.
		 * - 아이디의 첫 글자는 알파벳 대문자이거나 소문자이다.
		 */
		
		
		Scanner console = new Scanner (System.in);
		
		System.out.print("아이디의 첫 글자를 입력하세요");
		// char keyChar = (char)System.in.read();
		
		String idFirstStr = console.next();
		char idFirst = idFirstStr.charAt(0);
		System.out.println("");
		System.out.printf("입력한 글자는 %c입니다.%n", idFirst);
		
		if (idFirst >='A' && idFirst <= 'Z') {
			System.out.printf("입력한 글자 %c는 아이디의 첫 글자로 사용할 수 있습니다.", idFirst);
		} else if (idFirst >= 'a' && idFirst <= 'z') {
			System.out.printf("입력한 글자 %c는 아이디의 첫 글자로 사용할 수 있습니다.", idFirst);
		} else {
			System.out.printf("입력한 글자 %c는 아이디의 첫 글자로 사용할 수 없습니다.", idFirst);
		}
		
		
	} // main end

}
