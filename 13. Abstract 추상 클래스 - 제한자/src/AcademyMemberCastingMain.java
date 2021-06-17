
public class AcademyMemberCastingMain {

	public static void main(String[] args) {
		// AcademyMember m = new AcademyMember(0, "unknown");
		// AcademyMember는 객체를 생성할 수 없다!
		
		AcademyStudent st1 = new AcademyStudent (1, "김슬기1", "Java");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent (2, "김슬기2", "Python");
		AcademyMember m3 = new AcademyStudent (3, "김슬기3", "ActionScript");
		
		AcademyMember m4 = new AcademyTeacher (4, "김슬기4", "iOS");
		AcademyMember m5 = new AcademyTeacher (5, "김슬기5", "Andriod");
		
		AcademyMember m6 = new AcademyStaff (6, "김슬기6", "Account");
		AcademyMember m7 = new AcademyStaff (7, "김슬기7", "Office");
		
		m1.print();	m2.print(); m3.print();
		m4.print(); m5.print(); m6.print(); m7.print();
		
		
		
	}

}
