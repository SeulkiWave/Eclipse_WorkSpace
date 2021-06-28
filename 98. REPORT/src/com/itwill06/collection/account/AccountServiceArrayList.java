package com.itwill06.collection.account;

import java.util.ArrayList;
import java.util.Iterator;
// Account 객체 전체에 관련된 업무를 실행할 클래스
public class AccountServiceArrayList {
	private ArrayList<Account> accList;
	
	public AccountServiceArrayList() {
		accList=new ArrayList<Account>();
		accList.add(new Account(1111, "KIM", 89000, 1.3)); accList.add(new Account(2222, "AIM", 45000, 2.7));
		accList.add(new Account(3333, "FIM", 23000, 4.7)); accList.add(new Account(4444, "XIM", 34000, 6.7));
		accList.add(new Account(5555, "HIM", 78000, 3.7)); accList.add(new Account(6666, "AIM", 99000, 5.7));
		accList.add(new Account(7777, "PIM", 89000, 4.7)); accList.add(new Account(8888, "QIM", 91000, 1.7));
		accList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3), new Account(2222, "AIM", 45000, 2.7), new Account(3333, "FIM", 23000, 4.7),
			new Account(4444, "XIM", 34000, 6.7), new Account(5555, "HIM", 78000, 3.7), new Account(6666, "AIM", 99000, 5.7),
			new Account(7777, "PIM", 89000, 4.7), new Account(8888, "QIM", 91000, 1.7), new Account(9999, "MIM", 12000, 0.7), 	};
	*/
	
	//계좌전체반환
	public ArrayList<Account> getAccountList() {
		return accList; // 그냥 반환이니까 이게 끝...?
	}
	
	// 계좌추가
	public boolean addAcc (Account account) {
		// 번호 중복 체크 후 중복이면 호출한 클래스에게 true, false를 반환 해줌
		boolean isAdd = accList.add(account);
		while (accList.iterator().hasNext()) {
			Account tempAcc = accList.iterator().next();
			if (account.getNo() != tempAcc.getNo()) { // 중복이 아닌 경우...................
				accList.add(account);
				break; // 흠..........
			} else { // 중복인 경우 그냥 메소드 실행을 안 해야 하는 건지.. 중복으로 등록되지 않게 할 방법,,
				break; // 이렇게?
			}
		}
		return isAdd;
	} // public boolean end
	
	// 1. 은행 계좌 들 총 계좌 수 반환 메소드 정의
	public int totAccountNumber() {
		return accList.size();
	}
	
	// 2. 은행 계좌들 전체 출력 메소드 정의
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accList.size(); i++) { // 인덱스를 사용하는 경우
			Account presAcc = accList.get(i);
			presAcc.print();
		}
		
		// E N H A N C E   F O R ! ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		for (Account tempAcc : accList) { // accList에서 0번 인덱스부터 temp에 대입한다.. accList의 사이즈까지~ 
			tempAcc.print();
		}
		
	}
	// 3. 은행 계좌들 총 잔고 반환 메소드 정의
	public int sumBalance(){
		int sum=0;
		Account acc;
		for (int i = 0; i < accList.size(); i++) {
			acc = accList.get(i);
			sum += acc.getBalance();
		}
		return sum;
	}
	
	public int sumBalEnhFor() {
		int sum = 0;
		for (Account tempAcc : accList) {
			sum += tempAcc.getBalance();
		}
		return sum;
	}
	
	// 4. 계좌 번호 인자로 받아서 계좌 한 개 반환 메소드 정의
	public Account findByNo (int no) {
		Account findAcc = null;
		for(int i = 0; i < accList.size(); i++) {
			findAcc = accList.get(i);
			if (findAcc.getNo() == no) {
				return findAcc;
			}
		}
	} // 왜 되는거지...
	
	// 5. 계좌 잔고 인자로 받아서 잔고 이상인 계좌들 반환
	public ArrayList<Account> findByBal (int balance) {
		ArrayList<Account> findAccList=new ArrayList<Account>();
		for (int i = 0; i < accList.length; i++) {
			Account tempAcc = accList.get(i);
			if (tempAcc.getBalance() == balance) {
				findAccList.add(tempAcc);
			}
		}
		return findAccList;
	}
	
	// 8. 6666번 계좌 4000원 입금
	public void ipGum(int no,int m) {
		Account tempAcc = null;
		for (int i = 0 ; i < accList.length; i++) {
			tempAcc = accList.get(i);
			if (tempAcc.getNo() == no) {
				tempAcc.deposit(m);
			}
		}
	}
	
	// 9. 1111번 계좌 5000원 출금
	public void chulGum(int no,int m) {
		Account tempAcc = null;
		for (int i = 0; i < accList.length; i++) {
			tempAcc = accList.get(i);
			if (tempAcc.getNo() == no) {
				tempAcc.withDraw(m);
			}
		}
	}
	
	// 7. 은행 계좌들 중에 계좌주 이름이 AIM인 계좌들 반환
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccList=new ArrayList<Account>();
		for (int i = 0; i < accList.length; i++) {
			Account tempAcc = accList.get(i);
			if (tempAcc.getOwner().equals(owner)) {
				findAccList.add(tempAcc);
			}
		}
		return findAccList;
	}
	
	// 9. VIP 계좌 (잔고 70000원 이상) 들 반환
	public ArrayList<Account> findByVip(int balance) {
		ArrayList<Account> findAccList=new ArrayList<Account>();
		Account tempAcc = null;
		for (int i = 0; i < accList.length; i++) {
			tempAcc = accList.get(i);
			if (tempAcc.getBalance() >= balance) {
				findAccList.add(tempAcc);
			}
		}
		return findAccList;
	}
	
	// 10. 계좌를 잔고 순으로 오름차순 정렬 -- ㄴㄴ
	public void sortByBalanceAsc() {
		
	}
	// 11. 계좌를 잔고 순으로 내림차순 정렬 -- 하지마
	public void sortByBalanceDesc() {
		
	}
	
	// 12. 6666번 계좌의 이름, 잔고, 이율 수정 (update)
	public void updateAcc(Account updateAcc) {
		int index = updateAcc.getNo(); 
		accList.set(index, updateAcc);
	}
	// 13. 번호로 계좌 삭제
	public Account deleteByNo(int no) {
		Account deleteAcc=null;
		for (int i = 0; i < accList.length; i++) {
			if (accList.get(i).getNo == no) {
				deleteAcc = accList.get(i);
				accList.remove(i);
			}
		}
		return deleteAcc;
	} 
	
}