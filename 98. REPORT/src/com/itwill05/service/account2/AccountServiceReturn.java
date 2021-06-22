// null 거르기!

package com.itwill05.service.account2;

import com.itwill05.service.account.Account;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {
	

	private Account[] accounts = { 
			new Account(1111, "KIM", 85000, 5.9), 
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2), 
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2), 
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2), 
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2) };

	/*
	 * 0. 계좌 객체를 인자로 받아서 Account[]에 추가
	 */
	public void addAccount(Account newAccount) {
		/*
		 * 1. 배열 크기 증가 
		 * 	- 기존 배열보다 큰 배열 생성 
		 * 	- 기존 데이터 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}

	/*
	 * 0. 계좌 데이터를 인자로 받아서 Account[]에 추가
	 */
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		/*
		 * 1. 배열 크기 증가 
		 * 	- 기존 배열보다 큰 배열 생성 
		 * 	- 기존 데이터 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}

	/*
	 * 1. 은행의 총 계좌 개수 반환 메소드
	 */
	public int getTotAccountNumber() {
		return accounts.length;
	}
	
	public int getTotAccArray() { // 배열에 null이 있는 경우를 고려한...
		int count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				count++;
			}
		}
		return count;
	}

	/*
	 * 2. 은행 계좌들 전체 출력 메소드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 * 3. 모든 계좌 잔고의 총합을 반환하는 메소드
	 */
	public int getAccountTotBalance() {
		int sumBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			sumBal += accounts[i].getBalance();
		}
		return sumBal;
	}

	/*
	 * 4. 계좌 번호를 인자로 받아서 계좌 객체 "주소" 한 개 반환
	 */
	public Account findByNo (int no) {
		Account tempAcc = new Account();
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				tempAcc = accounts[i];
				break;
			}
		}		
		return tempAcc;
	}

	/*
	 * 5. 계좌 "잔고" 인자로 받아서 '잔고 이상'인 계좌 배열객체 참조변수 반환
	 */
	public Account[] findByBalance(int balance) {
		
		Account[] findAcc = null;
		
		// A. 만족하는 객체의 개수 구하기
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				count++;
			}
		}
		// B. Account객체배열생성
		findAcc = new Account[count]; // 이거 -1 아님!
		
		//C. 만족하는 Account객체들을 Account[]에 담기
		for (int i = 0; i < findAcc.length;) {
			for (int j = 0; j < accounts.length; j++) {
				if (accounts[j].getBalance() >= balance) {
					findAcc[i] = accounts[j];
					i++;
				}
			}
		}
		
		return findAcc;
	}
	/*
	 * 6. 계좌 이율 인자로 받아서 인자 이상인 계좌들 배열 객체 참조변수 반환
	 */
	public Account[] findByIyul(double iyul) {
		Account[] findAcc = null;
		
		int count = 0;
		for (int i = 0; i < accounts.length; i++) { // 1: 만족하는 객체의 개수
			if (accounts[i].getIyul() >= iyul) {
				count++;
			}
		}
		findAcc = new Account[count]; // 2: 조건 충족 객체 개수를 인덱스로 가지는 새 배열 객체 생성
		
		// 3: 만족하는 Account 객체들을 Account[]에 담기
		for (int i = 0; i < findAcc.length;i++) {
			for (int j = 0; j < accounts.length; j++) {
				findAcc[i] = accounts[j];
			}
		}
		return findAcc;
	}

	/*
	 * 7. 입력한 계좌주(AIM)를 가지고 있는 배열 객체의 참조변수 반환
	 */
	public Account[] findByName(String name) {
		Account[] findAcc = null;
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(name)) {
				count++;
			}
		}
		findAcc = new Account[count];
		for (int i = 0; i < findAcc.length; i++) {
			for (int j = 0; j < accounts.length; j++) {
				if (accounts[j].getOwner().equals(name)) {
					findAcc[i] = accounts[j];
					i++;
				}
			}
		}
		return findAcc;
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public Account ipGum(int no, int m) {
		
		Account findAccount = this.findByNo(no); // 계좌 번호로 계좌 찾기...
		findAccount.deposit(m); // 입금~
		return findAccount;

	}

	/*
	 * 9. 계좌 번호, 출금할 돈 인자로 받아서 출금
	 */
	public Account chulGum(int no, int m) {
		Account findAccount = this.findByNo(no);
		findAccount.withDraw(m);
		return findAccount;
	}

	/*
	 * 10,11 정렬  standard --> 1:번호,2:이름,3:잔고,4:이율 
	 *             order    --> 1:오름차순,2:내림차순 // 흠 이거 구분을 어케한담 (1, 1)..
	 *             standard 그룹이랑 order 그룹이 있고 그 안에서 나눌 수가 있나?
	 */
	public final static int ACC_NUM = 1; // 이거 한 군데에 모아서 정리하고 싶다
	public final static int ACC_OWNER = 2;
	public final static int ACC_BALANCE = 3;
	public final static int ACC_RATE = 4;
	public final static int UP = 5; // 이거 Acc_num이랑 중복을 피하게 묶을 수 잇을까......
	public final static int DOWN = 6;
	
	public void sort(int standard, int order) {
		switch (order) {
		case DOWN :
			switch (standard) {
				case ACC_NUM :
					for (int i = 0; i < accounts.length - 1; i++) {
						for (int j = 0; j < accounts.length - 1 - i; j++) {
							if(accounts[j].getNo() < accounts[j + 1].getNo()) {
								Account tempAccount = accounts[j];
								accounts[j] = accounts[j + 1];
								accounts[j + 1] = tempAccount;
							}
						}
					}
					break;
				case ACC_OWNER:
					for (int i = 0; i < accounts.length - 1; i++) {
						for (int j = 0; j < accounts.length - 1 - i; j++) {
							if((int)accounts[j].getOwner().charAt(0) < (int)accounts[j+1].getOwner().charAt(0)) {
								Account tempAccount = accounts[j];
								accounts[j] = accounts[j + 1];
								accounts[j + 1] = tempAccount;
							}
						}
					}
					break;
				case ACC_BALANCE:
					for (int i = 0; i < accounts.length-1; i++) {
						for (int j = 0; j < accounts.length-1; j++) {
							if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
								Account tempAcc = accounts[j+1];
								accounts[j+1] = accounts[j];
								accounts[j] = tempAcc;	
							}
						}
					}
					break;
				case ACC_RATE:
					for (int i = 0; i < accounts.length-1; i++) {
						for (int j = 0; j < accounts.length-1; j++) {
							if (accounts[j].getIyul() < accounts[j+1].getIyul()) {
								Account tempAcc = accounts[j+1];
								accounts[j+1] = accounts[j];
								accounts[j] = tempAcc;	
							}
						}
					}
					break;
			}
			break;
		case UP:
			switch (standard) {
				case ACC_NUM :
					for (int i = 0; i < accounts.length-1; i++) {
						for (int j = 0; j < accounts.length-1; j++) {
							if (accounts[j].getNo() > accounts[j+1].getNo()) {
								Account tempAcc = accounts[j+1];
								accounts[j+1] = accounts[j];
								accounts[j] = tempAcc;	
							}
						}
					}
					break;
				case ACC_OWNER:
					for (int i = 0; i < accounts.length-1; i++) {
						for (int j = 0; j < accounts.length-1; j++) {
							if ((int)accounts[j].getOwner().charAt(0) > (int)accounts[j-1].getOwner().charAt(0)) {
								Account tempAcc = accounts[j+1];
								accounts[j+1] = accounts[j];
								accounts[j] = tempAcc;	
							}
						}
					}
					break;
				case ACC_BALANCE:
					for (int i = 0; i < accounts.length-1; i++) {
						for (int j = 0; j < accounts.length-1; j++) {
							if (accounts[j].getBalance() > accounts[j+1].getBalance()) {
								Account tempAcc = accounts[j+1];
								accounts[j+1] = accounts[j];
								accounts[j] = tempAcc;	
							}
						}
					}
					break;
				case ACC_RATE:
					for (int i = 0; i < accounts.length-1; i++) {
						for (int j = 0; j < accounts.length-1; j++) {
							if (accounts[j].getIyul() > accounts[j+1].getIyul()) {
								Account tempAcc = accounts[j+1];
								accounts[j+1] = accounts[j];
								accounts[j] = tempAcc;	
							}
						}
					}
					break;
			}
		}
	}

	/*
	 * 12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	 */
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == updateAccount.getNo()) {
				/*********case1************ 
				 accounts[i].setOwner(updateAccount.getOwner());
				 accounts[i].setBalance(updateAccount.getBalance());
				 accounts[i].setIyul(updateAccount.getIyul());
				 **************************/
				/************ case2 **********/
				accounts[i] = updateAccount;
				break;
			}

		}
	}

	/*
	 * 13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		this.updateAccount(new Account(no, owner, balance, iyul));
	}
	
	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION] 
	 * 	A. 배열에서 Account객체삭제 
	 * 	B. 배열 사이즈 감소
	 *  C. 삭제한계좌객체반환
	 *  
	 */
	
	// 미완성
	/*
	public Account deleteByNo(int no) { 
		Account deleteAcc=null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
					deleteAcc = accounts[i]; // 삭제할 값 미리 옮겨두기..
					break;
				}
			}
		return deleteAcc;
	}
	*/
	
}
