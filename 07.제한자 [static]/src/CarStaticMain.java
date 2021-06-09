
public class CarStaticMain {

	public static void main(String[] args) {
		
		Car.count = 0;
		
		
		Car car1 = new Car(1, "LANDROVER", "NAVY");
		
		Car car2 = new Car(2, "VOLVO", "WHITE");
		
		Car car3 = new Car(3, "FORCHE", "RED");
		
		
		Car.printHeader();
		car1.print();
		car2.print();
		car3.print();
		
		System.out.println("차량의 총 생산량: "+Car.count);
		
	}

}
