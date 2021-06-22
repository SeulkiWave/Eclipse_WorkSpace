public class AcademyMemberArrayConstructorMain {

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
		
		
		System.out.println("I N S T A N C E O F 연산자 ===============");
		/*
		 * 연산자 - instanceof
		 *  - 형태: 참조변수 instanceof 클래스이름
		 *  - 연산 결과: true or false
		 */
		AcademyMember am = new AcademyStudent(1, "김", "자바");
		
		boolean isStudent = am instanceof AcademyStudent;
		if (isStudent) {
			System.out.println("학생 객체 --> "+am);
			// getGroup 불가능..~
			AcademyStudent tempStudent = (AcademyStudent)am; // 상위 클래스를 하위 클래스로 강제 형변환 !
			System.out.println("학생 반: "+tempStudent.getGroupStu());
		}
		
		System.out.println("AcademyMember 중 AcademyStudent 객체만 출력 ===============");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent = (AcademyStudent)(members[i]);
				System.out.println("학생 반: "+tempStudent.getGroupStu());
			}
		}
		
	}

}