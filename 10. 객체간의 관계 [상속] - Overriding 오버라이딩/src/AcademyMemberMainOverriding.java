
public class AcademyMemberMainOverriding {

	public static void main(String[] args) {
		// AcademyMember m1 = new AcademyMember(0, "김슬기");
		
		AcademyStudentOverriding st1 = new AcademyStudentOverriding(3, "김슬긱", "기능해부학");
		AcademyStudentOverriding st2 = new AcademyStudentOverriding(49, "김슬긴", "신경해부학");
		AcademyStudentOverriding st3 = new AcademyStudentOverriding(864, "김슬긷", "근골격해부학");
		
		AcademyTeacherOverriding tea1 = new AcademyTeacherOverriding(4, "AAA", "안드로이드");
		AcademyTeacherOverriding tea2 = new AcademyTeacherOverriding(19, "BBB", "IOS");
		
		AcademyStaffOverriding sf1 = new AcademyStaffOverriding(9, "QWE", "Marketing");
		AcademyStaffOverriding sf2 = new AcademyStaffOverriding(53, "RTY", "Accounting");
		
		/*
		 * st1.print();
		 * st2.print();
		 * st3.print();
		 */
		
		System.out.println("Student ==============================");
		st1.print();
		st2.print();
		st3.print();		
		System.out.println("Teacher ==============================");
		tea1.print();
		tea2.print();
		System.out.println("Staff ==============================");
		sf1.print();
		sf2.print();
		
	}

}
