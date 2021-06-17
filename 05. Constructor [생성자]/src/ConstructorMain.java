
public class ConstructorMain {

	public static void main(String[] args) {
		
		Constructor con1 = new Constructor();
		
		/*
		<< new Constructor(); >>
		1. Constructor 클래스로 객체를 생성한다 (오른쪽의 Constructor를 보고 판단하자~)
		2. 생성자가 호출된다~
		3. 객체의 주소값을 반환한다~~~~~~
		 */
		
		System.out.println("con1의 객체 주소 --> "+con1);
		con1.print();
		
		Constructor con2 = new Constructor();
		System.out.println("con1의 객체 주소 --> "+con2);
		con2.print();
		
		Constructor con3 = new Constructor(800, 900);
		con3.print();
		con3.setConstructorData(480, 960);
		con3.print();
		
		System.out.println("-----------------------------------");
		
		
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println("dc");
		
		
		
	}

}
