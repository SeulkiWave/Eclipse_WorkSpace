/*
 * 오버라이딩(재정의)
 *   1. 상속 관계에서 발생하는 메쏘드의 재정의 기법이다
 *   2. 자바의 다형성 기법 중의 하나이다.
 *   
 *   -형태 : 상위 클래스에 정의된
 *  	 ""메소드의 이름, 리턴타입, 인자가 동일""한 메소드를
 *  	 하위 클래스에 정의 (재정의) 하는 것
 * 
 * ex>
 *		public class Super{
 * 		public void print(){
 * 		}		
 *  }
 *        
 * public class Sub extends Super{
 *  	public void print(){
 *  	}
 *  }
 * 
 */

class OverridingParent {
	public void method1() {
		System.out.println("OverridingParent.method1");
	}
	public void method2() {
		System.out.println("OverridingParent.method2");
	}
}

class OverridingChild extends OverridingParent{
	
	public void method2(){
		
		// Parent에서 상속받아 Child가 소유중인 method2를 Child가 재정의함!! 덮어쓰기!!
		// Child가 가지고 있는 상태에서!!!!!!!!!!!!!!! 덮어쓰기!!! 안 가진 상태에서 덮어쓰기불가능
		
		System.out.println("OverridingChild에서 재정의된 method2()=====(Start)");
		/*
		 * super(self참조변수)
		 * 		- this와 같은 self 참조변수~
		 * 		- this와 같은 주소를 가리킨다
		 * 		- >>"재정의에 의해 은폐된!"<< 멤버 메소드를 호출할 때만 사용할 수 있다!
		 */
		super.method2(); // 2%
		
		System.out.println("OverridingChild에서 재정의된 method2()=====(End)");
		/*
		 * 상속된 method2
		 * 재정의된 method2
		 * - 상속받은 method2()는 은페되며 호출이 불가능하다. (방법은 있다고..)
		 * - 하위 클래스에서 재정의한 method2()만 호출이 가능하다~
		 */
	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
}

public class OverridingMain {

	public static void main(String[] args) {
		
		OverridingChild oc1 = new OverridingChild();
		oc1.method1(); // Child꺼!!!!!!!!
		oc1.method2();
		oc1.method3();
	}

}
