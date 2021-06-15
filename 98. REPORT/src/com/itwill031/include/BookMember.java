package com.itwill031.include;

public class BookMember {
	
	// 배열 사용한 멤버 변수 선언
	private int phone;
	private String name;
	private Book[] borrow;
	// 대여 가능한 책을 3권으로 한정시킬 수 있을까? Book[] books = new Book[3]; Book 클래스의 배열 객체 3개 가지는 "주소값"을 가진 Book 배열 객체 ! (좀더간략히줄이기)
	
	// 생성자
	public BookMember() {}
	public BookMember(String name, int phone, Book[] book) {
		this.name = name;
		this.phone = phone;
		this.borrow = book;
	}
	
	
	public void printMem() {
		System.out.printf("%s %d", this.name, this.phone);
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book[] getBorrow() {
		return borrow;
	}
	public void setBorrow(Book[] borrow) {
		this.borrow = borrow;
	}
} // class end
