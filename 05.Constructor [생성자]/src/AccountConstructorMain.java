
public class AccountConstructorMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1111, "KIA", 89000, 0.3);
		Account acc2 = new Account(2222, "KIB", 45000, 0.2);
		Account acc3 = new Account(3333, "KIC", 23000, 0.1);
		Account acc4 = new Account(4444, "KID", 11000, 1.3);
		Account acc5 = new Account(5555, "KIE", 79000, 2.3);
		
		Account acc6 = new Account();
		acc6.setAccountData(6666, "KIF", 66000, 0.6);
		
		System.out.println("---------- 모든 계좌 잔고 100원 증가 ----------");
		
		acc1.Deposit(100);
		acc2.Deposit(100);
		acc3.Deposit(100);
		acc4.Deposit(100);
		acc5.Deposit(100);
		acc6.Deposit(100);
		
		acc1.headerPrint();
		
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();
		acc6.print();
		
		
		
		
	}

}
