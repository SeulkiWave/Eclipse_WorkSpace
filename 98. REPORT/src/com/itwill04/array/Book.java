package com.itwill04.array;

public class Book {
	
	// 책 클래스의 멤버 변수
	private int no;
	private String title;
	private String category;
	private String desc;
	
	// 생성자
	public Book() {
	}
	public Book(int no, String title, String category, String desc) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.desc = desc;
	}
	
	// 책 클래스의 멤버 메소드
	public void print() {
		System.out.println("\t"+no+"\t"+title+"\t"+category+"\t"+desc+"\t");
		
	}
	
	// getter setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}