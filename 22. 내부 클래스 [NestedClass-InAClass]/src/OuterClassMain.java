
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outerMemberField = 123456;
		oc.outerMemberMethod();
		
		/*
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.innerMemberField = 123123;
		ic.innerMemberMethod(); 
		*/
		
	}

}
