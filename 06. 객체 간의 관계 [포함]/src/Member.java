
public class Member {
	
	private int number;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(int num, String name) {
		this.number = num;
		this.name = name;
	}

	public void print() {
		System.out.println(this+"-->"+number+","+name);
	}
	
	public void method(int a) {
		/*
		 * The local variable may not have been initialised
		 * int tot;
		 * sysout (tot);
		 */
		int tot = 7;
		System.out.println("localvariable a: "+a);
		int b = a + 4;
		System.out.println("localvariable b: "+b);
		
	}
	
	
	
	
	// getter setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
