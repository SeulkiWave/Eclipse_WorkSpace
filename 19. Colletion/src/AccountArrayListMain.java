// 테스트용~

import java.util.ArrayList;

public class AccountArrayListMain {
	
	public static void main (String[] args) {
		
		Account acc1 = new Account (1111, "AAA", 300030,  9.15);
		Account acc2 = new Account (2222, "BBB", 41698520,  0.51);
		Account acc3 = new Account (3333, "CCC", 415650,  0.48);
		Account acc4 = new Account (4444, "AAA", 16530,  0.7);
		Account acc5 = new Account (5555, "EEE", 86490,  1.5);
		
		ArrayList accList = new ArrayList();
		System.out.println("# size: "+accList.size());
		
		System.out.println(" ADD : =============================="); // Account Service 랑 비교하면서 생각해보기
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
		accList.add(acc4);
		accList.add(acc5);
		
		
		
	}
	
}
