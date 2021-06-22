
public class CarMemberMethodMain {

	public static void main(String[] args) {
		
		// 입차
		Car car1= new Car();
		car1.no= "7788";
		car1.inTime= 5;
		
		Car car2= new Car();
		car2.no= "5843";
		car2.inTime= 6;
		
		
		// 4시간 후 car1 10시 출차
		car1.outTime= 10;
		car2.outTime= 12;
		// 요금 계산
		car1.calculateFee();
		car2.calculateFee();
		
		//차량 정보 출력
		car1.print();
		car2.print();
		
		
	}

}
