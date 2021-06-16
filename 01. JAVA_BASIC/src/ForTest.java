
public class ForTest {

	public static void main(String[] args) {
		
		System.out.println("-------------------- W H I L E --------------------");
		
		int k = 0;
		while (k<10) {
			System.out.println("k= "+k);
			k++;
		}
		
		
		System.out.println("-------------------- F O R --------------------");
		// for 증가
		for (int i=0; i<10 ; i++) {
			System.out.println("i= "+i);
		}
		// for 감소
		for (int i=10; i>0; i--) {
			System.out.println("i= "+i);
		}
		
		
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		System.out.println(">> 짝수 출력 [1~10");
		for (int i=1; i<=10;i++) {
			if (i%2==0) {
				System.out.println(i+" ");
			}
		}
		
		
		
		System.out.println(">> 짝수 출력 [1~10]");
		for (int i=1; i<=10; i++) {
			if(i%2==0){
				continue; // 현재 실행 블록을 더 이상 실행하지 않고
						  // 다음의 블록을 실행함
			}
			System.out.println(i+" ");
		}
		
		
		System.out.println(">> 4의 배수 출력 [1~10] continue");
		for (int i=1;i<=10;i++) {
			if (i%4!=0) {
				continue;
			} else {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println(">> 3, 4의 공배수 [1~100");
		for (int i=1; i<=100; i++) {
			if(i%3==0&&i%4==0) {
				System.out.println(i+" ");
			}
		}
		
		System.out.println(">> 3, 4의 최소 공배수 [1~100");
		for (int i=1; i<=100; i++) {
			if(i%3==0&&i%4==0) {
				System.out.println(i+" ");
			}
		}
		
		
		
		
		System.out.println();
		System.out.println(">> 1부터 100 사이의 3과 4의 공배수");
		
		for (int i=1; i<=100; i++) {
			if (i%3==0 && i%4==0) {
				System.out.print(i+" ");
				break; // break 문 이후의 for 블록 코드를 실행하지 않고
						// 다음 반복을 실행하지 않는다.
						// (현재 break가 속한 블록 자체를 탈출!)
			}
		}
		
		
		System.out.println();
		System.out.println(">> 1부터 100 사이의 전체 합, 홀수의 합, 짝수의 합");
		
		int i, oddSum, evenSum, sum;
		oddSum = 0; evenSum = 0; sum = 0;
		
		for (i=1; i<=100; i++) {
			sum += i;
			
			if (i%2==0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			
			
		}
		
		System.out.println("전체 합: "+sum);
		System.out.println("짝수 합: "+evenSum);
		System.out.println("전체 합: "+oddSum);
		
		
		
		System.out.println("---------- 문자 출력 ----------");
		for (char c = 'a'; c<='z'; c++) {
			System.out.print(c);
			
			if (c=='z') {
				continue; // 현재 continue가 속한.. for문을 탈출?
			}
			System.out.print(", ");
		}
		System.out.println();

	}

}
