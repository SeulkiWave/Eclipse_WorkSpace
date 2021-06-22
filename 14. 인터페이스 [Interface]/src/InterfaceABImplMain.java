/*
 인터페이스
	1. 클래스가 가진 모든 메소드가 추상 메소드임
	2. 다중 상속의 효과를 냄 --> 상위 클래스가 여러개일 수 있다!
		(클래스는 불가능하나 인터페이스는 가능하다!)
	
	- 형식
	* class keyword 대신에 interface 라는 keyword를사용
	* 추상 메소드 앞에 abstract 를 붙이지 않는다. // 어차피 다 추상이니까~
		ex>public interface Test{
			public void method1(); // body가 구현되는 순간 error
			public void method2();
		}
		
	- 사용
	1. interface를 (거시적의미) 상속(implement's') 받아서 --> implement를 여러개 할 수 있어서 s! (늑대인간-> 늑대, 인간을 상속받음: 늑대, 인간이 인터페이스)
	2. 추상 메소드를 재정의(구현)한 후 사용한다. // 안 하면 하위 클래스 자체가 정의되지 않음!
		ex> public class TestImpl implements Test{ : extends Object가 생략 되어 있음!
			// 이때 부모가 여러개 : Object, Test
			 * --> 이때 tempImpl은 상위 클래스로 캐스팅이 가능하다 : Object TestImpl, Test TestImpl이 가능하다...
				public void method1(){}
				public void method2(){}
			}
*/

public class InterfaceABImplMain {

	public static void main(String[] args) {
		
		System.out.println("InterfaceABImpl: ==================================================");
		
		InterfaceABImpl abImpl = new InterfaceABImpl();
		
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		
		System.out.println("Object: ==================================================");
		
		Object o = abImpl; // o = #3번지
		// o. 메소드 호출이 불가능하다?
		// o.method1();
		// o.method2();
		// o.method3();
		// o.method4();
		
		System.out.println("InterfaceA: ==================================================");
		InterfaceA ia = abImpl; // ia = #3번지
		ia.method1();
		ia.method2();
		// ia.method3();
		// ia.method4();
		System.out.println("InterfaceB: =================================================");
		InterfaceB ib = abImpl; // ib = #3번지
		// ib.method1();
		// ib.method2();
		ib.method3();
		ib.method4();
		
		System.out.println("InterfaceA <--> InterfaceB: =================================================");
		InterfaceA ia2 = new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		InterfaceB ib2 = (InterfaceB)ia2; // 객체 자체는 하나지만... 가능하다!
		ib2.method3();
		ib2.method4();
		
		
		
		
		
		
		
	}

}
