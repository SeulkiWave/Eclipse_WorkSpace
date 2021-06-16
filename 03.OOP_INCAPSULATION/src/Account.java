/**
 * 계좌 객체를 생성하기 위한 클래스 입니다.
 * @author SeulkiWave
 *
 */

public class Account {
	/*
	 * 멤버 필드
	 */
	
	private int no; // 계좌 번호
	private String owner; // 계좌 주
	private int balance; // 잔고
	private double rate; //이율
	
	// 계좌 정보를 설정하는 메소드
	/**
	 * Method setting the data about account.
	 * @param no : account number
	 * @param owner : account owner's name
	 * @param balance : balance
	 * @param rate : rate
	 */
	public void setAccountData(int no, String owner, int balance, double rate) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	
	//입금
	/**
	 * method of the deposit
	 * @param money : deposit money
	 */
	public void Deposit(int money) {
		this.balance += money;
	}
	
	//출금
	/**
	 * method of the withdraw
	 * @param money : withdraw money
	 */
	public void withDraw(int money) {
		this.balance -= money;
	}
	public void headerPrint() {
		System.out.printf("%s","\n-----------------------------------\n");
		System.out.printf("%-4s %-5s %-6s %-3s","번호", "이름", "잔고", "이율");
		System.out.printf("%s","\n-----------------------------------\n");
	}
	
	/**
	 * method printing the account data
	 */
	public void print(){
		System.out.printf("%d %s %d %4.1f \n", this.no, this.owner, this.balance, this.rate);
	}
	
	
	// getter, setter
	/**
	 * zz
	 * @return : return balance data
	 */
	public int getBalance() {
		return this.balance;
	}
	public void setRate(double rate) {
		this.rate= rate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getRate() {
		return rate;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return this.no+"\t"+this.owner+"\t"+this.balance;
	}
	
	
}
