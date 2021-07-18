package DAO.member;

import java.util.Date;

public class MemberDAOTestMain {

	public static void main(String[] args) throws Exception {
		memberDAO memberDAO = new memberDAO();
		/*
		// insert
		Member member = new Member("XXXX", "1234", "정해리", "서울시", 8, "F", new Date());
		System.out.println(memberDAO.insert(member)+"행 insert");
		*/
		
		// update
		Member updateMember = new Member("HHHH", "9999", "정제이", "서울시", 11, "T", new Date());
		System.out.println(memberDAO.updateByID(updateMember)+"행 update");
		
		//delete
		//System.out.println(memberDAO.deleteByID("HHHH")+"행 delete");
		
		// Select By ID
		//System.out.println(memberDAO.selectByID("aaaa"));
		
		// select All
		//System.out.println(memberDAO.selectAll());
		
		
		
		
		
	}

}
