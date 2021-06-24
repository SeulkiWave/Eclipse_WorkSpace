package com.itwill05.service.student;




public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		
		System.out.println("1. 전체 학생 총점, 평균, 평점 계산");
		// 1. 전체 학생 총점, 평균, 평점 계산
		studentService.calculate();
		
		System.out.println("2. 전체 학생 총점으로 석차 계산");
		// 2. 전체학생 총점으로 석차계산
		studentService.setRank();
		
		System.out.println("3. 전체 학생 반환 ");
		// 3-1. 전체학생반환  // getter...?
		Student[] students = studentService.getStudents();
		// 3-2. 전체학생출력
		System.out.println("3. 전체 학생 출력 ");
		studentService.print();
		
		System.out.println("4. 번호 3번 학생 한 명 반환  ");
		// 4. 번호 3번 학생 한 명 반환
		Student findStu = studentService.findByNo(3);
		findStu.print();
		
		System.out.println("5. 학점 A인 학생들 반환");
		// 5. 학점A인 학생들 반환
		Student[] findStu2 = studentService.findByGrade('A');
		System.out.println("A: "+ findStu2.length);
		
		System.out.println("5.  이름 KIM 인 학생들 반환");
		// 5. 이름KIM 인 학생들 반환
		
		
		System.out.println("6. 학생 석차로 오름차순 정렬");
		// 6. 학생석차로 오름차순정렬
		
		
	}

}