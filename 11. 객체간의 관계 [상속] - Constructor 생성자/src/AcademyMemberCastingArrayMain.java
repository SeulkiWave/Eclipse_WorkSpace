
public class AcademyMemberCastingArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students=new AcademyStudent[3];
		AcademyTeacher[] gangsas=new AcademyTeacher[2];
		AcademyStaff[] staffs=new AcademyStaff[2];
		
		students[0]=new AcademyStudent(1, "KIM", "ARDUINO");
		students[1]=new AcademyStudent(2, "JIM", "ANDROID");
		students[2]=new AcademyStudent(3, "LIM", "BIGDATA");
		
		gangsas[0]=new AcademyTeacher(4, "김강사", "오피스");
		gangsas[1]=new AcademyTeacher(5, "박강사", "자바");
		
		staffs[0]=new AcademyStaff(6,"HONG","총무부");
		staffs[1]=new AcademyStaff(7,"SIM","홍보부");
		
		System.out.println("----------AcademyMember전체출력----------");
		System.out.println("----------Student-----------");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println("----------Gansa-----------");
		for (int i = 0; i < gangsas.length; i++) {
			gangsas[i].print();
		}
		System.out.println("----------Staff-----------");
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].print();
		}
		
		
		
		
	} // main end

} // class end
