
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		
		Account account1= new Account();
		
		account1.setAccountData(6954, "김슬기", 50000, 0.3);
		// The field Account.** is no visible
		/*
		account1.no= 692854;
		account1.owner= "김슬기";
		account1.balance= 50000;
		account1.rate= 0.3;
		account1.print();
		*/
		
		account1.withDraw(1000);
		account1.print();
		
		account1.Deposit(34000);
		account1.print();
		
		/*
		int account1Balance= account1.balance; :: 멤버 변수에 접근할 수 없음
		*/
		int account1Balance= account1.getBalance();
		System.out.println("account1의 잔고 조회: "+account1.getBalance()+"원"); 
		System.out.println("account1의 잔고 조회: "+account1Balance+"원"); 
		
		
		Account account2= new Account();
		
		account2.setAccountData(2285, "Lee", 90000, 0.3);
		account2.Deposit(95480);
		account2.print();
		
		// account2 의 이율 변경
		// account2.rate= 0.7;
		account2.setRate(0.7);
		account2.print();
		
		System.out.println("--------------- 모든 계좌 출력 ---------------");
		account1.headerPrint();
		
		account1.print();
		account2.print();
		
		
		System.out.println("account2의 이율: "+account1.getRate()+"원"); 
		
	}

}
