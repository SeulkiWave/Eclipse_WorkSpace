
public class InterfaceABImpl implements InterfaceA, InterfaceB {
	// The type interfaceABimpl must implement the inherited abstract method interfaceA.method2()
	
	@Override
	public void method1() { // 옆에 삼각형 specified-abstract! (implement는 interface)
		// 다 비슷한 override지만 어떤 것에서 생성된 것인지 확인하기 위한 구분~
		System.out.println("InterfaceA.method1()의 implement(구현, 넓은 의미의 재정의)");	
	}
	@Override
	public void method2() {
		System.out.println("InterfaceA.method2()의 implement(구현, 넓은 의미의 재정의)");
	}
	@Override
	public void method3() {
		System.out.println("InterfaceB.method3()의 implement(구현, 넓은 의미의 재정의)");
	}
	@Override
	public void method4() {
		System.out.println("InterfaceB.method4()의 implement(구현, 넓은 의미의 재정의)");
	}
	
	
}
