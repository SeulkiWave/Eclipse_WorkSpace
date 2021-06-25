import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		
		System.out.println("Object[] ==============================");
		Object[] anyTypeArray = new Object [5];
		// 참조변수가 들어감... Object가 아닌 객체... Wrapper가 들어갈 수 없음! 기본형! 못 가!
		System.out.println(anyTypeArray); // Object 배열 객체는 있지만 Object 클래스는 없다! Object를 상속받고 length를 가짐~
		Account acc1 = new Account (1111, "AAA", 300030,  9.15);
		Account acc2 = new Account (2222, "BBB", 41698520,  0.51);
		Account acc3 = new Account (3333, "CCC", 415650,  0.48);
		Account acc4 = new Account (4444, "AAA", 16530,  0.7);
		Account acc5 = new Account (5555, "EEE", 86490,  1.5); // Account 형의 객체 5개 생성
		
		anyTypeArray[0] = acc1;
		anyTypeArray[1] = acc2;
		anyTypeArray[2] = acc3;
		anyTypeArray[3] = acc4;
		anyTypeArray[4] = acc5; // Object 배열 객체 타입에 Account형 타입 객체를 대입...
											// --> Account형 객체가 Object 타입으로 자동 형변환(자식-->부모)
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAcc = (Account)anyTypeArray [i]; // Object 배열 객체를.. Account로 강제 형변환 하구
			tempAcc.print(); // 출력~
		}
		
		System.out.println("==============================");
		ArrayList accList = new ArrayList(); // 새로운 arrayList형... 객체 생성? 이건 클래스가 아니니까 Object[] 형!!!!!!!
		System.out.println("# size: "+accList.size()); // 근데 아무것두 업슴
		
		System.out.println(" ADD : =============================="); // Account Service 랑 비교하면서 생각해보기
		accList.add(acc1); // 첨부터 순서대로 대입~
		accList.add(acc2);
		accList.add(acc3);
		accList.add(acc4);
		accList.add(acc5);
		System.out.println("# size: "+accList.size());
		
		accList.add(3, new Account(1594, "AAA", 9000, 99)); // 3번! 인덱스에 들어감 0 , 1, 2, 3<- 얘한테!
		// 그리고 뒤에 있는 애들이 뒤로 밀림~
		System.out.println(">> "+ accList); // 이거 고치자..
		System.out.println("# size: "+accList.size()); // 사이즈 증가~
		
		System.out.println(" SET : =============================="); // 값 설정~
		accList.set(3, new Account(3337, "XXX", 418940, 11.1)); // 3번 인덱스에 해당 객체를 새로 생성해서 지정해줌.. 결국 참조~
		System.out.println(accList);
		System.out.println("# size: "+accList.size());
		
		System.out.println(" GET : =============================="); // 특정 인덱스의 객체를 참조받기 위한 메소드
		// 정보가 날아가는 건 아님
		Account getAccount = (Account) accList.get(1); // Object 타입! --> 반환도 Object 타입 : 강제 형변환이 필요하다
		getAccount.print();
		getAccount = (Account) accList.get(accList.size()-1);
		getAccount.print();
		
		System.out.println(" REMOVE : =============================="); // 제거...
		accList.remove(3); // 3번 arrayList 를 제거 . . . . . . object 배열 객체의 3번 객체를 제거?
		System.out.println(accList);
		System.out.println("# size: "+accList.size()); // 사이즈가 줄어든다~
		
		// 업무 실행
		System.out.println(" 전체 출력 : ==============================");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAccount = (Account) accList.get(i);
			System.out.println(tempAccount);
		}
		
		System.out.println(" 계좌 1개를 계좌 번호로 찾기 : ==============================");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAcc = (Account) accList.get(i);
			if (tempAcc.getNo() == 3333) {
				tempAcc.print();
				break;
			}
		}
		
		System.out.println(" 계좌 여러개를 계좌 이름으로 찾기 : ==============================");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAcc = (Account) accList.get(i);
			if (tempAcc.getOwner().equals("AAA")) {
				tempAcc.print();
			}
		}
		
		System.out.println(" 계좌번호가 4444인 객체 1개 삭제 : ==============================");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAcc = (Account) accList.get(i); // accList는 Object 배열이니까 강제 형변환이 필요하다
			if (tempAcc.getNo() == 4444) {
				Account delAcc = (Account) accList.remove(i); // 이 순간 accList의 사이즈가 변경됨
				System.out.println("#remove size: "+ accList.size());
				delAcc.print();
				break;
			}
		}
		
		System.out.println("확인용 계좌 전체 출력");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAccount = (Account) accList.get(i);
			System.out.println(tempAccount);
		}
		
		System.out.println(" 계좌주 이름으로 계좌 여러개 삭제 : ==============================");
		for (int i = 0; i < accList.size(); i++) {
			Account tempAcc = (Account) accList.get(i);
			if(tempAcc.getOwner().equals("AAA")) {
				Account delAcc = (Account) accList.remove(i); // remove 하자마자 size 가 줄어듦.. 2-3 연달아 만들엇으면 인덱스 재조정 과정에서 3번을 검사하지 않는 . . . . 흠
				i--; // 3번꺼가 2번으로 가니까 다시 검사를 해줘야 함 ...
				System.out.println("Delete Acc: "+delAcc.toString());
			}
		}
		
		System.out.println(" ☆★☆★☆ Iteration 전체 출력: ==============================");
		Iterator accIter = accList.iterator();
		while (accIter.hasNext()) {
			Account accTemp = (Account) accIter.next();
			accTemp.print();
		}
		
		
		
		
		
		
	}

}
