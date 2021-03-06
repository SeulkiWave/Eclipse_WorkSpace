/*
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
 * 
 * ex: public int test(int a){
 * 
 * !!멤버 변수는 접근 제한자를 가질 수 있지만, 지역(로컬) 변수는 접근 제한자를 가질 수 없다!!
 * 
 * }
 */

/**
 * 
 * 이 클래스는 주차장에서 차 객체를 생성하기 위한 클래스 입니다.
 * @author SeulkiWave
 * @version 20210614
 * @since 20210614
 *
 */
public class Car {

	// 멤버 변수 (=멤버 필드, 속성)
	/**
	 * 차량 번호, 입차 시간, 출차 시간, 요금 저장 필드
	 */
	String no;
	int inTime;
	int outTime;
	int fee;
	
	
	// 2. 멤버 메소드[기능] (차 객체가 가지고 있는 기능)
	
	public void calculateFee() {
		this.fee= (this.outTime-this.inTime)*1000;
	}
	
	public void print() {
		System.out.println("------------------------------");
		System.out.printf("%4s %7s %7s %7s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("------------------------------");
		System.out.printf("%4s %7d %7d %8d원\n",this.no,this.inTime,this.outTime,this.fee);
	}

}
