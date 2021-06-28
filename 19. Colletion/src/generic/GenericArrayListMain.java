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
			Account tempAcc = accList.get(i); // accList는 ArrayList 타입으로 들어가있으니까 Account 타입으로 꺼내주자~
			tempAcc.print();
		}
		
		System.out.println("========== < 계 좌 번 호  1 개 로  계 좌 찾 기 > ==========");
		System.out.println("2. 계좌 번호로 계좌 찾기"); // 계좌 번호는 3333이라고 생각하자~
		for (int i = 0; i < accList.size(); i++) {
			Account tempAcc = accList.get(i);
			if (tempAcc.getNo() == 3333) {
				tempAcc.print();
				break;
			}
		}
		
		System.out.println("========== < 계 좌 주  이 름 으 로  계 좌 찾 기 > ==========");
		for (int i = 0; i < accList.size(); i++) {
			Account findAcc = accList.get(i);
			if (findAcc.getOwner().equals("AAA")) {
				findAcc.print();
			}
		}
		
		System.out.println("========== < 계 좌 번 호 로  해 당  계 좌  삭 제 > ==========");
		for (int i = 0; i < accList.size(); i++) {
			Account delAcc = accList.get(i);
			if (delAcc.getNo() == 3333) {
				accList.remove(i); // 이렇게 위로 갔다 아래로 가는 게 맞는지...
				break;
			}
		}
		
		System.out.println("========== < 계 좌 주  이 름 으 로  여 러 개 의  계 좌 삭 제 > ==========");
		for (int i = 0; i < accList.size(); i++) {
			Account delAcc = accList.get(i);
			if (delAcc.getOwner().equals("AAA")) {
				accList.remove(i);
				i--;
			}
		}
		
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
		
		System.out.println("=============== S t r i n g ,  W r a p p e r ===============");
		
		System.out.println("S T R I N G - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		ArrayList <String> nameList = new ArrayList<String>();
		nameList.add("AAA");
		nameList.add(new String ("BBB")); // 동일하다~
		nameList.add("CCC");
		nameList.add("DDD");
		nameList.add("EEE");
		nameList.add("FFF");
		nameList.add("GGG");
		nameList.add("HHH");
		nameList.add("III");
		nameList.add("III"); // ArrayList는 중복을 허용한다~ 
		// String은 char[]이 같으면 같은 객체로 취급하지만 ArrayList라서 다른 참조 변수를 가진다!. 암튼 다 같이 들어감
		System.out.println("# Name List Size: "+ nameList.size());
		System.out.println(nameList);
		
		System.out.println("=============== ADD ===============");
		nameList.add(3, "KKK");
		System.out.println("# Name List Size: "+ nameList.size());
		System.out.println(nameList);
		
		System.out.println("=============== REMOVE ===============");
		String rmvName = nameList.remove(3);
		System.out.println("Remove Name: "+rmvName);
		System.out.println("# Name List Size: "+ nameList.size());
		System.out.println(nameList);
		
		// String과 Wrapper는 Equals/HashCode 메소드가 재정의 되어있다...
		// < boolean java.util.ArrayList.remove (Object o) >
		// Removes the first occurrence of the specified element from this list, if it is present
		// 동일한 결과의 객체 중 첫 번째 객체를 삭제한다~ (존재하면~)
		boolean isRemove = nameList.remove(new String("FFF"));
		System.out.println("# Name List Size: "+nameList.size());
		System.out.println(nameList);
		
		nameList.remove("III"); // 결과가 동일한 객체 1개만 삭제된다~~
		System.out.println("# Name List Size: "+nameList.size());
		System.out.println(nameList);
		
		
		System.out.println("W R A P P E R - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(new Integer(90));
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(56);
		scoreList.add(34);
		scoreList.add(12);
		scoreList.add(99);
		scoreList.add(62);
		scoreList.add(43);
		scoreList.add(99); // 상위로 캐스팅 되는 걸 잘 생각해보기...
		
		System.out.println("=============== ADD ===============");
		System.out.println(scoreList);
		int scoreGet = scoreList.get(3); // --> 56 : 0번부 터 시 작 한   ㄷ ㅏ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 들어가 있는 객체 : Integer --> Boxing(Wrapping) 돼서 들어간다~
		// 꺼낼 때도 자동으로 unBoxing 돼서 나옴...
		// 97. Java API \ lang \ wrap 참고하기 
		System.out.println("Get Score: "+scoreGet);
		
		scoreGet = scoreList.get(1);
		System.out.println("Get Score: "+ scoreList.get(1).intValue()); // 위와 아래가 동일하다~
		// 사용하는 객체의 차이 + Boxing / UnBoxing 과정을 이해하기
		/*
		System.out.println("scoreList.get(1): "+ scoreGet);
		Integer scoreInt = scoreList.get(1); // Generic~
		scoreGet = scoreInt.intValue(); // auto UnBoxing
		int score = scoreList.get(3); // generic --> auto Boxing
		System.out.println("scoreList.get(3): "+score);
		*/
		
		System.out.println("=============== SET ===============");
		scoreList.set(3, 100);
		System.out.println("# Set Size: "+scoreList.size());
		System.out.println(scoreList);
		
		System.out.println("=============== REMOVE (int index) ===============");
		scoreList.remove(3);
		System.out.println("# Set Size: "+scoreList.size());
		System.out.println(scoreList);
		
		System.out.println("=============== REMOVE (Object o) ===============");
		scoreList.remove(new Integer(90));
		// scoreList.remove(90); 는 90번 index가 사라진다~ : Exception
		System.out.println("# Set Size: "+scoreList.size());
		System.out.println(scoreList);
		
	} // M A I N   E N D

}
