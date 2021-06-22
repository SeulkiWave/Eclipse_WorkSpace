/*
	<< 추 상 클 래 스 >>
	1. 정의: 하나 이상의 추상 메소드가 정의되어 있는 클래스
			추상 메소드가 존재하지 않으나 객체 생성을 막기 위해 만든 클래스
		- public abstract class Test{ // 추상 메소드();
         	public abstract int print(int i); // 구현된(일반) 메소드(); = 추상 메소드! abstract method
         	public void test(){ // concrete method
         	}
         }
		==> 추상 메소드: 메소드의 구현 부분이 없고 선언(원형:signature/prototype)만 존재하는 메쏘드
            ex> public abstract int print(int i);             
	2. 추상 클래스는 불완전한 추상 메소드를 가지므로 객체 생성이 불가능하다.
		- Test t=new Test();(X)
	3. 추상 클래스는 추상 클래스를 상속 받아서
		추상 메소드를 구현(specified)하는 자식 클래스를 만들어 사용(자식 객체 생성) 해야한다.
*/

public abstract class AbstractClass {
	
	public void method1() {
		System.out.println("Concrete Method : 구상 메소드");
	}
	
	public abstract void method2();
	
}
