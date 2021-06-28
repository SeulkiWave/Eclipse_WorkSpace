package generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericHashSetMain {

	public static void main(String[] args) {
		
		HashSet<Account> accSet = new HashSet<Account>();
		// <Account> 외에도 <? extends E> 가 가능하다 : 예를 들자면 extends AcademyMember 일 때 ?는 AcademyStu, Staff, Tea
		// 확장성이 증가한다~
		System.out.println("# Set Size: "+accSet);
		
		Account acc1 = new Account (1111, "AAA", 300030,  9.15);
		Account acc2 = new Account (2222, "BBB", 41698520,  0.51);
		Account acc3 = new Account (3333, "CCC", 415650,  0.48);
		Account acc4 = new Account (4444, "AAA", 16530,  0.7);
		Account acc5 = new Account (5555, "EEE", 86490,  1.5);
		
		System.out.println("=============== ADD ===============");
		accSet.add(acc1);
		accSet.add(acc2);
		accSet.add(acc3);
		accSet.add(acc4);
		accSet.add(acc5);
		System.out.println("# Set Size: "+accSet);
		System.out.println(accSet);
		
		System.out.println("=============== ADD : 같은 객체 ===============");
		boolean isAdd = accSet.add(acc2);
		System.out.println("isAdd: "+isAdd);
		isAdd = accSet.add(acc3);
		System.out.println("isAdd: "+isAdd);
		System.out.println("# Set Size: "+accSet.size());
		System.out.println(accSet);
		
		System.out.println("=============== REMOVE ===============");
		boolean isDel = accSet.remove(acc2);
		System.out.println(isDel);
		System.out.println("# Set Size: "+accSet);
		System.out.println(accSet);
		
		System.out.println("=============== < I T E R A T I O N > ===============");
		Iterator<Account> accIter = accSet.iterator(); // 이거 잘 기억해...
		while (accIter.hasNext()) {
			Account account = (Account) accIter.next();
			account.print();
		}
		
		
		
		System.out.println("=============== S t r i n g ,  W r a p p e r ===============");
		
		System.out.println("S T R I N G - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("=============== ADD ===============");
		Set<String> nameSet = new HashSet<String>();
		nameSet.add(new String("AAA"));
		nameSet.add("BBB");
		nameSet.add("CCC");
		nameSet.add("DDD");
		nameSet.add("EEE");
		System.out.println("# Name Set Size: "+nameSet.size());
		System.out.println(nameSet);
		
		// 중복 추가
		nameSet.add("AAA"); // set은 중복 안 됨~
		System.out.println("# Name Set Size: "+nameSet.size());
		System.out.println(nameSet);
		
		System.out.println("=============== REMOVE ===============");
		System.out.println("Remove Name: "+nameSet.remove("AAA")); // 중복이면 삭제 안 됨... --> true // boolean 
		System.out.println("# Name Set Size: "+nameSet.size());
		System.out.println(nameSet);
		
		System.out.println("Remove Name: "+nameSet.remove("AAA")); // 중복이면 삭제 안 됨... --> false
		System.out.println("# Name Set Size: "+nameSet.size());
		System.out.println(nameSet);
		
		System.out.println("=============== ITERATION ===============");
		Iterator<String> nameIter = nameSet.iterator();
		while (nameIter.hasNext()) {
			String nameTemp = nameIter.next();
			System.out.println(nameTemp);
		}
		
		
		System.out.println("W R A P P E R - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("=============== ADD ===============");
		Set<Integer> lottoSet = new HashSet<Integer>();
		lottoSet.add(new Integer(34));
		lottoSet.add(12);
		lottoSet.add(2);
		lottoSet.add(41);
		lottoSet.add(11);
		System.out.println("# Size: "+lottoSet.size());
		System.out.println(lottoSet);
		
		System.out.println("=============== ADD: 중복 객체 ===============");
		// 주소 비교를 하지 않고 값 비교를 사용한다... --> 중복 저장 안 됨~
		isAdd = lottoSet.add(34);
		System.out.println(" - isAdd: "+isAdd);
		isAdd = lottoSet.add(12);
		System.out.println(" - isAdd: "+isAdd);
		isAdd = lottoSet.add(2);
		System.out.println(" - isAdd: "+isAdd);
		isAdd = lottoSet.add(41);
		System.out.println(" - isAdd: "+isAdd);
		isAdd = lottoSet.add(11);
		System.out.println(" - isAdd: "+isAdd);
		isAdd = lottoSet.add(0212);
		System.out.println(" - isAdd: "+isAdd);
		
		System.out.println("=============== REMOVE ===============");
		// Set은 index가 없다 . . .. 
		boolean isRemove = lottoSet.remove(34); // 34라는 값을 가진 객체를 삭제해 ~ 중복삭제는 되지 않는다 . . (중복삭제라는게 애초에 말이 좀 안 됨)
		System.out.println(" - isRemove: "+isRemove);
		System.out.println(lottoSet);
		// String 객체의 주소비교이기 때문에... 애초에 중복 값이 저장될 수 없는...
		// 제대로 이해하 자 ~ 못 하면 외워~
		
		System.out.println("=============== ITERATION ===============");
		Set<Integer> lotto = new HashSet<Integer>();
		while (lotto.size() < 6) {
			lotto.add((int)Math.random()*45+1);
		}
		System.out.println(">> lotto: "+lotto); // Set은 중복되는 값이 나올 수 없으니까 index를 재조정할 필요가 없다~
		
	}

}
