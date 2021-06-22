package com.itwill03.include;

public class DvdShopMain {

	public static void main(String[] args) {
		DvdMember member = new DvdMember(3, "김슬기", 37128221, null);
		
		Dvd dvd1 = new Dvd(17, "Chorus", "Musical");
		
		member.setDvd(dvd1);
		
		DvdMember.printHead();
		member.print();
		member.printDVD();
	}

}