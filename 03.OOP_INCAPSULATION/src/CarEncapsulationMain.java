

public class CarEncapsulationMain {

	public static void main(String[] args) {
		
		Car car1, car2;
		car1= new Car();
		car1.setIpChaData("1244", 12);
		
		car2= new Car();
		car2.setIpChaData("6974", 14);
		
		// 4시간 후
		car1.setOutTime(20);
		car2.setOutTime(20);
		
		// 요금 계산
		car1.calculateFee();
		car2.calculateFee();
		
		car1.print();
		car2.print();
		
		
		/*
		 * car1의 주차 요금 반환
		 */
		int car1Fee = car1.getFee();
		System.out.println("car1Fee: "+car1Fee);
		
		
		
	}

}
