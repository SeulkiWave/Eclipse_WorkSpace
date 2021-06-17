/*

static (제한자, 제어자, modifier)

 1. 멤버 필드(변수)나, 멤버 메소드 앞에 붙일 수 있다.
 2. static 제한자가 붙어있는 변수나 메소드는 객체 생성 없이도 사용이 가능하다.
 3. 클래스(틀, 1개!)가 가지고있는 변수나 메소드이다. --> 클래스 변수, 클래스 메소드라고도 한다.
 4. 클래스로부터 생성되는 객체들이 공유하는 변수(메소드)이다. --> 공용변수(메소드)라고도 한다.

 -형식: 
 멤버변수: public static int i;
 멤버메쏘드:
 	public static void print() {}
 	public static int add() {}
 	
  - 변수
  1. 지역 변수: 메소드의 블록 안에 선언된 변수 (매개 변수)
  2. 멤버 필드(변수): 클래스의 블록 안에 선언된 변수
  	2-1. 객체 필드 (변수): 인스턴스가 생성 돼야 사용할 수 있는 필드
  	2-2. 
   
   - 메소드
   1. 멤버 메소드
   	1-1. 객체 메소드: 인스턴스가 생성 돼야 호출 가능한 메소드
   	1-2. 정적 메소드: 인스턴스 생성과 관계없이 호출 가능한 메소드, 클래스 로딩시 클래스에 생성되는 메소드
   	

 */

public class Static {
	
	public int instance_field = 100;
	public static int static_field = 200;
	
	public void instance_method () {
		System.out.println("인스턴스(객체) 메소드");
	}
	
	public static void static_method() {
		System.out.println("정적(static) 메소드");
	}
	
}
