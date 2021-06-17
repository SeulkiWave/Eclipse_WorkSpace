/*
2.멤버메쏘드 선언    
 *        접근제한자 리턴타입 메쏘드이름(매개변수){
 *           -매개변수: 나를 호출한클래스(객체) 가 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한클래스(객체) 에게 반환할 데이타타입 
 *               void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */
class MemberMethod {
	public int member1=88;
	public int member2=99;
	
	public void method1(){
		System.out.println("void method1()실행1");
		System.out.println("void method1()실행2");
		/*
		 * - 모든 메쏘드의 마지막에는 항상 실행흐름을
		 *   호출한곳(클래스,객체)으로 반환하여야한다.
		 * - return문을 만나면 호출한곳으로 반환된다.
		 * - return type이 void인경우에는 생략이 가능하다.
		 * - return문이 생략된경우에는 자동return된다.
		 */
		return;
	}
	public void method2() {
		System.out.println("void method2() 실행1");
		System.out.println("void method2() 실행2");
		System.out.println("void method2() 실행3");
		return;
	}
	
	// 매개 변수~
	public void method3(int count) { // int count : 외부에서 데이터를 받겠다는 선언~
		int localVar= 1111;
		System.out.println("void method 3 블록 내 선언된 변수 --> "+localVar);
		
		for (int i=0; i<count; i++) {
			System.out.println("void method 3(int count)실행시 파라메타(매개 변수, 인자) count 값 --> "+count);			
		}
		
		return;
	}
	
	public void method4(String msg, int count) {
		System.out.println("void method4(String msg, int count)");
		System.out.println("msg: "+msg);
		System.out.println("count: "+count);
		
		for (int i=0; i<count; i++) {
			System.out.println(msg);
		}
		
		return;
	}
	
	public void method5(String name, String msg, int count) {
		System.out.println("--- public void method5(String name, String msg, int count) ---");
		for(int i=0; i<count; i++) {
			System.out.printf("%s님 %s%n", name, msg);
		}
		return;
	}
	
	
	/*
	 * 멤버변수출력하는기능
	 */
	public void print() {
		/*
		 * this
		 *   - self참조변수
		 *   - print메쏘드를 가지고있는 객체의 주소값
		 */
		System.out.println(this.member1);
		System.out.println(this.member2);
	}
	
	
}

public class MemberMethodMain {
	public static void main(String[] args) {
		MemberMethod mm1=new MemberMethod();
		
		System.out.println(mm1.member1);
		System.out.println(mm1.member2);
		mm1.member1=2147483647;
		mm1.member2=-2147483648;
		System.out.println("main stmt1");
		/*
		 * 멤버메쏘드실행(호출)
		 *   - 형식:참조변수.메쏘드이름();
		 *   - mm객체의 method1 메쏘드블록을 실행하기위해
		 *     main실행흐름을 method1블록으로보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		
		
		
		MemberMethod mm2=new MemberMethod();
		mm2.member1=1;
		mm2.member2=2;
		
		/*
		 * MemberMethod 클래스 내 - public void method3(int count){} // 외부로부터 int 데이터를 받겠다..
		 */
		mm1.method3(1); // 이 method3가 호출된 후 int count=6 매개변수가 선언되고 localVar값도 그때 선언된다ㅣ..
		mm2.method3(3);
		
		
		/* MemberMethod 클래스 내부에 정의된 메소드4...
		public void method4(String msg, int count)
		 */
		
		mm1.method4("메세지", 3); // msg와 count 매개변수는 method4 호출 시에 선언과 동시에 대입된다~ 반환 후 사라짐~~ (매개변수, 인자, 인수)
		mm2.method4("배불러", 2);
		
		// public void method5(String name, String msg, int count)
		mm1.method5("김슬기", "잠 자지마!", 3);
		mm1.method5("황원탁", "행복해", 5);
		mm1.method5("우명지", "머야~", 5);
		
		
	}
}

