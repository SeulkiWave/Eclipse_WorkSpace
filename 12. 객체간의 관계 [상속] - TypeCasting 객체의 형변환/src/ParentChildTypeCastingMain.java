/*
 객체의 형변환
   1. 부모 자식 관계에 있는 클래스들에서만 가능하다.
   		=> 자식(하위) 타입 객체의 주소를 부모(상위) 타입 객체의 주소로 형변환 시킬 수 있다... : 자동 형변환
   			= 주소 변경이 되는게 아님!!! 타입만 변경됨!!! 강제형변환도 동일 !!!!!
   		=> 부모(상위) 타입 객체의 주소를 자식(하위) 타입 객체의 주소로 형변환 시킬 수 있다... : 강제 형변환   		
   2. 자식(하위) 객체(의 주소)를 부모(상위) 클래스 타입으로 형변환 - "자동"으로 이루어진다(묵시적)
   		자식: 자식 클래스 형태 --> 부모 클래스 형태
		Child c = new Child();
		Parent pppp = c; 
   3. 부모 객체를 자식 클래스 타입으로 형변환
       - >> 원칙적으로는 불가능하다 <<
       - 부모의 탈을 쓴 자식 객체는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		System.out.println("Parent.method4()");
	}
}
class Child extends Parent{
	public void method3() {
		System.out.println("Child.method3() -- Parent의 method3를 상속 받은 후 Child!!!가 재정의함");
	}
	
	public void method4() {
		System.out.println("Child.method4()");
	}
	public void method5() {
		System.out.println("Child.method5()");
	}
}

public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		
		// 2번~
		System.out.println("Child --> Parent ========================================");
		
		Child c1 = new Child(); // (#3)
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		// 2. 자식 객체 타입의 주소(#3)를 부모 클래스 타입으로 형변환
		Parent p1 = c1; // 주소 값을 #3으로 가져가지만 타입이 달라진다 대입은 가능.. (이게 자동형 변환)
		// 자식 타입 #3이 부모 타입 #3이 되면서 p1이 #3을 가리킴
		
		p1.method1();
		p1.method2();
		p1.method3();
		// p1.method4(); 실제는 자식 객체를 가리키고 있지만 부모 타입이 되면서... 자식 객체만 가진 기능을 사용할 수 없음 
		// p1.method5(); 장점이 많다...? 
		
		//3번~
		System.out.println("Parent --> Child ========================================");
		
		Parent p2 = new Parent();
		// 원랜.. 상위 객체보다 하위 객체가 기능이 더 많이 구현된 경우가 많은데
		// 이 경우 구현되지 않은 기능을 포함하는 상위 객체는 말이 안 됨...
		// Child c2 = p2; Type mismatch cannot convert from Parent to Child
		
		// 부모 타입 객체가 사실은! 자식 타입 객체를 가리키고 있었을 수도 있으니까(모름) 강제 형변환이 가능하고 오류는 발생하지 않는.....
		// 강제 형변환시 컴파일(번역)은 가능하나 예외Exception이 발생한다
		//  - java.lang.ClassCastException: Parent cannot be cast to Child
		// Child c2 = (Child)p2;
		
		Parent p3 = new Child(); // Child 생성자를 사용하는 Parent 타입의 객체...
		// 자식 객체를 가리키는 부모 타입의 객체 . . . . 아주 속이 응큼하고 음흉하고 관상이 좋지않다
		Child c3 = (Child)p3; // 실제 p3가 Child의 객체이기 때문에..
		// 원칙적으로는 자식 타입으로의 강제 형변환이 불가능하나 이 경우에는 예외가 발생하지 않는다.......
		
		System.out.println("Overriding ========================================");
		
		Parent p4 = new Child();
		p4.method3(); // Child타입으로 생성되엇지만 Parent 타입의 객체 p4...
		// Parent에서 method3를 호출하는데, Parent과 Child에서 중복되는 method3는
		// Child에서 재정의되며 Parent.method3를 은폐시키기 때문에
		// Child.method3를 호출함 !
		// 재정의 : 상위로 강제 형변환 됐을 때 호출하기 위함
		p4.method1();
		p4.method2();
		p4.method3();
		p4.method4();
		// p1.method5(); 불가능
		
	}

}
