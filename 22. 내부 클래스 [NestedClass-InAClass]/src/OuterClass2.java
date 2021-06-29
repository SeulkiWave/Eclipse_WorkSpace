// 형식 외우기!

public class OuterClass2 {
	public int outerMemberField2;
	public void outerMemberMethod1() {
		// (1) A Class, B Class(Abstract), C Interface의 메소드를 Override/Implement한 객체 생성
		// (2) 재정의 메소드 호출
		// (3) A Class, B Class, C Interface를 상속 받은 자식 클래스의 객체 생성
		
		AClassChild acc = new AClassChild();
		// AClass acc = new AClassChild(); - 가능하다! 상위 타입으로의 자동 캐스팅~
		BClassChild bcc = new BClassChild();
		CInterfaceImpl ccc = new CInterfaceImpl();
		acc.methodA();
		bcc.methodB();
		ccc.methodC();
	}
	public void outerMemberMethod2 () {
		// 내부 클래스 작성?
		// 1. A Class, B Class, C Interface를 상속 받은 자식 클래스 작성
		// 2. A Class - methodA, B Class - methodB, C Interface - methodC의 메소드를 재정의
		// 3. A Class, B Class, C Interface를 상속 받은 자식 클래스 객체 생성
		// 4. 재정의 메소드 호출
		
		AClass aCla = new AClassChild2();
		BClass bCla = new BClassChild2();
		CInterface cInt = new CInterfaceImpl2();
		
		aCla.methodA();
		bCla.methodB();
		cInt.methodC();
	}
	
	/*
	private AClass aCla;
	private BClass bCla;
	private CInterface cInterface;
	
	 * 다른 메소드 내에서 AClass acc = new Aclass... 이런 생성이 아니라
	 * this.aCla = new AClass... 등의 호출이 가능하다.
	 * 중요한 건 객체가 들어온다는 걸 인식하기~
	 */
	
	// 특정 클래스를 상속 받아서 메소드를 재정의한 Inner Class : memberInnerClass
	public class AClassChild2 extends AClass {
		@Override
		public void methodA() {
			System.out.println("AClassChild2에서 Override : methodA");
		}
	} // AClassChild2 end
	public class BClassChild2 extends BClass {
		@Override
		public void methodB() {
			System.out.println("BClassChild2에서 Override : methodB");
		}
	} // BClassChild2 end
	public class CInterfaceImpl2 implements CInterface {
		@Override
		public void methodC () {
			System.out.println("CInterfaceImpl2에서 Override : methodC");
		}
	} // CInterfaceImpl2 end
	
	public void outerMemberMethod3 () {
		// 익명의 local 내부 클래스 작성 : anonymous class
		// 1. AClass, BClass, CInterface를 상속받은 "이름 없는" 자식 클래스를 outerClass2.method3 메소드에 작성...
		// 2. AClass - methodA, BClass - methodB, CInter - methodC 메소드를 재정의
		// 3. AClass, BClass, CInter를 상속 받은 자식 클래스 객체 생성
		// 4. 재정의된 메소드 호출
		
		AClass aCla = new AClass() { // 이름 없는 클래스...의 재정의? {} class body를 붙이면서 시작됨
			@Override
			public void methodA() {
				System.out.println("AClass를 상속 받는 '이름 없는 클래스'에서 AClass.methodA()를 재정의!");
			}
			public void method1() {}
		}; // aCla 생성 end
		aCla.methodA();
		
		// BClass bCla = new BClass(); --> Cannot instantiate the type BClass : 객체화 할 수 없다!
		BClass bCla = new BClass() { // --> 상속 받았으니 재정의도 시켜줘야 하는 귀찮은 추상 ..
			@Override
			public void methodB() {
				System.out.println("BClass를 상속 받는 '이름 없는 클래스'에서 BClass.methodB()를 재정의함!");
			}
			public void method1() {}
			public void method2() {}
			
		};
		bCla.methodB();
		// aCla.method1(); --> The method method1() is undefined for the type AClass
		// bCla.method1; --> 재정의한 메소드가 아니라서 호출할 수 없다... 타입이 정해지지 않음 
		
	} // method 3 end
	CInterface cInter = new CInterface() {
		@Override
		public void methodC() {
			System.out.println("CInterface를 구현/상속하는 '이름 없는 클래스'에서 CInterface.methodC()를 재정의!");
		}
	};
	
	public void outerMemberMethod4 () {
		AClass aClass = new AClass () {
			@Override
			public void methodA() {
				System.out.println("AClass를 상속받는 이름 없는 클래스(2..)에서 AClass.methodA를 재정의한다~");
			}
		};
		BClass bClass = new BClass() {
			@Override
			public void methodB() {
				System.out.println("BClass를 상속받는 이름 없는 클래스2에서 BClass.methodB를 재정의..");
			}
		};
		CInterface cInterface = new CInterface() {
			@Override
			public void methodC() {
				System.out.println("CInterface를 상속 받는 이름 없는 클래스2에서 CInterface.methodC를 재정의한다....");
			}
		};
		
		System.out.println("JAVA API ----- ----- ----- ----- -----");
		Object o = new Object() {
			@Override
			public String toString() {
				return "Object의 이름 없는 자식 클래스의 재정의 메소드A";
			}
		};
		System.out.println(o.toString());
		System.out.println(
		new Object () { // 이건 또 어케되는겨
			@Override
			public String toString() {
				return "Object의 이름 없는 자식 클래스의 재정의 메소드B";
			}
		}.toString() // <-- 이렇게 사용할 수도 있다 ..
		);
		
	} // method4 재정의
	
	
	
} // outerClass end
