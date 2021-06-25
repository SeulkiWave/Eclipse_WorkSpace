package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListMain {

	public static void main(String[] args) {
		Account acc1 = new Account (1111, "AAA", 300030,  9.15);
		Account acc2 = new Account (2222, "BBB", 41698520,  0.51);
		Account acc3 = new Account (3333, "CCC", 415650,  0.48);
		Account acc4 = new Account (4444, "AAA", 16530,  0.7);
		Account acc5 = new Account (5555, "EEE", 86490,  1.5);
		
		ArrayList<Account> accList = new ArrayList<Account>();
		System.out.println("#size: "+accList.size()); // accList 생성 직후 사이즈 확인 (실제 객체 acc n 대입 전) == 0
		System.out.println("=============== ADD ===============");
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
		accList.add(acc4);
		accList.add(acc5);
		System.out.println("#size: "+accList.size()); // 객체 추가 후 사이즈 확인 == 5
		System.out.println(accList);
		accList.add(3, new Account(3334, "TTTT", 12000, 0.1)); // 3번 인덱스 == 3333번 다음에~ // 4444번은 밀려난다~
		System.out.println("#size: "+accList.size());
		System.out.println(accList);
		
		System.out.println("=============== SET ===============");
		accList.set(3, new Account(3335, "QQQ", 23000, 2.3));
		System.out.println(accList);
		
		System.out.println("=============== GET ===============");
		// Returns the element at the specified position in the ****
		Account getAcc = accList.get(1); // 지워지지 않는다~ : Generic으로 꺼내올 때 <Account> 로 형변환 시켜줘따~
		getAcc.print(); // 2222가 나온다~
		getAcc = accList.get(accList.size()-1); // 이거 왜 하는 걸까...
		getAcc.print();
		System.out.println("=============== REMOVE ===============");
		Account rmvAcc = accList.remove(accList.size()-1); // 5번 날라갔다~
		rmvAcc.print(); // 삭제하려고 뺀.. 객체 프린트? 흠 .. . .
		System.out.println("#size: "+accList.size());
		System.out.println(accList);
		
		System.out.println("=============== < 업 무 실 행 > ===============");
		System.out.println("1. 전체 출력");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAcc = accList.get(i);
			tempAcc.print();
		}
		
		System.out.println("========== < 계 좌 번 호  1 개 로  계 좌 찾 기 > ==========");
		
		System.out.println("========== < 계 좌 주  이 름 으 로  계 좌 찾 기 > ==========");
		
		System.out.println("========== < 계 좌 번 호 로  해 당  계 좌  삭 제 > ==========");
		
		System.out.println("========== < 계 좌 주  이 름 으 로  여 러 개 의  계 좌 삭 제 > ==========");
		
		System.out.println("=============== < I T E R A T O R : 전 체 출 력 > ===============");
		Iterator<Account>accIter = accList.iterator();
		while (accIter.hasNext()) {
			/*
			Account tempAcc = accIter.next();
			tempAcc.print();
			*/
			accIter.next().print();
			// 이거 Iterator로 선언할 때 Account형으로 강제 캐스팅 해줬으니까 accIter.next().print(); 도 쓸 수 잇음!!!!!!1
		}
		
		
		
		
		
		
		
		
	}

}
