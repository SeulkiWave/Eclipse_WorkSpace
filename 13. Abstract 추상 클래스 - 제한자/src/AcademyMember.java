public abstract class AcademyMember {
	
	public int num;
	public String name;
	
	public AcademyMember() {}

	public AcademyMember(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public void print() {
		System.out.print(num+"\t"+name+"\t");
	}
	
	// Getter Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
