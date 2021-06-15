package com.itwill01.method;

public class Student {
	
	// 멤버 변수 선언: 번호, 이름, 국어, 영어, 수학, 석차(공백..), 총점, 평균, 학점... 
	int num, kor, math, eng, rank;
	char grade;
	String name;
	double sum, avg;
	
	
	// 기본 데이터 입력
	public void setData(int num, String name, int kor, int eng, int math) {
		this.num= num;
		this.name= name;
		this.kor= kor;
		this.math= math;
		this.eng= eng;
	}
	
	// 총점 계산
	public void sum() {
		this.sum= this.kor+this.eng+this.math;
		// System.out.println(this.sum);
	}
	
	// 평균 계산
	public void avg(){
		this.avg= this.sum/3;
		// System.out.printf("%6.2f\n",this.avg);
	}
	
	// 학점 계산
	public void grade() {
		if (this.avg>90) {
			this.grade= 'A';
			// System.out.printf("%3c \n",this.grade);
		} else if (this.avg>80) {
			this.grade= 'B';
			// System.out.printf("%3c \n",this.grade);
		} else if (this.avg>70) {
			this.grade= 'C';
			// System.out.rintf("%3c \n",this.grade);
		} else if (this.avg>60) {
			this.grade= 'D';
			// System.out.printf("%3c \n",this.grade);
		} else {
			this.grade= 'F';
			// System.out.printf("%3c \n",this.grade);
		}
	}
	
	//출력
	public void printTitle() {
		System.out.println("==================================================");
		System.out.printf("%2s %-3s %3s %3s %3s  %-5s %-5s %3s %2s\n", "학번", "이름", "국어", "수학", "영어", "총합", "평균", "학점", "석차");
		System.out.println("==================================================");
	}
	
	public void print() {
		System.out.printf("%2d %4s %3d %3d %3d %5.2f %4.2f %3c \n", num, name, kor, math, eng, sum, avg, grade);
		System.out.println("--------------------------------------------------");			
	}
	
}