package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import noGeneric.Account;

public class CollectionsUtilMain {

	public static void main(String[] args) {
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
		intList1.add(34);	intList1.add(45);	intList1.add(78);
		intList1.add(90);	intList1.add(23);	intList1.add(99);
		intList1.add(20);
		
		// intList2, nameList 가 어떤 타입의 객체이든 List의 상위타입인 arrayList로 반환할거니까 굳이 알 필요가 없는.....
		List<Integer> intList2 = Arrays.asList(34, 45, 78, 90, 23, 10, 99, 20);
		List<String> nameList = Arrays.asList("김슬기", "김슬긱", "김슬긴", "김슬긷", "김슬길", "김슬김", "김슬깁", "김슬깃");
		List<Account> accList = Arrays.asList(
				new Account(1111, "AAA", 33000, 0.5),
				new Account(2222, "BBB", 64000, 0.1),
				new Account(3333, "CCC", 24000, 0.2),
				new Account(4444, "DDD", 12000, 0.5),
				new Account(5555, "AAA", 99000, 0.8)
				); // 웃긴 새기야... // 배열을 쉽게 Array로 추가할 수 잇당~
		
		System.out.println("=============== SORT ===============");
		System.out.println(" >> intList1 - BEFORE : "+intList1); // 전부 Integer 객체가 들어 있어서! (Comparable: 비교할 수 있는 --> JAVA에서 비교할 수 있는 대상)
		// Comparable To<T>
		Collections.sort(intList1);
		System.out.println(" >> intList1 - AFTER : "+intList1);
		
		System.out.println(" >> nameList - BEFORE : "+nameList); // String도 comparable 인터페이스의 하위 객체~.~ (char[]를 비교할 수 있음)
		Collections.sort(nameList);
		System.out.println(" >> nameList - AFTER : "+nameList);
		
		/*
		 * E N H A N C E D   F O R :
		 * 		인덱스를 사용하지 않는다!
		 * 		for (Account acc : accountList) {}
		 */
		System.out.println("=============== Account Sort ===============");
		for (Account acc : accList) { // 인덱스가 딱히 안 필요한 경우엔 이렇게 써주기, Iterator도 비슷한 원리.. 인덱스 없이 다음 값이 있는가 없는가에 따른 출력~
			acc.print();
		}
		
		// Collections.sort(accList); : The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Account>)
		// 정렬의 기준이 없어서 사용할 수 없음 (해당 메소드에 적합하지 않다...)
		
		// 1. List의 elements는  ! 반드시 !   Comparable interface를 구현해야 한다. : Account는 비교할만한... 기준이 없음
		
		
		
		
		System.out.println("=============== Reverse ===============");
		// 내림차순이 아님! 기존에 있던 배열을 그냥 뒤집어 둔 거 ~0~
		Collections.reverse(intList1);
		System.out.println(intList1);
		Collections.reverse(nameList);
		System.out.println(nameList);
		Collections.reverse(accList);
		System.out.println(accList);
		
		System.out.println("=============== Shuffle ===============");
		Collections.shuffle(intList1);
		Collections.shuffle(nameList);
		Collections.shuffle(accList);
		// 랜덤섞기~
		
		
		
		
		
		
		
		
		
	}

}
