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
		
		System.out.println("4. 입차 =============================="); // random 도 써보장~ 
		Car[] incars = new Car[3]; // 새로운 차량 객체 생성..
		incars[0] = new Car("5843", 13);
		incars[1] = new Car("3975", 16);
		incars[2] = new Car("7777", 10); // 이걸 for 안에서 생성과 동시에 들어가도록 설정하기.. 여러대는 어떻게?
		
		for (int i = 0; i < incars.length; i++) {
			for (int j=0; j<carArray.length; j++) {
				if(carArray[j] == null && j%10==0) { // 인덱스 1번, 11번, 21번에 차 주차
					// 이거 논리 연산자를 따질 때 앞쪽꺼가 false면 무조건 뒤쪽거를 안 봄 --> exception 발생 X
					// 이거 인덱스는 0번부터 시작하는 거 까먹고 j%10 == 1에 둬서 자꾸 2번 12번 22번에 들어가고 잇엇다 (7777번 차량 출력 안 됨..)
					carArray[j] = incars[i];
					break;
				}
			}
		}
		
		Car.headerPrint();
		
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}
		
		System.out.println("5. 차량번호 7789번 차 1대 정보 출력 ===============");
		/*
		for (int i = 0; i < carArray.length; i++) { // 이거!! 배열에 null이 있다는 걸 까먹음!
			if (carArray[i].getNo().equals("7789")) { // 타고 들어가는 걸 잘 써먹자...
				// 아까 carArray[i].equals("7789")라고 써놔서 이거 관계 없지 않냐는 경고가 떳음.. 비교하는 대상을 명확하게 기억하기!
				// carArray[i].equals(obj) 는 obj의 문자열과 carArray i번 인덱스를 비교하라고 하는거.. 문자열과 주소값을 비교한 셈?
				carArray[i].print();
				break;
			}
		}
		*/
		Car.headerPrint();
		// 고려해야 할 사항들 : carArray에는 null이 있다.. (exception발생) --> 데이터가 있는 객체만 비교하기?
		for (int i=0; i<carArray.length; i++) {
			if (carArray[i] != null) { // null이 아닌 애들만 꺼내기! <-- 나쁜코드 ㅠㅠ
				if (carArray[i].getNo().equals("7789")){ // boolean 연산자... -> 이거 &&로도 할 수 잇다~
					carArray[i].print();
				}
			}
		}
		
		
		System.out.println("6. 입차시간 10시 이후 차량 여러대 찾아서 정보 출력 ====="); // 얘도 null!
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) { // null이 아닌 애들만 꺼내기!
				if (carArray[i].getInTime() > 10) {
					carArray[i].print();
				}
			}
		}
		
		System.out.println("7. 2389번 차량 12시 출차 ====================");
		Car.headerPrint();
		
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) { // 이거 굳이... null을 걸러내려고 계속 if를 꺼내지 말고 값을 가진 배열 객체만 저장하는 유효 데이터 배열 객체를 따로 만들면 안 되나?
				// 4번에서 했던 배열에 배열 대입을 사용해보기.. (아침에..)
				if (carArray[i].getNo().equals("2389")) { // 2389 번 차량 찾기
					carArray[i].setOutTime(12); // 출차 시간 입력 - 요금계산도 같이 해주장
					carArray[i].calculateFee(); // 계산
					carArray[i].print(); // 영수증 출력
					carArray[i] = null; // 차량 값 삭제 . . .  . ? 이렇게 . . . ?
					// 여기에 break를 굳이 넣을 필요는 없는듯
				}
				
			}
		}
		
	} // main end

} // class end