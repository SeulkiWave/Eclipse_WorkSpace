package generic;


public class Car {
	
	
	// 멤버 필드
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	
	// 생성자
	public Car() {}
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}



	// 멤버 메소드
	
	// 출차 시간 설정
	public void setOutTime(int outTime) {
		this.outTime=outTime;
		return;
	}
	
	// 입차 시간 설정
	public void setIpChaData(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	
	// 요금 계산
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	
	// 헤더 출력
	public static void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호", "입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	
	// 차량 정보 출력
	public void print() {
		System.out.printf("%7s %7d %9d %8d%n",this.no,this.inTime,this.outTime,this.fee);
		return;
	}
	
	
	
	
	// setter - 출차 시간 setter는 위에서 메소드로..
	public void setNo(String no) {
		this.no = no;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	// getter
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