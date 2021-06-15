package com.itwill04.array;

public class Student {
	
	private int num, kor, eng, math, rank;
	private double sum, aver;
	private String name;
	private char grade;
	
	public Student() {}
	public Student(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void setData(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void calSum() {
		this.sum = (double) (this.kor + this.eng + this.math);
	}
	public void calAver() {
		this.aver = (this.aver / 100.0);
	}
	public char calGrade() {
		if (this.aver >= 90) {
			this.grade = 'A';}
		else if (this.aver < 90 && this.aver >= 80) {
			this.grade = 'B';}
		else if (this.aver < 80 && this.aver >= 70) {
			this.grade = 'C';}
		else if (this.aver < 70 && this.aver >= 60) {
			this.grade = 'D';}
		else {
			this.grade = 'F';}
		return grade;
	}
	
	public static void printHead() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");

	}
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4f %5.1f %3c %4d%n",
				this.num, this.name, this.kor, this.eng, this.math,
				this.sum, this.aver, this.grade, this.rank);
	}
	
	
	
	
	
	
	// getter setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}