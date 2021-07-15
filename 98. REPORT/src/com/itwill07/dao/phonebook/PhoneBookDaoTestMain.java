package com.itwill07.dao.phonebook;

public class PhoneBookDaoTestMain {

	public static void main(String[] args) throws Exception {
		// insert
		PhoneBook ctc1 = new PhoneBook(1, "김슬기", "1234-5678");
		PhoneBookDao ctcDAO = new PhoneBookDao();
		ctcDAO.insert(ctc1);
		
		// update
		PhoneBook ctc2 = new PhoneBook(2, "김슬기2", "5678-1234");
		ctcDAO.update(ctc2);
		
		// select
		ctcDAO.select(1);
		// select All
		ctcDAO.selectAll();
		
		// delete
		ctcDAO.delete(1);
		
	}

}