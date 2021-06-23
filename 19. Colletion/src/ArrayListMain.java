
public class ArrayListMain {

	public static void main(String[] args) {
		
		System.out.println("Object[] ==============================");
		Object[] anyTypeArray = new Object [5];
		// 참조변수가 들어감... Object가 아닌 객체 . . . Wrapper가 들어갈 수 없음! 기본형! 못 가!
		System.out.println(anyTypeArray); // Object 배열 객체는 있지만 Object 클래스는 없다! Object를 상속받고 length를 가짐~
		
		anyTypeArray[0] = new Account (1111, "AAA", 300030,  9.15);
		anyTypeArray[1] = new Account (2222, "BBB", 41698520,  0.51);
		anyTypeArray[2] = new Account (3333, "CCC", 415650,  0.48);
		anyTypeArray[3] = new Account (4444, "DDD", 16530,  0.7);
		anyTypeArray[4] = new Account (5555, "EEE", 86490,  1.5);
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAcc = (Account)anyTypeArray [i];
			tempAccount.print();
		}
		
		System.out.println("==============================");
		ArrayList accountList = new ArrayList();
		
		
	}

}
