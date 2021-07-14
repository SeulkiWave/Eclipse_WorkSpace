package basic;

public class StaticBlockClassMain {

	public static void main(String[] args) throws Exception {
		
		/* 클래스가 로딩되는 시점! : JVM이 해당 클래스를 사용해서 객체를 생성할 때?
		 * 		1. Class.forName("class name")
		 * 		2. 생성자 호출
		 */
		
		// StaticBlockClass sbc = new StaticBlockClass();
		// Class.forName("basic.StaticBlockClass"); // String의 로딩.. 의존성이 줄어든다?
		
		String className = "basic.StaticBlockClass";
		Class.forName(className);
		// 프레임워크에서 객체를 만들 때 위와 같이 String으로 로딩해 의존성을 줄인다..
		// 	( 클래스를 타입, 생성자 없이 생성하는 방법! )
		
	}

}
