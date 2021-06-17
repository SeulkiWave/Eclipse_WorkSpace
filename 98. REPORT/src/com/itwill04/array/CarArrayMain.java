package com.itwill04.array;
/*
 * 주차관리프로그램
 */
public class CarArrayMain {

	public static void main(String[] args) {
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		System.out.println("1. 전체 차량 출력 ====================");
		int count = 0; // 전체 주차 구획(차량 객체 배열) 카운트용..
		int possicount = 0; // 이미 주차 중인 차량 카운트용...
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
				possicount++; // 차량이 이미 주차가 되어 있을 때 주차 차량용 카운트 +1
			}
			count++;
		}
		System.out.println("2.전체 주차 구획 수 ====================");
		System.out.println(count+"구역");
		
		System.out.println("3. 주차 가능 주차 구획 수 ====================");
		System.out.println((carArray.length-possicount)+"구역");
		
		System.out.println("4. 입차 ==============================");
		Car[] incars = new Car[3]; // 새로운 차량 객체 생성..
		incars[0] = new Car("5843", 13);
		incars[1] = new Car("3975", 16);
		incars[2] = new Car("7777", 10);
		
		for (int i = 0; i < incars.length; i++) {
			for (int j=0; j<carArray.length; j++) {
				if(carArray[j] == null && j%10==1) { // 1번, 11번, 21번에 차 주차
					carArray[j] = incars[i];
					break;
				}
			}
		}
		
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}
		
		/*
		 * 1. 차량 객체 생성
		 * 2. 빈자리(null) 찾아서 대입
		 */
		
		System.out.println("5. 차량번호 7789번 차 1대 정보 출력 ===============");
		System.out.println("6. 입차시간 10시 이후 차량 여러대 찾아서 정보 출력 =====");
		System.out.println("7. 2389번 차량 12시 출차 ====================");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차에서 차량삭제
		 */
		
		
	}

}