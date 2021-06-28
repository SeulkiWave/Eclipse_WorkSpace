package noGeneric;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet accSet = new HashSet();
		System.out.println("#set size: "+accSet.size()); // collection에 있어서 size가 있다~.~
		
		Account acc1 = new Account (1111, "AAA", 300030,  9.15);
		Account acc2 = new Account (2222, "BBB", 41698520,  0.51);
		Account acc3 = new Account (3333, "CCC", 415650,  0.48);
		Account acc4 = new Account (4444, "AAA", 16530,  0.7);
		Account acc5 = new Account (5555, "EEE", 86490,  1.5);
		
		System.out.println("1. add ------------------------------");
		accSet.add(acc1);
		accSet.add(acc2);
		accSet.add(acc3);
		accSet.add(acc4);
		accSet.add(acc5);
		System.out.println("#set size: "+accSet.size());
		System.out.println(accSet);
		
		System.out.println("1. add : 같은 객체! ------------------------------");
		// equals 메소드를 사용해 중복 체크를 한다?
		boolean isAdd1 = accSet.add(acc2);
		System.out.println("isAdd1: "+isAdd1);
		boolean isAdd2 = accSet.add(acc3);
		System.out.println("isAdd2: "+isAdd2);
		System.out.println(accSet); // 그대로~
		System.out.println("#set size: "+accSet.size());
		
		// get 메소드가 없음...
		System.out.println("2. remove ------------------------------");
		boolean isRemove = accSet.remove(acc1); // 참조 변수가 있어야 지울 수 있다~.~
		System.out.println("isRemove: "+isRemove);
		isRemove = accSet.remove(acc1);
		System.out.println("isRemove: "+isRemove);
		
		System.out.println("#set size: "+accSet.size());
		System.out.println(accSet);
		
		// set과 map의 전체 출력 과정은 비슷하다~
		System.out.println("3. Iterator ------------------------------");
		// accSet.iterator(); // 얜 멀까....
		Iterator accIter = accSet.iterator(); // set은 꺼낼 수가 없으니까...? 그걸 재배치해서 Iterator형 객체에 넘겨주면 ,,., 그 주소값을 갖는...?
		System.out.println(accIter); // 도대체머임...
		
		while (accIter.hasNext()) { // n번째는 존재하지 않지만, '다음 번'은 존재한다~ 있으면 true / 없으면 false
			Account accTemp = (Account) accIter.next(); // Object니까 강제형변환~
			accTemp.print();
		}
		// accIter.next(); <-- 이거 오류! false 일 때 뽑으면 안 됨!
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
