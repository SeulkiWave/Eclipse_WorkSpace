
public class Car {
	
	// 기본형 객체의 포함
	private int no;
	private String model;
	
	// 엔진 객체 : 참조형 객체의 포함
	private Engine engine;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}
	
	public void print() {
		System.out.print(this.no + "\t" + this.model + "\t");
		this.engine.print();
	}
	
	
	
	
	
	
	// getter setter
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return this.engine;
		// 멤버 필드 engine에 접근하려면 내 자신의 주소 값을 알아야 한다
		// 이 상황에서도 Engine 클래스의 engine 값을 받기 위해서 자가참조변수 this.가 필요하다~
		// 단 생략 가능... = return engine; 도 가능하다.
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
