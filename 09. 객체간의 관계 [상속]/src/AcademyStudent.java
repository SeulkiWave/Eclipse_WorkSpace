public class AcademyStudent extends AcademyMember {
	
	// Academy_Member가 가진 멤버 변수, 메소드를 모두 상속 받음
	
	// class 키워드를 식별자로 사용할 수 없다
	public String groupStu;
	
	public AcademyStudent() {}
	public AcademyStudent(int num, String name, String groupStu) {
		this.num = num;
		this.name = name;
		this.groupStu = groupStu;
	}
	
	// public void print() {} 
	// Academy_Member에게 상속받은 Academy_Student의 멤버 메소드
	public void print() {
		super.print();
		System.out.print(this.groupStu);
	}
	// 재정의! Overriding!
	
	
	// Getter Setter - alt+shift+s
	public String getGroupStu() {
		return groupStu;
	}
	public void setGroupStu(String groupStu) {
		this.groupStu = groupStu;
	}
}
