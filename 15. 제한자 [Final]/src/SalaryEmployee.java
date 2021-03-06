public class SalaryEmployee extends Employee {
	private int annualSalary; // 연봉~
	
	public SalaryEmployee() {}
	
	public SalaryEmployee(int no, String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}
	
	// public double calIncentive() {}
	// Cannot Override the final method from Employee(Class)
	
	@Override
	public void CalculatePay() {
		int pay = this.annualSalary/12;
		this.setPay(pay);
	}
	
	public void print() {
		super.print();
		System.out.println(this.annualSalary);
	}
	
	
	// getter setter : annualSalary
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
}
