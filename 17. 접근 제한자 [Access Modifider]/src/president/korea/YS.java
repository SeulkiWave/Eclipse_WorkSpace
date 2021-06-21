package president.korea;

import president.america.Biden;

public class YS {
	
	public int member1;
	protected int member2;
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
	
	public void access() {
		// YS와 같은 패키지인 경우 --> import가 필요 없다~
		DJ dj = new DJ();
		dj.member1 = 1;
		dj.member2 = 2;
		dj.member3 = 3;
		// dj.member4 = 4;
		
		dj.method1();
		dj.method2();
		dj.method3();
		// dj.method4();
		
		// YS와 다른 패키지인 경우
		Biden bid = new Biden();
		bid.member1 = 1;
		// bid.member2 = 2;
		// bid.member3 = 3;
		// bid.member4 = 4;
		
		bid.method1();
		// bid.method2();
		// bid.method3();
		// bid.method4();
		
	}
	
}
