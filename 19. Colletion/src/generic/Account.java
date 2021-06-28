package generic;
public class Account implements Comparable<Account>{
	// <>는 어떤 .. 거로 정렬할건지 ... 하라는거 아닐까.. 
	/*
	 * 멤버필드
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	/*
	 * 생성자
	 */
	public Account() {}
	public Account(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + "]";
	}	
	
	/*
	 * 멤버메쏘드
	 */
	//계좌데이타를 set하는메쏘드

	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	//입금
	public void deposit(int m) {
		this.balance += m;
	}

	//출금
	public void withDraw(int m) {
		//this.balance-=m;
		this.balance = this.balance - m;
	}

	public static void headerPrint() {
		System.out.printf("%s%n", "---------------------------");
		System.out.printf("%s %5s %4s %4s%n", "번호", "이름", "잔고", "이율");
		System.out.printf("%s%n", "---------------------------");
	}

	public void print() {
		System.out.printf("%d %6s %8d %5.1f %n", this.no, this.owner, this.balance, this.iyul);
	}

	//getter method
	public int getBalance() {
		return this.balance;
	}

	//setter method
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}

	//getter,setter
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

	public double getIyul() {
		return iyul;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	// Compare this object with the specified object for order.
	// Returns a negative integer, zero, or a positive integer
	// 	as this object is less than, equals to, or greater than the specified object.
	@Override
	public int compareTo(Account nextAcc) { // Comparable Override가 필요하다
		// 현재 Account와 대입받은 nextAcc를 비교한다
		
		if (this.balance > nextAcc.getBalance()) {
			return 1;
		} else {
			return -1;
		}
		
		/*
		if (this.owner.compareTo(nextAcc.getOwner()) > 0) { // A.compa(B): A-B, charAt(i) * 무한루프보다 효율적이다...
			// 어떤 조건일 때 바꾸고 싶으면 양수를 return, 안 바꿀 거면 0을 리턴해라! : 양수는 암거나 무조건 바꿈~
			return 1;
		} else {
			return -1; // 바꾸지 마~
		}
		// return 0; // 그닥 중요한 애는 아닌데 1이 아니면 안 바꾸는 역할로 냅두는 거겟죠...
		 */
	}

}