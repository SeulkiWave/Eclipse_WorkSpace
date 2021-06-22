class MemberMethodReturn{
	int member1= 69;
	int member2= 74;
	
	public int method1() {
		System.out.println("--- public int method1() ---");
		
		int result= 1+2;
		
		// return <<호출한 클래스(객체)에게 반환할 값(변수, 리터럴, 연산 결과)>>
				// - 호출한 곳으로 스레드(실행 흐름) 반환 
				// - 호출한 곳으로 데이터 반환
				// - 반환할 데이터가 없는 경우 (= void) return; 생략 가능하다
				// - 반환할 데이터가 있는 경우 return문을 반드시 기술해야 함..
				
		return result;
		// !리턴타입과 return문에 같이 적힐 리턴 타입이 동일해야 한다!
		// void methods cannot return a value
	}
	
	public boolean method2() {
		System.out.println("--- public boolean method2() ---");
		boolean married= false;
		return married;
	}
	
	/*
	 * 두 개의 정수를 매개 변수(인자)로 받아서 더한 후 결과 값을 반환하는 기능을 가진 메소드
	 */
	public int add(int a, int b) {
		System.out.println("--- public int add (int a, int b) ---");
		int result= a + b;
		return result;
	}
	
	public int addMembers() {
		System.out.println("--- public int addMembers() ---");
		// 객체의 멤버 변수 2개를 더한 결과 값을 반환!
		int result= this.member1+this.member2;
		return result;
	}
	
	/*
	 * 객체의 멤버 필드 데이터를 (외부로) 반환시켜준다: getter
	 */
	public int getMember1() {
		return this.member1;
	}
	public int getMember2() {
		return this.member2;
	}
	
	/*
	 * 객체의 멤버 필드 데이터를 (외부에서) 설정해줌: setter
	 */
	public void setMember1(int member1) {
		this.member1= member1;
	}
	public void setMember2(int member2) {
		this.member2= member2;
	}
	
	
	
}


public class MemberMethodReturnMain {

	public static void main(String[] args) {
		
		MemberMethodReturn mmr= new MemberMethodReturn();
		
		/*
		 * public int method1();
		 */
		int recvData1 = mmr.method1(); // 반환한 데이터를 recvData1이 받음~!
		System.out.println("main block --> recvData1: "+recvData1);
		
		/*
		 * public boolean method2()
		 */
		boolean recvData2= mmr.method2();
		System.out.println("main block --> recvData2: "+recvData2);
		
		/*
		 * public int add (int a, int b)
		 */
		int addResult= mmr.add(12, 345678);
		System.out.println("main block --> addResult: "+addResult);
		addResult= mmr.add(1684,212);
		System.out.println("main block --> addResult: "+addResult);
		
		System.out.println("--- This 를 사용해 멤버 필드의 데이터를 더한 후 반환 ---");
		/*
		 * public int addMembers()
		 */
		int recvAddMembers= mmr.addMembers();
		System.out.println("main block --> recvAddMembers: "+recvAddMembers);
		
		System.out.println("--- 멤버 변수의 데이터를 설정하기 : setter ---");
		mmr.setMember1(333);
		mmr.setMember2(666);
		
		System.out.println("--- 멤버 변수의 데이터를 반환받기 : getter ---");
		// System.out.println(mmr.member1);
		// int recvMember1= mmr.Member1;
		int recvMember1= mmr.getMember1();
		System.out.println("recvMember1: "+recvMember1);
		int recvMember2= mmr.getMember2();
		System.out.println("recvMember2: "+recvMember2);
		
		
		
	}

}
