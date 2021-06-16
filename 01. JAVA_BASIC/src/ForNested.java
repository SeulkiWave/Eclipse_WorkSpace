import java.util.Scanner;

public class ForNested {

	public static void main(String[] args) {
		
		// continue, break 활용하기
		
		// 1
		Scanner console = new Scanner(System.in);
		
		System.out.print("줄 수를 입력하세요: ");
		int line1, lineAll1, black1;
		lineAll1 = console.nextInt();
		
		for (line1 = 1; line1<=lineAll1; line1++) {
			for (black1 = 1; black1<=lineAll1; black1++) {
				System.out.print("★");
				
				if (black1 == lineAll1) {
					System.out.println();
				}
			}
			
		} // 1 for end
		System.out.println("----------------------------------------");
		
		
		
		//2
		// ★☆☆☆☆
		// ☆★☆☆☆
		// ☆☆★☆☆
		// ☆☆☆★☆
		// ☆☆☆☆★
		System.out.println("줄 수를 입력하세요.");
		int line2, lineAll2, white2;
		lineAll2 = console.nextInt();
		
		for (line2 = 1; line2 <= lineAll2; line2++) {
			
			for (white2 = 1; white2 <= line2-1; white2++) {
				System.out.print("☆");
			}
			
			System.out.print("★");
			
			for (white2 = 1; white2 <= lineAll2 - line2; white2++) {
				System.out.print("☆");
			}
			
			System.out.println();
			
		}// 2 for end
		System.out.println("----------------------------------------");
		
		
		
		
		// 3
		// ☆☆☆☆☆
		// ★☆☆☆☆
		// ★★☆☆☆
		// ★★★☆☆
		// ★★★★☆
		System.out.println("줄 수를 입력하세요.");
		int line3, lineAll3, white3, black3;
		lineAll3 = console.nextInt();
		
		for (line3=1; line3<=lineAll3;line3++) {
			
			for (black3=1; black3<line3;black3++) {
				System.out.print("★");
			}
			
			for (white3=1; white3<=lineAll3-line3+1; white3++) {
				System.out.print("☆");
			}
			System.out.println();
			
		}// 3 for end
		System.out.println("----------------------------------------");
		
		
		
		
		//4
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
		
		System.out.println("줄 수를 입력하세요.");
		int line4, lineAll4, black4;
		lineAll4 = console.nextInt();
		
		for (line4=1;line4<=lineAll4;line4++) {
			for(black4=1;black4<=line4;black4++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		
		
		//5
		// ★★★★★
		// ★★★★
		// ★★★
		// ★★
		// ★
		
		System.out.println("줄 수를 입력하세요.");
		int line5, lineAll5, black5;
		lineAll5 = console.nextInt();
		
		for (line5=1; line5<=lineAll5;line5++) {
			for(black5 = 1; black5 <= lineAll5-line5+1;black5++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		
		
		// 6 : 우측정렬
		// ★★★★★
		//  ★★★★
		//   ★★★
		//    ★★
		//     ★
		System.out.println("줄 수를 입력하세요.");
		int line6, lineAll6, black6, blank6;
		lineAll6 = console.nextInt();
		
		for (line6=1; line6<=lineAll6;line6++) {
			
			for (blank6=1; blank6 <= line6-1; blank6++) {
				System.out.print(" ");
			}
			
			for (black6=1;black6<=lineAll6-line6+1;black6++) {
				System.out.print("★");
			}
			
			System.out.println("");
		}
		System.out.println("----------------------------------------");
		
		
		
		// 7 그냥 해보고싶은거
		// ★ (1)
		// ★★ (2)
		// ★★★ (3)
		// ★★★★ (4) 
		// ★★★★★ (5) 
		// ★★★★ (6)
		// ★★★ (7)
		// ★★ (8)
		// ★(9)
		
		System.out.println("줄 수를 입력하세요.");
		int line7, lineAll7, black7;
		lineAll7 = console.nextInt();
		if (lineAll7%2==0) {
			
			
			
		}
		
		
		
	} // main end

} // class end
