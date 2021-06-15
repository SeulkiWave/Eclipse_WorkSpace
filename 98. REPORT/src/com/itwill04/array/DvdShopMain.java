package com.itwill04.array;

public class DvdShopMain {

	public static void main(String[] args) {
		
		
		
		// DVD 객체..
		// 3개까지만 대여 가능..
		Dvd[] dvds = new Dvd[3];
		
		dvds[0] = new Dvd(123, "졸리다", "다큐멘터리");
		dvds[1] = new Dvd(456, "언제자지", "코미디");
		dvds[2] = new Dvd(789, "허리펴고", "컴터하기");
		/* - 클래스형 DVD객체를 대입할 수도 있겠지만..
		Dvd dvd1=new Dvd(123,"영화1","전쟁");
		Dvd dvd2=new Dvd(343,"영화2","전쟁");
		Dvd dvd3=new Dvd(566,"영화3","전쟁");
		*/
		
		// 회원 객체
		DvdMember m1=new DvdMember(1, "김슬기", "37128221", dvds);
		// 회원 객체를 만드는 동시에.. DVD 객체 배열의 주소값.. 참조변수 dvds를 m1의 DVD 배열 클래스형 객체 멤버 변수에 대입..
		
		// 회원 정보 출력 (회원이 빌린 DVD들 정보 출력)
		DvdMember.printHead();
		m1.printDvdMem();
		System.out.println("대여 DVD 이름 ==============================");
		m1.printDvdName(); // 빌린 DVD의 이름만 출력하는 메소드를 만들어보앗습니다..
		System.out.println("대여 DVD 정보 ==============================");
		m1.printDvdInfo();
		
	}

}