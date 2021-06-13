package com.itwill03.include;

public class DvdMember {
	private int num, phone;
	private String name;
	private Dvd dvd;

	// 생성자~
	public DvdMember() {
	}

	public DvdMember(int num, String name, int phone, Dvd dvd) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.dvd = dvd;
	}

	public static void printHead() {
		System.out.printf("%s %s %s %s", "회원번호", "회원이름", "연락처", "대여 작품 이름");
		System.out.println();
	}

	public void print() {
		System.out.printf("%d %s %d %s", this.num, this.name, this.phone, this.dvd.getName());
		System.out.println();
	}

	public void printDVD() {
		System.out.println("대여한 작품 정보");
		System.out.printf("%d %s %s", this.dvd.getNum(), this.dvd.getName(), this.dvd.getGenre());
		System.out.println();
	}

	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public Dvd getDvd() {
		return dvd;
	}
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

}