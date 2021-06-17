public abstract class Employee {
	
	private int no;
	private String name;
	private int pay;
	public Employee() {}
	
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	// 급여 계산 메소드
	// - 실제 구현 작업 불가능.. (하위 객체마다 특징이 다르다? 급여 계산 방법이 다르고...)
	// - 자식 객체에서 ! 반드시 ! 재정의 해야하는 메소드!
	// ==> 재정의를 강제한다! 규칙! specification!
	public abstract void CalculatePay();
	
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t"+this.pay+"\t");
	}

	
	
	// getter setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
}
