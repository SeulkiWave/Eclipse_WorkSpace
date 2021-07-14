package basic.driver;

public class StaticBlockClass {
	// 클래스의 구성 요소: 멤버 필드(변수), 멤버 메소드, 생성자, "정적 블록 (new!!)"
	
	static {
		System.out.println("클래스 로딩시 최초로 실행되는 블록");
		System.out.println("클래스 로딩시 실행돼야 하는 코드를 기술한다.");
		
		StaticBlockClass sbc = new StaticBlockClass();
		
		System.out.println("StaticBlock에서 객체 생성: " +sbc);
		
	}
	
}
