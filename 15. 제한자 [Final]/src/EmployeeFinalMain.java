
public class EmployeeFinalMain {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new SalaryEmployee(1, "AAA", 300000000),
				new SalaryEmployee(2, "BBB", 28000000),
				new SalaryEmployee(3, "CCC", 10000000),
				
				new HourlyEmployee(4, "DDD", 100, 20000),
				new HourlyEmployee(5, "EEE", 100, 8000),
		};
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].CalculatePay();
			System.out.println(emps[i].getName()+"님의 급여 명세표 ----------");
			emps[i].print();
			double incentive = emps[i].calIncentive();
			System.out.println("\t 인센티브: "+incentive+"원");
			System.out.println("----------------------------------------");
		}
		
		System.out.println("사원 인센티브: "+Employee.INCENTIVE_RATE);
		
		
		
	}

}
