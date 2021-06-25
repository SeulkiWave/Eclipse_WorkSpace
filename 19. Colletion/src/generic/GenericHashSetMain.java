package generic;

import java.util.HashSet;
import java.util.Iterator;

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
		
		
		
		
		
		
		
		
		
	}

}
