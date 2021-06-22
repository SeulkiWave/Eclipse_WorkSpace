
public class CarConstructorMain {

	public static void main(String[] args) {
		
		System.out.println("---------- 차량 입차 출차 ----------");
		
		Car car1 = new Car("2345", 10);
		car1.setOutTime(12);
		car1.calculateFee();
		car1.printHead();
		car1.print();
		
		Car car2 = new Car("5634", 11);
		car2.setOutTime(15);
		car2.calculateFee();
		car2.print();
		
		
		
		System.out.println("------ 금일 주차장 이용 차량 출력 ------");
		Car cara = new Car("1111", 1, 2, 2000);
		Car carb = new Car("2222", 3, 5, 3000);
		Car carc = new Car("3333", 11, 13, 2000);
		Car card = new Car("4444", 10, 15, 5000);
		Car care = new Car("5555", 5, 7, 2000);
		Car carf = new Car("6666", 9, 10, 3000);
		
		cara.printHead();
		cara.print();
		carb.print();
		carc.print();
		card.print();
		care.print();
		carf.print();
		
	}

}
