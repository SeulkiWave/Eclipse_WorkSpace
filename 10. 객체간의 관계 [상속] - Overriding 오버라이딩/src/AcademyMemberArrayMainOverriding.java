
public class AcademyMemberArrayMainOverriding {

	public static void main(String[] args) {
		
		AcademyStudentOverriding[] students = new AcademyStudentOverriding[3];
		AcademyTeacherOverriding[] teachers = new AcademyTeacherOverriding[2];
		AcademyStaffOverriding[] staffs = new AcademyStaffOverriding[2];
		
		students[0] = new AcademyStudentOverriding(1, "KIM", "AAA");
		students[1] = new AcademyStudentOverriding(2, "KIN", "BBB");
		students[2] = new AcademyStudentOverriding(3, "KIL", "CCC");
		
		teachers[0] = new AcademyTeacherOverriding(4, "김김김", "오피스");
		teachers[1] = new AcademyTeacherOverriding(5, "강강강", "자바");
		
		staffs[0] = new AcademyStaffOverriding(6, "HONG", "총무부");
		staffs[1] = new AcademyStaffOverriding(7, "SIM", "홍보부");
		
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
