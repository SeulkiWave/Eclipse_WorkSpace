
public class WhileUse {

	public static void main(String[] args) {
		
		System.out.println("----- 10회 반복 -----");
		
		int i = 0;
		
		while (i < 10) {
			System.out.println("stmt"+i);
			i++;
		}
		System.out.println(">> 1~10 사이의 정수 출력");
		i = 0;
		while (i<10) {
			int no = i+1;
			System.out.print(no+", ");
			i++;
		}
		
		System.out.println();
		
		System.out.println(">>1~10 사이의 정수 출력");
		i = 1;
		while (i <= 10) {
			System.out.print(i+", ");
			i++;
		}
		
		System.out.println();
		
		
		System.out.println(">> 1에서 10 사이의 정수 중 홀수 출력");
		i = 1;
		while (i<=10) {
			
			if (i%2 == 1) {
				System.out.print(i+",");
			}
			
			i++;
		}
		System.out.println();
		
		System.out.println(">> 1과 10사이의 정수 중 4의 배수 출력");
		i = 1;
		while(i<=10) {
			if (i % 4 == 0) {
				System.out.print(i+", ");
			}
			i++;
		}
		
		System.out.println();
		
		
		System.out.println(">> 1과 100 사이의 정수 출력");
		i = 1;
		while (i <= 100) {
			System.out.print(i+"\t"); // \t 탭, \n 엔터
			if (i % 10 == 0) {
				System.out.println();
			}
			i++;
			
		}
		
		
		
		System.out.println(">> 1과 100 사이의 정수 중 3의 배수이면서 4의 배수인 수 출력");
		i = 1;
		while (i <= 100) {
			if (i%3==0 && i%4==0) {
				System.out.println(i+"\t");
			}
			i++;
		}
		
		
		
		// 누 적 연 산 자
		
		// 1~100 사이의 정수 합
		
		i = 1;
		int j = 0;
		while (i<=100) {
			j = i+j; // j += i; 와 동일하다
			i++;
		}
		System.out.printf("\n 1에서 100까지의 정수 합: %d \n",j);
		System.out.println();
		System.out.println("<1에서 100 사이의 홀수, 짝수의 합>");
		i = 1;
		int evenj = 0;
		int oddj = 0;
		while (i<=100) {
			if (i%2==0) {
				evenj += i;
				i++;
			} else if (i %2 == 1) {
				oddj += i;
				i++;
			}
		}
		System.out.printf("홀수의 합: %d, 짝수의 합 %d", oddj, evenj);
		System.out.println();
		
		
		
		// 문 자 출 력
		char c1 = 0;
		while (c1 < 65535) {
			System.out.print(c1+" ");
			if (c1 % 10 == 0) {
				System.out.println();
			}
			c1++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 영문 소문자 출력
		char c2 = 'a';
		while (c2 <= 'z') {
			System.out.print(c2+" ");
			c2++;
		}
		
		
		
		
		
	} // main end

}
