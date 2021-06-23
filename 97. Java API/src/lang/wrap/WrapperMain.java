/*
<< Wrapper 클래스>>
	- 자바 데이터형은 기본 데이터형과 레퍼런스 데이터형으로 구분됩니다.
	- 기본 데이터형으로는 int, boolean, double 등이 제공됩니다.
	- 이런 기본 데이터형을 객체로 사용할 수 있는 방법으로 Wrapper 클래스가 제공됩니다.
	- Wrapper 클래스는 각종 유용한 기능들을 메소드로 제공 받을 수 있다는 장점이 있습니다.
	- Integer, Boolean, Double, Character, Float, Long, Byte, Short
 */

package lang.wrap;

public class WrapperMain {

	public static void main(String[] args) {
		
		// Wrapper 객체 형태
		Integer intWrap = new Integer(123);
		System.out.println("Integer 객체 멤버필드 int value의 값: "+ intWrap.intValue());
		
		Boolean boolWrap = new Boolean(true);
		System.out.println("Boolean 객체 멤버필드 boolean value의 값: "+ boolWrap.booleanValue());
		
		
		// Wrapper 객체 생성
		// (1) Boxing : int(기본형)을 Integer(wrapper) 객체로 만드는 과정
		Integer wi1 = null;
		wi1 = new Integer(89);
		Integer wi2 = new Integer(89); // parseInt
		Boolean wb1 = new Boolean(false);
		Boolean wb2 = new Boolean(true);
		Double wd1 = new Double(3.14);		
		Double wd2 = new Double(0.123456);
		
		// (2) UnBoxing : 기존에 boxing된 Integer(wrapper) 객체를 int(기본형)으로 변경하는 과정
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(wb1.booleanValue());
		System.out.println(wb2.booleanValue());
		System.out.println(wd1.doubleValue());
		System.out.println(wd2.doubleValue());
		
		// (3) Auto Boxing (wrapping) : int --> Integer
		Integer wi3 = 89;
		Integer wi4 = 89;
		Boolean wb3 = true;
		Boolean wb4 = false;
		Double wd3 = 3.1415;
		Double wd4 = 0.456789;
		
		// (4) Auto UnBoxing
		int i3 = wi3; // wi3는 주소값 . .. i3는 기본형... int i3 = wi3.intValue(); 와 같다
		int i4 = wi4.intValue();
		boolean b3 = wb3;
		boolean b4 = wb4;
		double d3 = wd3;
		double d4 = wd4;
		
		// Auto-Boxing
		Integer ia = 89;
		Integer ib = 45;
		Integer ic = 78;
		Integer id = 99;
		
		// 자동 형변환: [ Child --> Parent ] ==> [ Integer --> Object ] 
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		
		// Auto Boxing - 자동 형변환 동시!
		Object ooa = 89; // 먼저 boxing 한 후 형변환~
		Object oob = 45;
		Object ooc = 78;
		Object ood = 99;
		
		// Object[]
		Object[] scoreArray = new Object[4];
		scoreArray[0] = new Integer(89);
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 99;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempInt = (Integer)scoreArray[i]; // Int 타입인데 Object 타입으로 현재 형변환 되어잇음..
			int tempScore = tempInt.intValue();
			System.out.print(tempScore + "\t");
			*/
			int tempScore = (Integer) scoreArray[i]; // 강제 형변환..
		}
		
		
		
		
		
		
		
		
		
	}

}
