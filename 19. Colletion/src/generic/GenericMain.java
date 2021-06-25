package generic;

public class GenericMain {

	public static void main(String[] args) {
		
		System.out.println(" No Generic: 일반화 되어 있지 않음! ----------------------------------------");
		NoGenericClass ngc = new NoGenericClass();
		// ngc.setMember(new String("정신체리~"));
		// ngc.setMember(new Integer(123)); // ngc1.setMember(123); // 123은 기본형! Integer~ auto Boxing~
		// public void setMember(Object object) --> 참조변수가 들어가야 하니까 boxing 돼서 들어감!!
		// ngc.setMember(new Car());
		ngc.setMember(new Account(1111, "AAA", 10000, 1.0));
		Account getAcc = (Account) ngc.getMember(); // Object 타입이니까 꺼낼 떄 강제 형변환이 필요하다...
		getAcc.print();
		
		System.out.println(" Generic: 일반화! ----------------------------------------");
		GenericClass<Account> gc = new GenericClass<Account>();
		gc.setMember(new Account(1111, "AAA", 10000, 1.0));
		getAcc = gc.getMember(); // get 할 때 하위로 강제 형변환을 할 필요가 없다~
		getAcc.print();
		
		GenericClass<Car> gcCar = new GenericClass<Car> ();
		gcCar.setMember(new Car("1234", 12, 0, 0));
		Car getCar = gcCar.getMember();
		getCar.print();
		
		
		
		
		
		
	}

}
