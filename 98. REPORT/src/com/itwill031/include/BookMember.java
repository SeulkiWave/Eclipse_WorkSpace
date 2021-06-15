package com.itwill031.include;

public class BookMember {
	
	// 배열 사용한 멤버 변수 선언
	private int phone;
	private String name;
	private Book[] borrow;
	// 대여 가능한 책을 3권으로 한정시킬 수 있을까?
	// 내 머리 속 이론,,: 초기화된 상태에서 직접 인덱스에 값을 대입하지 않으면 null (안 빌린 책의 상태)
	// 				인덱스에 값을 대입햇다면 그건 빌린 거 ..
	
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
