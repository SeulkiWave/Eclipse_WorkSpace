package com.itwill04.array;

import java.util.Iterator;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")
		};
		System.out.println("1.AcademyMember 전체출력");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		System.out.println("2.번호 1번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) { // null 없다~!
			if (members[i].getNo() == 1) {
				members[i].print();
				break; // 멈춰~.~
			}
		}
		
		System.out.println("2.번호 2번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) { // null 없다~!
			if (members[i].getNo() == 2) {
				members[i].print();
				break; // 멈춰~.~
			}
		}
		
		System.out.println("2. 이름 KIM인 AcademyMember들 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals("KIM")) {
				members[i].print();
			}
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		
		for (int i = 0; i < members.length; i++) {
			boolean isStudent = members[i] instanceof AcademyStudent;
			if (isStudent) {
				members[i].print();
			}
			
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (int i = 0; i < members.length; i++) {
			boolean isTeacher = members[i] instanceof AcademyGangsa;
			if (isTeacher) {
				members[i].print();
			}
			
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (int i = 0; i < members.length; i++) {
			boolean isStaff = members[i] instanceof AcademyStaff;
			if (isStaff) {
				members[i].print();
			}
			
		}
		
		System.out.println("4.AcademyMember 중에서 자바 반인 AcademyStudent 들 출력"); // 다시 생각하기
		
		for (int i = 0; i < members.length; i++) {
			boolean isStudent = members[i] instanceof AcademyStudent; // (1) 이런 분류 체제 자체를 밖으로 빼야하나?
			if (isStudent) {
				AcademyMember memberTemp = members[i];
				AcademyStudent studentTemp = (AcademyStudent) memberTemp;
				if (studentTemp.getBan().equals("자바")) { // <-- 이거 어떻게 하면 depth를 줄일 수 있을까........
					// (2) 이런 검증 과정도 빼기?
					studentTemp.print();					
				}
			}
		}
		
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for (int i = 0; i < members.length; i++) {
			boolean isStaff = members[i] instanceof AcademyStaff;
			if (isStaff) {
				AcademyMember memberTemp = members[i];
				AcademyStaff staffTemp = (AcademyStaff) memberTemp;
				if (staffTemp.getDepart().equals("영업")) {
					staffTemp.print();
				}
			}
		}
		
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (int i = 0; i < members.length; i++) {
			boolean isTeacher = members[i] instanceof AcademyGangsa;
			if (isTeacher) {
				AcademyMember memberTemp = members[i];
				AcademyGangsa teacherTemp = (AcademyGangsa) memberTemp;
				if (teacherTemp.getSubject().equals("자바")) {
					teacherTemp.print();
				}
			}
		}
		
	}

}