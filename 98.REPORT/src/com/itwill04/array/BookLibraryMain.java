package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		
		Book books[] = new Book[3];
		books[1] = new Book(12345, "아동OT", "의학", "박혜연");
		books[2] = new Book(23456, "성인OT", "상식", "정민예");
		books[3] = new Book(23456, "성인OT", "상식", "정민예");
		
		BookMember member1 = new BookMember(30604, "김슬기", "01037128221");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */

		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		

	}
}