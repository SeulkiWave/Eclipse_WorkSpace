package com.itwill03.include;

public class BookLibraryMain {
	public static void main(String[] args) {
		
		// 회원 객체 생성
		BookMember member = new BookMember(24,"김슬기", 37128221, null);
		// 헐 book 객체 부분 null로 비우고 아래에서 출력할 수 있다...
		
		// 책 객체 생성
		// 회원이 책 대여... <- 어떻게!!
		Book book1 = new Book(3, "1984", 45463, "디스토피아 사회를 그려낸 조지 오웰의 소설");
		member.setBorrow(book1); // 안됨 ㅡㅡ
		
		// Book book2 = new Book();
		// member.setBorrow(book2);
		// book2.setNum(3);
		// book2.setAddr(4189);
		// book2.setName("1984");
		// book2.setDesc("조지오웰 저"); <- 될리가 없음
		// member.setBorrow(book1.setNum(3), book1.setName("1984"), book1.setAddr(156), book1.setDesc("조지오웰 저"));
		// 이건 setBorrow에 Book 클래스 형식의 객체가 들어가야하는...
		
		BookMember.printHead();
		member.print();
		System.out.println();
		member.printBook();
		
	}
}