 /*
 * Class 선언 164p
 * - 형식
 * 	접근제한자 class 클래스이름(=식별자) {}
 * 	- 접근 제한자: public, protected, 없는거...
 * 
 * 구성요소 (=멤버)
 * 1. 멤버 변수 선언 (속성)
 * 	접근제한자(public, protected, 없는거? private) 타입 identifier
 * 	ex: public String carName;
 * 
 * 2. 멤버 메소드 선언 (행위)
 * 	접근제한자 리턴타입 메소드이름(인자){}
 * 	- 인자: 나를 호출한 대상이 데이터를 넣어줄 통로
 * 	- 리턴 타입: 나를 호출한 대상에게 줄 데이터 타입
 * 			void --> 줄 데이터가 없는경우
 */

public class CarMemberFieldMain {

	public static void main(String[] args) {

		// 1. 차량 입차 1234번 차량 12시
		
		// 차 객체 데이터를 저장할 변수 선언
		// 'car' 객체의 주소를 저장할 참조 변수 선언! (8byte)
		Car car;
		
		// Car 클래스를 사용해 객체를 생성한 후 car '참조' 변수에 '주소값' 대입
		car = new Car(); // 우: 객체 생성. 객체가 car에 대입됨..
		// Car 클래스를 만들었다는 것
		// 1. 객체를 저장하기 위함 2. 객체를 만들 "틀"을 만들기 위함
		
		// car 객체의 +no라는 이름의 멤버 속성(필드) 대입
		car.no= "1234";
		car.inTime= 12;
		// car 클래스 내 클래스 속성을 나타내는 멤버변수만을 표기하기 위해 구분짓는 '.'
		
		// 2. 16시 car 차량 출차
		// car 객체의 outTime멤버변수(필드)에 16 대입(초기화)
		car.outTime= 16;
		
		// 주차 요금 계산
		// 차 객체의 fee 멤버 변수에 
		car.fee= (car.outTime-car.inTime)*1000;
		
		
		// 영수증 출력
		System.out.println("------------------------------");
		System.out.printf("%4s %7s %7s %7s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("------------------------------");
		System.out.printf("%4s %7d %7d %8d원",car.no,car.inTime,car.outTime,car.fee);
		
		
	}
	

}
