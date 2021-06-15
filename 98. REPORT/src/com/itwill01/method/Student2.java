package com.itwill01.method;

public class Student2 {
	
	// 성적 처리를 위해 필요한 학생 객체를 위한 멤버 변수 (속성) 선언 -> 캡슐화를 위해 private 설정
	private int num, kor, eng, math, rank;
	private char grade;
	private String name;
	private double sum, aver;
	
	
	// 생성자 메소드 선언 (0개)
	public Student2() {
		
	}
	
	// 생성자 메소드 선언 (5개)
	public Student2(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	// 멤버 메소드 선언 (기능)
	// 생성자를 사용하지 않고 멤버 변수에 값을 대입하기 위한 메소드~
	public void setData(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 총점 계산 메소드
	public void sumData() {
		this.sum = this.kor + this.eng + this.math;
	}
	
	// 평균 계산 메소드
	public void averData() {
		this.aver = this.sum / 3;
	}
	
	// 등급 계산 메소드
	public char gradeData() {
		if (this.aver > 90) {
			this.grade = 'A';
			
		} else if (this.aver > 80) {
			this.grade = 'B';
			
		} else if (this.aver > 70) {
			this.grade = 'C';
			
		} else if (this.aver > 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
		return this.grade;
	}
	
	// 출력 메소드
	// 1. 헤더
	public void printHeader () {
		System.out.println("==================================================");
		System.out.printf("%2s %-3s %3s %3s %3s  %-5s %-5s %3s %2s\n", "학번", "이름", "국어", "수학", "영어", "총합", "평균", "학점", "석차");
		System.out.println("==================================================");
	}
	
	//2. 점수부
	public void printScore () {
		System.out.printf("%2d %4s %3d %3d %3d %5.2f %4.2f %3c \n", num, name, kor, math, eng, sum, aver, grade);
		System.out.println("--------------------------------------------------");			
	}
		
	// 이름 변경을 위한 setter
	public void setName(String name) {
		this.name = name;
	}
	// 이름 대입 확인을 위한 테스트용 getter
	public String getName() {
		String stuName = this.name;
		return stuName;
	}
	

	// 총점, 학점 데이터 단독 출력을 위한 getter
	public double getSum() {
		return sum;
	}
	public char getGrade() {
		// char stuGrade = this.grade; <-- 이걸 왜 넣으려고 했지...?
		return grade;
	}
	
	
	
}
