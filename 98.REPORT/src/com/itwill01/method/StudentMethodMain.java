package com.itwill01.method;

public class StudentMethodMain {

	public static void main(String[] args) {
		
		// 학생 객체 생성
		Student stu1, stu2, stu3;
		stu1= new Student();
		stu2= new Student();
		stu3= new Student();
		
		// 학생 객체 기본 데이터 (번호, 이름, 국어, 영어, 수학) 입력 메소드 호출
		stu1.setData(2, "김슬기", 84, 90, 72);
		stu2.setData(7, "김슬긱", 72, 68, 100);
		stu3.setData(21, "김슬긲", 82, 86, 82);
		
		// 학생 총점 계산 메소드 호출
		stu1.sum();
		stu2.sum();
		stu3.sum();
		
		// 학생 평균 계산 메소드 호출
		stu1.avg();
		stu2.avg();
		stu3.avg();
		
		// 학생 학점 계산 메소드 호출
		stu1.grade();
		stu2.grade();
		stu3.grade();
		
		//학생 데이터 출력 메소드 호출
		stu1.printTitle();
		stu1.print();
		stu2.print();
		stu3.print();
		
	}

}