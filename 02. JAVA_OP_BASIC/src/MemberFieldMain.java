
public class MemberFieldMain {

	public static void main(String[] args) {
		
		// 객체를 생성한 후 주소값(#100)이 반환되고, 참조 변수가 생성된 후 주소값이 대입됨
		MemberField mf1 = new MemberField();
		
		// 객체의 참조 변수 mf1의 주소값을 사용해서 필드(멤버필드, 멤버변수)에 데이터를 대입시킨다.
		// 멤버 필드 접근 방법: 참조변수(주소값).필드이름 = 값;
		// #100.member1 = 12;
		mf1.member1= 12;
		mf1.member2= 89.890;
		mf1.member3= '꿈';
		mf1.member4= "문자열1";
		
		
		MemberField mf2 = new MemberField();
		
		mf2.member1= 23456;
		mf2.member2= 3.1456;
		mf2.member3= '휴';
		mf2.member4= "스트링";
		
		
		// 객체의 필드 값 출력
		System.out.println("----------mf1(100)----------");
		System.out.println(mf1); // 주소값이 출력됨. 객체 내 아래 변수를 분류할 수 있는 값!
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("----------mf2(100)----------");
		System.out.println(mf2);
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
		
		
		
	}

}
