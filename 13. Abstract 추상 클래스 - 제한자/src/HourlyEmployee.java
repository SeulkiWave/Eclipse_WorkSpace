public class HourlyEmployee extends Employee {
	
	private int worksHour; // μΌν μκ°
	private int payPerHour;
	
	public HourlyEmployee() {}
	
	public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no, name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}
	
	@Override
	public void CalculatePay() {
		this.setPay(worksHour*payPerHour);
	}
	
	public void print() {
		super.print();
		System.out.println(worksHour+"\t"+payPerHour+"\t");
	}
	
	
	
	// getter setter
	public int getWorksHour() {
		return worksHour;
	}
	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
}
