
public class StaticMain {

	public static void main(String[] args) {
		
		/*
		 * 정적 멤버 접근
		 *  - 클래스이름.(정적)멤버이름
		 *  - Static.static_field
		 */
		System.out.println("----- static member access -----");
		System.out.println("1. Static.static_field: "+Static.static_field);
		System.out.println(Static.static_field);
		Static.static_field = 898989;
		System.out.println("2. Static.static_field: "+Static.static_field);
		System.out.println(Static.static_field);
		Static.static_method();
		
		
		// 이건 Static 이라는 클래스에 생긴 객체...
		System.out.println("----- instance member access -----");
		Static static1= new Static();
		static1.instance_field = 555;
		System.out.println(static1.instance_field);
		static1.instance_method();

		
		System.out.println("----- instance member access -----");
		Static static2= new Static();
		static2.instance_field = 212;
		System.out.println(static2.instance_field);
		static2.instance_method();
		
		
		System.out.println("----- 객체 주소를 통한 접근 -----");
		// 객체 주소를 사용한 static 멤버에 접근
		static1.static_field= 1234;
		static1.static_method();
		// The stati field Static.static_field should be accessed in a static way...
		System.out.println("Static1.static_field: "+static1.static_field);
		
		
		
		
	}

}
