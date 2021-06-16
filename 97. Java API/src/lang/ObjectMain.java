package lang;

public class ObjectMain {

	public static void main(String[] args) {
		
		/*
		 * Class Object is the root of the class hierarchy.
		 * Every class has Object as a superclass.
		 * All objects, including arrays, implement the methods of this class.
		 */
		
		Object o1 = new Object();		
		Object o2 = new Object();
		Object o3 = o1;
		
		/*
		 * toString
		 * : Returns a string representation of the objects. In general the toString method returns a string that TEXUALLY REPRESENTS this objects.
		 * It is recommended that all subclasses override this method...
		 * 각자 하위 클래스 각자 자신마다 대표하는 문자를 재정의하는 걸 추천~
		 * a string representation of the object.
		 * 
		 * getClass().getName()+'@'+Integer.toHexString(hashCode())
		 */
		
		String str1 = o1.toString();
		String str2 = o2.toString();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(o2);
		// = System.out.println(o2.toString());
		// print 메소드들은 문자열을 찍는 역할.. 주소값을 갖는 참조 변수를 받은 경우 toString을 자동 출력한다...
		
		/*
		 * public boolean equals (Object obj)
		 * this 객체와 새로 들어오는 객체와 주소가 같은지 비교한다...
		 * true if thie object is the same as the obj argument; false otherwise;
		 */
		boolean isEqual = o1.equals(str2);
		System.out.println(isEqual);
		if (o1.equals(o3)) {
			System.out.println("o1과 o3의 주소가 동일하다.");
		}
		if (!o1.equals(o2)) {
			System.out.println("o1과 o2의 주소가 동일하지 않다.");
		}
		
		if (o1 == o3) {
			System.out.println("o1과 o3의 주소가 동일하다.");
		}
		if (o1 != o2) {
			System.out.println("o1과 o2의 주소가 동일하지 않다.");			
		}
		
		
		System.out.println("Object Child ===============");
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = oc1;
		
		System.out.println(oc1.toString());
		System.out.println(oc2.toString());
		System.out.println(oc3.toString());
		
		if(oc1.equals(oc3)){
			System.out.println("oc1 주소 == oc3 주소");
		}
	}

}
