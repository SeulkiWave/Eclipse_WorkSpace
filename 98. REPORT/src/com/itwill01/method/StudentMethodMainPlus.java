package com.itwill01.method;

import java.util.Scanner; // <== 이거 넣어보고 싶어서..

public class StudentMethodMainPlus {

	public static void main(String[] args) {
		
		System.out.println("첫 번째 학생의 점수를 입력하세요: "); // 첫 번째 학생만 점수를 직접 받을 수 있게 했습니다..
		
		// 학생 객체 생성
		Student stu1, stu2, stu3;
		stu1= new Student();
		stu2= new Student();
		stu3= new Student();
		
		Scanner console= new Scanner(System.in);
		int scoreKor= console.nextInt();
		int scoreEng= console.nextInt();
		int scoreMath= console.nextInt();
		
		if (scoreKor<0 || scoreKor>100 || scoreMath<0 || scoreMath>100 || scoreEng<0 || scoreEng>100) {
			System.out.println("입력된 점수 중 0과 100 사이의 정수가 아닌 숫자가 포함되어 있습니다.");
		} else {
			
			// 학생 객체 기본 데이터 (번호, 이름, 국어, 영어, 수학) 입력 메소드 호출
			stu1.setData(2, "김슬기", scoreKor, scoreEng, scoreMath); // 첫번쨰 학생의 점수는 키보드에서 입력을 받아 객체로 전송되어 처리가 됨..
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
			stu1.print();
			stu2.print();
			stu3.print();
			
		}
		
	}

}