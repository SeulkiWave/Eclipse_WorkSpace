
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
public class Car {

	// 멤버 변수 (=멤버 필드, 속성)
	private String no;
	private int inTime;
	private int outTime;
	private int fee;
	
	
	// 2. 멤버 메소드[기능] (차 객체가 가지고 있는 기능)
	
	/*
	 * 출차시간셋팅
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
		return;
	}
	
	/*
	 * 입차데이타(번호,입차시간) 셋팅
	 */
	public void setIpChaData(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	
	/*
	 * 요금계산
	 */
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	
	public void print() {
		System.out.println("------------------------------");
		System.out.printf("%4s %7s %7s %7s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("------------------------------");
		System.out.printf("%4s %7d %7d %8d원\n",this.no,this.inTime,this.outTime,this.fee);
	}
	
	

	public void setNo(String no) {
		this.no = no;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getNo() {
		return no;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public int getFee() {
		return fee;
	}
	
	

}
