
public class Engine {
	
	private String type;
	private int cc;
	
	// Engine 생성자~
	public Engine() {}
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	
	
	
	
	
	
	// getter setter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	// Engine의 멤버 필드 출력하는 메소드~
	public void print() {
		System.out.println(this.type+"\t"+this.cc+"\t");
	}
}
