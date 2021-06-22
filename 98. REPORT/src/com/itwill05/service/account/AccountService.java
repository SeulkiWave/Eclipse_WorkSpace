package com.itwill05.service.account;
/*
 * Account 객체 전체에 관련된 업무를 실행할 클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
 
public class AccountService {
	
	private Account[] accounts; // 계좌 객체...
	
	public AccountService() {
		accounts=new Account[9];
		accounts[0]=new Account(1111, "KIM", 89000, 1.3);
		accounts[1]=new Account(2222, "AIM", 45000, 2.7);
		accounts[2]=new Account(3333, "FIM", 89000, 4.7);
		accounts[3]=new Account(4444, "XIM", 34000, 6.7);
		accounts[4]=new Account(5555, "hIM", 78000, 3.7);
		accounts[5]=new Account(6666, "KIM", 89000, 5.7);
		accounts[6]=new Account(7777, "KIM", 89000, 4.7);
		accounts[7]=new Account(8888, "qIM", 91000, 1.7);
		accounts[8]=new Account(9999, "mIM", 12000, 0.7);
	}
	
	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		
		Account[] tempAcc = new Account[accounts.length+1];
		for (int i = 0; i < accounts.length; i++) { // tempAcc.length가 아님!!!!!
			tempAcc[i] = accounts[i];
		}
		tempAcc[tempAcc.length-1] = newAccount; // 인덱스 잘 기억해!!! 9번이 9번이 아님! 0번부터 9번이라 실질적 10번임!!!
		this.accounts = tempAcc; // 주소값 대입!!! + 로컬 변수를 멤버 변수로 만들어주는 대입 과정까지!
		
		/*
		Account[] accTemp = new Account[accounts.length+1]; // 큰 임시 배열을 만든 후에
		
		for (int i = 0; i < accTemp.length-1; i++) {
			accTemp[i] = accounts[i]; // 미리 값을 옮겨둔 후
		}
		
		Account[] accounts = new Account[accTemp.length]; // 원래 배열을 늘린 다음.. 
		for (int i = 0; i < accounts.length-1; i++) {
			accounts[i] = accTemp[i]; // 전부 대입 후
		}
<<<<<<< HEAD
		accounts[accounts.length] = new Account; // 마지막 칸에 새 객체 대입?
		*/	
		
	}
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		
		Account newAccount = new Account (no, owner, balance, iyul);
		this.addAccount(newAccount);
		/*
		Account[] accTemp = new Account[accounts.length+1];
		for (int i = 0; i < accTemp.length; i++) {
			accTemp[i] = accounts[i];
		}
		
		Account[] accounts = new Account[accTemp.length];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = accTemp[i];
		}
		
		accounts[accounts.length].setAccountData(no, owner, balance, iyul);
		*/
	}
	
	/*
	 1.은행 계좌들의 총 계좌 수 출력 메소드 정의
	 */
	public void totAccountNumberPrint() {
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			count++;
		}
		System.out.println(count);
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
		
	
	/*
	 * 3.은행계좌들 총 잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {
		System.out.println("< 계좌 잔고 > ------------------------------");
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("계좌번호: %s ----- 계좌 잔고: %d", accounts[i].getNo(), accounts[i].getBalance());
			System.out.println();
		}
	}
	
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		
		System.out.println("계좌번호: "+no+"----------------------------------------");
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				break;
			}
		}	
	}
	
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= balance) {
				accounts[i].print();
			}
		}
		
	}
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void findByIyulPrint(double iyul) {
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>iyul) {
				accounts[i].print();
			}
		}
		
	}
	/*
	7. 계좌주 이름 인자로 받아서 인자 이름과 동일한 계좌들 출력
	 */ 
	public void findByNamePrint(String name) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(name)) {
				accounts[i].print();
			} else if (accounts[i].getOwner() == null ){
				
			}
		}
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no,int m) {
		/*
		 * 1.계좌번호로 계좌찾기
		 * 2.입금
		 */
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].deposit(m);
				break;
			}
		}
		
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no,int m) {
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].withDraw(m);
				
				break;
			}
		}
	}
	
	/*
	 10.<< 정렬 >>
	 * standard --> 1:번호, 2:이름, 3:잔고, 4:이율
	 * order    --> 1:오름차순, 2:내림차순
	 */
	public void sortStandardNumberDown() {
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[i].getNo() < accounts[i+1].getNo()) {
					Account tempAcc = accounts[i+1];
					accounts[i+1] = accounts[i];
					accounts[i] = tempAcc;	
				}
=======
		accounts[accounts.length] = newAccount; // 마지막 칸에 새 객체 대입?
		*/	
		
	}
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		
		Account newAccount = new Account (no, owner, balance, iyul);
		this.addAccount(newAccount);
		/*
		Account[] accTemp = new Account[accounts.length+1];
		for (int i = 0; i < accTemp.length; i++) {
			accTemp[i] = accounts[i];
		}
		
		Account[] accounts = new Account[accTemp.length];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = accTemp[i];
		}
		
		accounts[accounts.length].setAccountData(no, owner, balance, iyul);
		*/
	}
	
	/*
	 1.은행 계좌들의 총 계좌 수 출력 메소드 정의
	 */
	public void totAccountNumberPrint() {
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			count++;
		}
		System.out.println(count);
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
		
	
	/*
	 * 3.은행계좌들 총 잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {
		System.out.println("< 계좌 잔고 > ------------------------------");
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("계좌번호: %s ----- 계좌 잔고: %d", accounts[i].getNo(), accounts[i].getBalance());
			System.out.println();
		}
	}
	
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		
		System.out.println("계좌번호: "+no+"----------------------------------------");
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				break;
			}
		}	
	}
	
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= balance) {
				accounts[i].print();
			}
		}
		
	}
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void findByIyulPrint(double iyul) {
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>iyul) {
				accounts[i].print();
			}
		}
		
	}
	/*
	7. 계좌주 이름 인자로 받아서 인자 이름과 동일한 계좌들출력
	 */ 
	public void findByNamePrint(String name) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(name)) {
				accounts[i].print();
			}
		}
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no,int m) {
		/*
		 * 1.계좌번호로 계좌찾기
		 * 2.입금
		 */
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].deposit(m);
				
				break;
			}
		}
		
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no,int m) {
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].withDraw(m);
				
				break;
			}
		}
	}
	
	/*
	 10.<< 정렬 >>
	 * standard --> 1:번호, 2:이름, 3:잔고, 4:이율
	 * order    --> 1:오름차순, 2:내림차순
	 */
	public void sortStandardNumberDown() {
		for (int i = 0; i < accounts.length-1; i++) {
			if (accounts[i].getNo() > accounts[i+1].getNo()) {
				Account tempAcc = accounts[i+1];
				accounts[i+1] = accounts[i];
				accounts[i] = tempAcc;
>>>>>>> branch 'master' of https://github.com/seulkikimwave/Eclipse_WorkSpace
			}
		}
	}
	
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		for (int i = 0; i < accounts.length-1; i++) {	
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account temAccount = accounts[j+1];
					accounts[j+1] = accounts[j];
					accounts[j] = temAccount;
				}
			}
		}
	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDescending() {
		for (int i = 0; i < accounts.length-1; i++) {	
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() < accounts[j+1].getBalance()) {
					Account temAccount = accounts[j+1];
					accounts[j+1] = accounts[j];
					accounts[j] = temAccount;
				}
			}
		}
	}	
	/*
	12. 계좌 객체를 인자로 받아서 이름, 잔고, 이율 수정 (update) [OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = updateAccount; // 흠;
			break;
		}
	}
	/*
	13. 번호, 이름, 잔고, 이율 인자로 받아서 계좌 객체 수정 (update) [OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		Account updateAccount = new Account(no, owner, balance, iyul);
		this.updateAccount(updateAccount);
	}
}
