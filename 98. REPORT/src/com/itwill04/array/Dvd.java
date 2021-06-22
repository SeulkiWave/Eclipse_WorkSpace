package com.itwill04.array;

public class Dvd {
	private int num;// 번호
	private String title;// 타이틀
	private String genre;// 쟝르

	public Dvd() {
	}

	public Dvd(int num, String title, String genre) {
		super(); // Object를 호출하는 생성자~ 생략해도 되지만 리뷰개념으루~
		this.num = num;
		this.title = title;
		this.genre = genre;
	}
	
	public void printDVDName() {
		System.out.println(this.title +"\t");
	}
	public void printDvd() {
		System.out.println("\t" + num + "\t" + title + "\t" + genre);
	}

	// Getter Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}