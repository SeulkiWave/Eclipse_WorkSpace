/*
생성자(constructor) (= 생성자 메소드)
0. 접근제한자 클래스이름(매개변수1, 매개변수2) {
	}
1. 클래스 이름과 동일하며 리턴 타입을 명시하지 않는 메소드...?
2. 하나의 클래스에는 반드시 하나 이상의 생성자가 존재하여야한다
--> 생성자를 !하나도! 정의하지 않을 경우 컴파일러는 인자가 하나도 없는 생성자(디폴드 생성자)를 자동으로 넣어서 컴파일한다.    
3. 객체 생성시 단 한 번 호출된다.
4. ""주로 객체 초기화의 용도로 사용한다.""
5. 객체를 생성하려면 반드시 생성자를 호출 하여야 한다.
6. 생성자(메소드)를 여러개 정의하려면 오버로딩 해야한다.

-형태: public class Test{
	 //생성자의 정의(선언)
	 public Test(){
	 	}
	 }	
-사용: Test t = new Test(); (new Test();도 실행됨... 클래스 이름과 생성자 같아야 한다????????)
// 생성자 메소드- 찍는 행위 / 찍어낼 때 객체가 생김 /  
	 "" 클래스명 참조변수이름 = new 클래스명(); ""
	 new 라는 연산자는 반드시 생성자 앞에 있어야 하며 이 연산자에 의해 객체를 생성한다.
*/

public class Constructor {
	
	private int member1, member2;
	
	
	/*
	 * << 생성자 >>
	 * 객체 생성 후 최초로! 단 한 번! 호출되는 메소드~
	 * 생성된 다음 초기화 작업을 가짐 --> 객체는 초기화된 후 값이 ... 들어가는... ~ 
	 */
	
	// 기본 생성자
	public Constructor() {
		System.out.println("Constructor() : 기본 생성자(메소드)의 호출 this 주소: "+this);
		this.member1 = 100;
		this.member2 = 200;
	}
	
	public Constructor(int member1, int member2) {
		System.out.println("Constructor(int a, int b) 생성자(메소드)의 호출");
	this.member1 = member1;
	this.member2 = member2;
	} // 이건 생성자
	
	public void setConstructorData(int member1, int member2) {
		this.member1 = member1;
		this.member2 = member2;
	} // 이건 메소드
	// 메소드는 언제든지 내가 원할 때 호출할 수 있다
	
	public void print() {
		System.out.println("member1: "+this.member1);
		System.out.println("member2: "+this.member2);
	}
	
	
	
	
}
