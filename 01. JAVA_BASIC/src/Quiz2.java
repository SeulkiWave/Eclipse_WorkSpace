
public class Quiz2 {

	public static void main(String[] args) {
		
		
		// QUIZ: 한글 출력, 영문 대문자. 숫자형 문자..
		
		
		// 1. 한글 출력
		char c1 = '가';
		int i = 1;
		while (c1 <= '힣') {
			System.out.print(c1+" ");
			if (i%10==0) {
				System.out.println();
			}
			c1++;
			i++;
		}
		
		System.out.println("\n----------------------------------------");
		
		// 2.영문 대문자 출력
		c1 = 'A';
		i = 1;
		while (c1<='Z') {
			System.out.print(c1+" ");
			if (i %10 == 0) {
				System.out.println();
			}
			c1++;
			i++;
		}
		
		System.out.println("\n========================================");
		
		// 3. 숫자형 문자 출력
		c1 = '0';
		while (c1 <= '9') {
			System.out.print(c1+" ");
			c1++;
		}
		System.out.println("\n========================================");
		
		 
		
		
	} // main end

}
