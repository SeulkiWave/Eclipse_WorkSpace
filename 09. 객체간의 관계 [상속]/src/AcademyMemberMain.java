
public class AcademyMemberMain {

	public static void main(String[] args) {
		// AcademyMember m1 = new AcademyMember(0, "김슬기");
		
		AcademyStudent st1 = new AcademyStudent(3, "김슬긱", "기능해부학");
		AcademyStudent st2 = new AcademyStudent(49, "김슬긴", "신경해부학");
		AcademyStudent st3 = new AcademyStudent(864, "김슬긷", "근골격해부학");
		
		AcademyTeacher tea1 = new AcademyTeacher(4, "AAA", "안드로이드");
		AcademyTeacher tea2 = new AcademyTeacher(19, "BBB", "IOS");
		
		AcademyStaff sf1 = new AcademyStaff(9, "QWE", "Marketing");
		AcademyStaff sf2 = new AcademyStaff(53, "RTY", "Accounting");
		
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
