// OuterClass의 객체가 만들어지면 그떄 OuterClass의 멤버 필드, 메소드가 사용가능하고 innerClass도 그떄 사용이 가능하다~

public class OuterClass {
	// 클래스의 구성요소
	public int outerMemberField; // 인스턴스 멤버 필드
	public void outerMemberMethod() { // 인스턴스 멤버 메소드
		System.out.println("OuterClass.outerMemberMethod()");
	}
	
	// 외부 클래스에서 내부 클래스 사용
	public void outerInnerClassUse() {
		// InnerClass 객체 생성
		// OuterClass.InnerClass innerClassOjbect = new InnerClass();
		InnerClass innerClassObject =  new InnerClass(); // outerClass.가 생략되어 있음!
		
		// InnerClass 객체 멤버 사용 : outer에서만 사용이 가능하다.. 밖에서는 outerClass. 라는 주소를 붙여줘야 함!
		innerClassObject.innerMemberField = 123456;
		innerClassObject.innerMemberMethod();
		
		
	}
	
	
	// 인스턴스 멤버 !클래스! - Nested class / Inner Class / 내부 클래스
	public class InnerClass { // 클래스 안에 클래스가 규정define됨
		public int innerMemberField;
		public void innerMemberMethod() {
			System.out.println("InnerClass.innerMemberMethod()");
		}
		// 내부 클래스의 사용 이유...
		//	- 내부 클래스(객체)에서 외부 클래스(객체)의 멤버 필드, 메소드 접근을 쉽게 하기 위해서!
		public void innerOuterMemberAccess() {
			// 이 메소드의 this는...  Inner
			InnerClass.this.innerMemberField = 123; // 이제껏 썼던 this는 앞에 가리키는 클래스의 이름이 생략되어 있었음...
			OuterClass.this.outerMemberField = 456; // 평소엔 구분할 필요가 없어서 생략해도 괜찮았지만 이처럼 내장된 경우 구분이 필요하다
			// 아무 것도 안 썼을 때: 가장 '가까운' 클래스! - 구분하고 싶을 땐 지정해주기~
			outerMemberField = 789; // 로컬변수 - 가장 가까운 클래스 (현재는 Inner) - 그 다음 클래스 (Outer) 순으로 찾음!
			// OuterClass.this.outerMemberField = 789; 와 동일하다~
			outerMemberMethod(); // 메소드도 동일~
			
		}
	} // Inner end
} // OuterClass end
