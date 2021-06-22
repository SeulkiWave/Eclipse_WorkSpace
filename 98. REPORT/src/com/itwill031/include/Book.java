package com.itwill031.include;

public class Book {
	
	private int num;
	private String name;
	
	public Book() {}
	public Book(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	// 헤더프린트..
	public static void prtBkHead() {
		System.out.printf("%s %s", "책 번호", "책 이름");
	}
	// 책 정보 프린트
	public void prtBk() {
		System.out.printf("%d %s", this.num, this.name);
		System.out.println();
	}
	
	
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
}