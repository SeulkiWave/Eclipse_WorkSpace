package com.itwill03.include;

public class Book {
	// 캡슐화된 멤버 변수~
	private int num, addr;
	private String name, desc;

	// 생성자~
	public Book() {
	}

	public Book(int num, String name, int addr, String desc) {
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.desc = desc;
	}

	// 멤버 메소드~
	public void print() {
		System.out.printf("");
		
		System.out.println("책 번호: "+this.num);
		System.out.println("책 이름: "+this.name);
		System.out.println("책 위치: "+this.addr);
		System.out.println("책 설명: "+this.desc);
	}

	
	// getter setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAddr() {
		return addr;
	}
	public void setAddr(int addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}