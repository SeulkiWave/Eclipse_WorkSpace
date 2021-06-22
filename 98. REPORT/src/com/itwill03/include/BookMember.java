package com.itwill03.include;

public class BookMember {
	// 캡슐화
	private int numInfo, numPhone;
	private String name;
	// 빌린 책~
	private Book borrow;

	// 생성자
	public BookMember() {
	}
	public BookMember(int num, String name, int phone, Book borrow) {
		this.numInfo = num;
		this.name = name;
		this.numPhone = phone;
		this.borrow = borrow;
	}
	
	// 회원 정보 출력
	public static void printHead() {
		System.out.printf("%s %s %s %s \n","회원번호","회원이름","연락처","책 이름");
		
	}
	public void print() {
		System.out.printf("%d %s %d %s", this.numInfo, this.name, this.numPhone, this.borrow.getName());
	}
	
	public void printBook() {
		this.borrow.print();
	}
	
	
	
	public int getNumInfo() {
		return numInfo;
	}
	public void setNumInfo(int numInfo) {
		this.numInfo = numInfo;
	}
	public int getNumPhone() {
		return numPhone;
	}
	public void setNumPhone(int numPhone) {
		this.numPhone = numPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBorrow() {
		return borrow;
	}
	public void setBorrow(Book borrow) {
		this.borrow = borrow;
	}
}