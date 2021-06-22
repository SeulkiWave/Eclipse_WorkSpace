
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyTeacher[] teachers = new AcademyTeacher[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "KIM", "AAA");
		students[1] = new AcademyStudent(2, "KIN", "BBB");
		students[2] = new AcademyStudent(3, "KIL", "CCC");
		
		teachers[0] = new AcademyTeacher(4, "김김김", "오피스");
		teachers[1] = new AcademyTeacher(5, "강강강", "자바");
		
		staffs[0] = new AcademyStaff(6, "HONG", "총무부");
		staffs[1] = new AcademyStaff(7, "SIM", "홍보부");
		
		System.out.println("Academy Member 전체 출력");
		System.out.println("Student ===== ===== ===== ===== ");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println();
		System.out.println("Teacher ===== ===== ===== ===== ");
		for (int i = 0; i < teachers.length; i++) {
			teachers[i].print();
		}
		System.out.println();
		System.out.println("Staff ===== ===== ===== ===== ");
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].print();
		}
		
	}

}
