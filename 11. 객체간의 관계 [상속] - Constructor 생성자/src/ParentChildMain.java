class Parent extends Object{
	private int member1;
	private int member2; // Child 가 상속 받았을 때 접근할 수 없음!
	
	public Parent() {
		// 클래스 생성자의 첫 번째 줄에서는 !반드시! 상위 클래스의 디폴트 생성자가 !!반드시!! 호출되어야 한다
		// 생략시에 상위 클래스의 디폴트 생성자가 자동호출된다!
		super(); // Object 클래스의 기본 생성자!
		System.out.println("Parent() 디폴트 생성자");
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("Parent(int member1, int member2) 생성자");
	}

	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}

	public int getMember1() {
		return member1;
	}
	public void setMember1(int member1) {
		this.member1 = member1;
	}
	public int getMember2() {
		return member2;
	}
	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
}
class Child extends Parent{
	public int member3;
	
	public Child() {
		// super는 해당 클래스의 상위 클래스의 생성자이며, 가장 선행되어야 하기 때문에
		// 해당 명령어 위에 어떤 명령어가 있어도 오류가 발생한다~! (주석제외...)
		super();
		System.out.println("Child() 디폴트 생성자");
	}
	
	public Child(int member1, int member2, int member3) {
		// 매개 변수(instance)를 가지고 있는 생성자를 호출할 수 있다.
		// 매개 변수를 가지고 있는 생성자는 !! 명시적으로 호출코드를 기술!! 해야한다.
		// super(); // = super (member1, member2) ;
		/* - The field Parent.member1 is not visible
		 * this.member1 = member1;
		 * this.member2 = member2;
		 * this.member3 = member3;
		*/
		/* - 웃기게 생김.. 되긴 됨
		 * this.setMember1(member1);
		 * this.setMember2(member2);
		 * this.setMember3(member3);
		 */
		/* - 접근 제한을 피할 수 신기한 방법...
		 * super(member1, member2);
		 */
		
		System.out.println("Child(int member1, int member2, int member3) 생성자");
	}
	
	public void print() {
		// System.out.println(this.member1+"\t"+"int member2+"\t"+int member3");
		// 내 객체지만 이미 만들어진 Parent 클래스의 멤버 변수에 접근할 수 없다..객체지만.
	}
	
	public void method3() {
		System.out.println("Child.method3()");
	}

	public int getMember3() {
		return member3;
	}
	public void setMember3(int member3) {
		this.member3 = member3;
	}
}

public class ParentChildMain {

	public static void main(String[] args) {
		
		System.out.println("===== ===== ===== ===== ");
		Child c1 = new Child();
		System.out.println("===== ===== ===== ===== ");
		Child c2 = new Child(1, 2, 3);
		
	}

}
