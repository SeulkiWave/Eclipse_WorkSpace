package DAO.guest;

import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		GuestDao guestDao = new GuestDao();
		Guest guest = new Guest(12, "김슬기", "20160302", "seulkiwave@gmail.com", "http://blog.naver.com/qnelwpffl", "blog", "no text");
		int count = guestDao.insert(guest);
		System.out.println(">> insert: "+count);
		
		Guest updateGuest = guest;
		updateGuest.setGuest_homepage("http://blog.naver.com/seulkiwave");
		count = guestDao.update(updateGuest);
		System.out.println(">> update: "+count);
		
		Guest fguest = guestDao.selectByNo(12);
		System.out.println(">> tempGuest: "+fguest);
		
		List<Guest> tempLists = guestDao.selectAll();
		for (Guest tempguest : tempLists) {
			System.out.println(tempguest);
		}
		
		count = guestDao.delete(12);
		System.out.println(">> delete: "+count);
		
	} // main end

}

// 날짜 sysdate말고 String으로 받아도 알아서 내부적으로 format변경 후 sql에 date로 대입할 수 있게 연습하기
// Collection 다시 공부하기