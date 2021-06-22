package prince.korea;
import president.korea.YS;

public class YSChild extends YS {
	
	/* 상속받음..
	public int member1;
	protected int member2; // YSChild 객체가 만들어질 때 YS의 멤버를 사용할 수 있게 잠깐! 열어줌!
	// 상속 받으면 open! 같은 패키지가 아니더라도 상속!!! --> 약한 상속의 강제성이 있다
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	 */
	
	public void access2() {
		this.member1 = 1;
		this.member2 = 2;
		// this.member3 = 3; <-- 접근 불가능~
		// this.member4 = 4;
		
		this.method1();
		this.method2();
		// this.method3();
		// thid.method4();
	}
	
	
	
	
}
