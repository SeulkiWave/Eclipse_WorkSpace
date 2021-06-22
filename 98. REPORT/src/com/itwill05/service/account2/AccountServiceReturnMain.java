package com.itwill05.service.account2;

import com.itwill05.service.account.Account;

public class AccountServiceReturnMain {
	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		
		System.out.println("1. 은행의 총계좌 수 반환");
		int totAccountNumber=accountServiceReturn.getTotAccountNumber();
		System.out.println(" >> 은행 총 계좌 수: "+totAccountNumber);
		System.out.println();
		
		System.out.println("2. 은행의 전체 계좌 출력");
		accountServiceReturn.print();
		System.out.println();
		
		System.out.println("3. 은행의 전체 계좌의 잔고 총합 반환");
		int totBalance=accountServiceReturn.getAccountTotBalance();
		System.out.println(" >> 은행총계좌잔고: "+totBalance);
		System.out.println();
		
		System.out.println("4. 입력한 계좌번호의 정보");
		Account findAccount=accountServiceReturn.findByNo(1111);
		findAccount.print();
		System.out.println();
		
		System.out.println("5. 입력한 금액 이상의 잔고를 가진 배열 객체의 참조변수 반환");
		System.out.println();
		
		System.out.println("6. 입력한 이율 이상의 배열 객체의 참조변수 반환");
		System.out.println();
		
		System.out.println("7. 입력한 계좌주 AIM를 가지고 있는 배열 객체의 참조변수 반환");
		System.out.println();
		
		System.out.println("8. 입력한 계좌 번호에 입력한 금액 입금");
		System.out.println();
		
		System.out.println("9. 입력한 계좌 번호에서 입력한 금액 출금");
		/*
		정렬기준(standard) --> 1:번호, 2:이름, 3:잔고, 4:이율 
	    정렬방법(order)    --> 5:오름차순, 6:내림차순
		 */
		System.out.println("10. 계좌 잔고 순 - 오름차순");
		accountServiceReturn.sort(3, 5);
		accountServiceReturn.print();
		
		System.out.println("11. 이름 순 - 내림차순");
		accountServiceReturn.sort(2, 6);
		accountServiceReturn.print(); //  ^-^
		
		// System.out.println("12. 계좌 객체의 이름, 잔고, 이율 수정");
		// System.out.println("13. 계좌 데이터의 이름, 잔고, 이율 수정");
		
		System.out.println("14. 계좌 번호와 일치하는 계좌 객체의 정보 삭제 후 삭제한 객체 정보 반환");
		
		
	}

}