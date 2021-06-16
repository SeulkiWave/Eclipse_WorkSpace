
public class AcademyMemberCastingArrayMain {

	public static void main(String[] args) {
		
		AcademyMember[] members = new AcademyMember[7];
		// AccademyMember 타입의 변수 7개를 가진 AcademyMember배열 타입의 객체 1개 생성~
		
		members[0] = new AcademyStudent (1, "김슬기1", "Java");
		members[1] = new AcademyStudent (2, "김슬기2", "Python");
		members[2] = new AcademyStudent (3, "김슬기3", "ActionScript");
		
		members[3] = new AcademyTeacher (4, "김슬기4", "iOS");
		members[4] = new AcademyTeacher (5, "김슬기5", "Andriod");
		
		members[5] = new AcademyStaff (6, "김슬기6", "Account");
		members[6] = new AcademyStaff (7, "김슬기7", "Office");
		
		System.out.println("Academy Member 전체 출력 ----------");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		
		
	} // main end

} // class end
