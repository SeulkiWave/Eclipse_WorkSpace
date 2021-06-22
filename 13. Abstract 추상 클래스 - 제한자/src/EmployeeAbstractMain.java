
public class EmployeeAbstractMain {

	public static void main(String[] args) {
		
		SalaryEmployee emp1 = new SalaryEmployee(1, "Kim", 3000000);
		HourlyEmployee emp2 = new HourlyEmployee(2, "Park", 100, 26340);
		
		emp1.CalculatePay();
		emp2.CalculatePay();
		emp1.print();
		emp2.print();
		
		Employee e1 = emp1;
		Employee e2 = emp2;
		
		Employee[] emps = new Employee[5];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = new SalaryEmployee(3, "Jeong", 35000000);
		emps[3] = new SalaryEmployee(4, "Bu", 41696840);
		emps[4] = new HourlyEmployee(5, "Kang", 416, 15840);
		System.out.println();
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].CalculatePay();
			System.out.println(emps[i].getName()+"님의 급여 명세표 ===============");
			emps[i].print();
			System.out.println("==============================");
			System.out.println();
		}
		
	}

}
