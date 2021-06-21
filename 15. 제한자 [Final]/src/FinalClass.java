public class FinalClass {
	public void method1() {
		System.out.println("FinalClass.method1");
	}
	public final void method2() {
		System.out.println("FinalClass.method2:"
				+ "final Method!, 재정의 금지!");
	}
}
