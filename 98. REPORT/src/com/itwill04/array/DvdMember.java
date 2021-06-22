package com.itwill04.array;


public class DvdMember {
	private int num; // 회원 번호
	private String name; // 회원 이름
	private String contact; // 전화 번호
	private Dvd[] dvds; //빌린 dvd 들 [최대3개]
	public DvdMember() { 	}
	public DvdMember(int num, String name, String contact, Dvd[] dvds) {
		this.num = num;
		this.name = name;
		this.contact = contact;
		this.dvds = dvds;
	}
	
	public static void printHead () {
		System.out.printf("%s %s %s \n", "회원 정보", "회원 이름", "연락처");
		// 빌린 개수를 표시할 수 잇을까요.. 배열 객체의 필드는 3개가 만들어져잇지만 2개만 값이 들어잇을 떄 빌린 dvd권수를 2로 표시하는..
	}
	
	public void printDvdMem() {
		System.out.println(this.num+"\t"+this.name+"\t"+this.contact+"\t");
	}
	
	// 이 회원이 빌린 책의 이름만 출력하는 메소드를 만들고 싶다..
	// 포함하고 있는 배열 객체의 이름을 출력하는 메소드를 어떻게 만들 수 잇지..
	public void printDvdName() {
		for (int i=0; i < dvds.length; i++) {
			System.out.println(dvds[i].getTitle());
		}
	}
	
	public void printDvdInfo() {
		for (int i=0; i < dvds.length; i++) {
			dvds[i].printDvd();
		}
	}
	
	// Getter Setter
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}