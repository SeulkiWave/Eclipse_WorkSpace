
public class OverloadingMain {

	public static void main(String[] args) {
		
		Overloading ol1= new Overloading();
		ol1.method();
		ol1.method(12);
		ol1.method(12, 45);
		ol1.method(12, 45, 78);
		ol1.method("A");
		ol1.method("A", "B");
		ol1.method(12, 45, "A");
		
		
	}

}
