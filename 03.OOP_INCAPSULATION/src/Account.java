
public class Account {
	/*
	 * 멤버 필드
	 */
	
	private int no; // 계좌 번호
	private String owner; // 계좌 주
	private int balance; // 잔고
	private double rate; //이율
	
	/*
	 * 멤버 메소드
	 */
	// 계좌 정보를 설정하는 메소드
	public void setAccountData(int no, String owner, int balance, double rate) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	
	//입금
	public void Deposit(int money) {
		this.balance += money;
	}
	
	//출금
	public void withDraw(int money) {
		this.balance -= money;
	}
	public void headerPrint() {
		System.out.printf("%s","\n-----------------------------------\n");
		System.out.printf("%-4s %-5s %-6s %-3s","번호", "이름", "잔고", "이율");
		System.out.printf("%s","\n-----------------------------------\n");
	}
	
	public void print(){
		System.out.printf("%d %s %d %4.1f \n", this.no, this.owner, this.balance, this.rate);
	}
	
	
	// getter, setter
	
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
	
	
}
