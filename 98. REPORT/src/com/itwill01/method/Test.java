package com.itwill01.method;

public class Test {
	
	int num1, num2, num3;
	
	public void setNum(int num1, int num2, int num3) {
		this.num1= num1;
		this.num2= num2;
		this.num3= num3;		
	}
	
	public void print1() {
		System.out.println(this.num1+"번 메소드 실행");
	}
	
	public void print2() {
		System.out.println(this.num2+"번 메소드 실행");
	}
	
	public void print3() {
		System.out.println(this.num3+"번 메소드 실행");
	}
	
}
