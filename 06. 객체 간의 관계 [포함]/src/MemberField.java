
public class MemberField {
	
	// 멤버 필드는 객체 생성시 기본 값으로 자동 초기화된다~
	
	public int member1; // 0
	public double member2; // 0.0
	public char member3; // 000000
	public boolean member4; // false
	public String member5; // 참조형 null
	
	public int member6;
	public double member7;
	public char member8;
	public boolean member9;
	public String member10; // 참조형
	
	// 멤버 필드는 	객체 생성시 초기 값을 줄 수 있다
	public int member11 = 123;
	public double member12 = 123.456789;
	public char member13 = '힣';
	public boolean member14 = true;
	public String member15 = "문자열";
	
	public MemberField() {}

	public MemberField(int member1, double member2, char member3, boolean member4, String member5) {
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
	}
	
	
	
}
