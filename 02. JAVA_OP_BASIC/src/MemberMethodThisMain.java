class MemberMethodThis{
	int memberField1;
	char memberField2;
	double memberField3;
	
	public void setData(int memberField1, char memberField2, double memberField3) {
		this.memberField1= memberField1;
		this.memberField2= memberField2;
		this.memberField3= memberField3;
	}
	
	public void print() {
		System.out.println("print() --> "+this);
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+this.memberField3);
	}
	
}

public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1= new MemberMethodThis(); //7
		mmt1.setData(1, 'A', 0.1);
		mmt1.print();
		
		MemberMethodThis mmt2= new MemberMethodThis(); //9
		mmt2.setData(22, 'B', 0.2);
		mmt2.print();
		
		MemberMethodThis mmt3= new MemberMethodThis(); //11
		mmt3.setData(3, 'C', 0.3);
		mmt3.print();
		
		
		System.out.println();
		
		
	}

}
