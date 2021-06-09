package com.itwill01.method;

public class StudentConstructorMain {

	public static void main(String[] args) {
		
		// 기존의 Student 외 새로 연습하려고 Student2 클래스를 만들었습니다...
		
		// 학생 객체 3명 생성
		Student2 stu1, stu2, stu3;
		
		// 기본 생성자를 사용한 학생1의 객체 생성
		stu1 = new Student2();
		// 학생 객체 데이터 입력 메소드를 사용한 학생 객체 초기화
		stu1.setData(1, "김슬기", 98, 89, 100);
		
		// 인자 5개를 받는 생성자를 사용한 학생 2, 3의 객체 생성
		stu2 = new Student2(5, "김슬니", 63, 72, 94);
		stu3 = new Student2(13, "김슬긲", 81, 67, 98);
		
		// 학생 총점 계산 메소드 호출
		stu1.sumData();
		stu2.sumData();
		stu3.sumData();
		
		// 학생 평균 계산 메소드 호출
		stu1.averData();
		stu2.averData();
		stu3.averData();
		
		// 학생 등급 계산 메소드 호출
		stu1.gradeData();
		stu2.gradeData();
		stu3.gradeData();
		
		// 학생 3명의 데이터 출력 메소드 호출
		stu1.printHeader();
		stu1.printScore();
		stu2.printScore();
		stu3.printScore();
		
		// 학생 student1 의 이름변경
		stu1.setName("김슬김");
		// 이름 변경 확인을 위한 테스트용 getter~ 
		System.out.println(stu1.getName());
		
		// 학생 student1 의 총점데이타 반환받은후 메인에서출력
		System.out.println("학생 1의 총점: "+stu1.getSum());
		
		// 학생 student2 의 학점데이타 반환받은후 메인에서출력
		System.out.println("학생 2의 학점: "+stu2.getGrade());

		
	}

}
