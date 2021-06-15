package com.itwill031.include;

public class BookLibraryMain {

	public static void main(String[] args) {
		
		Book[] books = new Book[3];
		books[0] = new Book(389, "기능해부학");
		books[1] = new Book(964, "신경해부학");
		books[2] = new Book(486, "근골해부학");
		
		BookMember member1 = new BookMember("김슬기", 37128221, books);
		
		member1.printMem();
		System.out.println();
		
		for (int i=0; i < books.length; i++) {
			books[i].prtBk();
		}
		
	}

}
