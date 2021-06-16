
public class Car {
	
	public static int count;
	// 차량의 총 생산량을 기록하기 위한 정적 변수...
	
	private int num; // 차량 번호
	private String model; // 차종
	private String color; // 색상
	// 캡슐화
	
	
	// alt shift S O
	public Car(int num, String model, String color) {
		this.num = num;
		this.model = model;
		this.color = color;
		Car.count++;
	}
	
	public static void printHeader() {
		System.out.println("-------------------------");
		System.out.println("번호\t차종\t색상");
		System.out.println("-------------------------");
	}
	
	public void print() {
		System.out.println(this.num+"\t"+this.model+"\t"+this.color);
	}
	
	
	
	

	// alt shift S R
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

