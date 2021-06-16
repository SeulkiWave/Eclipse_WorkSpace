import java.util.Scanner;

public class WhileNested {

	public static void main(String[] args) {
		
		// 1
		int i = 0;
		int j = 0;
		
		while (i < 5) {
			while (j < 5) {
				System.out.print("★");
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.println();
			i++;
			j = 0;
		}
		
		
		
		// 2
		Scanner console = new Scanner(System.in);
		
		System.out.print("줄 수를 입력하세요: ");
		int black2, white2, line2, lineAll2, lineBlank2;
		
		lineAll2 = console.nextInt();
		line2 = 1;
		System.out.println();
		
		while (line2 <= lineAll2) {
			
			white2 = 1;
			black2 = 1;
			lineBlank2 = lineAll2 - line2;
			
			while (black2<=line2) {
				System.out.print("★");
				black2++;
			}
			
			while (white2 <= lineBlank2) {
				System.out.print("☆");
				white2++;
			}
			
			System.out.println();
			line2++;
		}
		
		System.out.println("--------------------------------------------------");
		
		
		/*// 3
		
		☆☆☆☆☆
		★☆☆☆☆ - //line을 늦게 대입해서 활용할 수 있을까????????????????????????????
		★★☆☆☆
		★★★☆☆
		★★★★☆
		
		*/
		
		System.out.print("줄 수를 입력하세요: ");
		int line3, lineAll3, lineBlank3, black3, white3;
		
		lineAll3 = console.nextInt();
		line3 = 1;
		
		System.out.println();
		
		
		while (line3 <= lineAll3) {
			
			white3 = 1;
			black3 = 1;
			lineBlank3 = lineAll3 - line3 +1;
			
			while (black3 < line3) {
				System.out.print("★");
				black3++;
			}
			
			while (white3 <= lineBlank3) {
				System.out.print("☆");
				white3++;
			}
			
			System.out.println();
			line3++;
		}
		
		System.out.println("--------------------------------------------------");
		
		/*// 4
		★☆☆☆☆
		☆★☆☆☆
		☆☆★☆☆
		☆☆☆★☆
		☆☆☆☆★
		*/
		
		int white4Front, white4Back, line4, lineAll4, lineBlank4;
		
		System.out.print("줄 수를 입력하세요: ");
		lineAll4 = console.nextInt();
		line4 = 1;
		
		while (line4 <= lineAll4) {
			white4Front = 1;
			white4Back = 1;
			lineBlank4 = line4 - 1;
			
			while (white4Front <= lineBlank4) {
				System.out.print("☆");
				white4Front++;
			}
			
			System.out.print("★");
			
			while (white4Back <= lineAll4 - line4) {
				System.out.print("☆");
				white4Back++;
			}
			
			System.out.println();
			line4++;
		}
		
		System.out.println("--------------------------------------------------");
		
		int black5, line5, lineAll5;
		
		System.out.print("줄 수를 입력하세요: ");
		lineAll5 = console.nextInt();
		line5 = 1;
		
		while (line5 <= lineAll5) {
			black5 = 1;
			while (black5 <= line5) {
				System.out.print("★");
				black5++;
			}
			System.out.println();
			line5++;
		}
		
		
		
		
		// 5 : 객체 지향 프로그래밍 / 객체 / 클래스에 대한 간략화 (각 5줄 미만)
		
	}

}
