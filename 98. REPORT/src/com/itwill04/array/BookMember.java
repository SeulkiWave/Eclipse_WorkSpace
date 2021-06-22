package com.itwill04.array;


public class BookMember {
	
	private int num;
	private String name;
	private String phoneNumber;

	// 책을 여러권 빌림!!!!!!
	private Book[] books;
	
	// 회원 객체 생성자~
	public BookMember() {
	}
	public BookMember(int num, String name, String phoneNumber) {
		this.num = num;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// 회원 정보 출력
	public void print() {
		System.out.println(num+"\t"+name+"\t"+phoneNumber+"\t");
	}
	
	// getter setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}