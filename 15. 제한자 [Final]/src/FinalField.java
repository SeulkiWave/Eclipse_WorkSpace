/*
제한자(final)
	1. 클래스 앞에 붙일 경우: 상속 금지 
		(ex) public final class Test{}
	2. 멤버 메소드 앞에 붙일 경우: 오버라이딩 금지
		(ex) public final void print(){}
	3. 멤버 변수 앞에 붙일 경우 --> 상수
		(ex) public final int PORT_NUMBER=80;
		상수화된다! --> 상수라서 대문자! (변경금지)
*/

public class FinalField {
	
	public final int PORT_NUMBER = 80;
	public final double INCENTIVE_RATE;
	
	public final static int NORTH = 0;
	public final static int SOUTH = 1;
	public final static int EAST = 2;
	public final static int WEST = 3;
	
	
	
	public FinalField() {
		this.INCENTIVE_RATE = 0.1;
		// this.PORT_NUMBER = 33333;
		// The final field FinalField.PORT_NUMBER cannot be assigned;
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(this.PORT_NUMBER);
		
		// static이니까! this가 아님! 
		// static은 고정된 메세지기 때문에 해당 변수가 속한 곳을 참조함 --> FinalField.NORTH
		// FinalField.NORTH = 1; --> 불가능~
		// The final field FinalField.NORTH cannot be assigned;
		
		System.out.println(NORTH);
		System.out.println(SOUTH);
		System.out.println(EAST);
		System.out.println(WEST);
	}
	
	public void move (int direction) {
		switch(direction) {
		case FinalField.NORTH:
			System.out.println("move north");
			break;
		case FinalField.SOUTH:
			System.out.println("move south");
			break;
		case FinalField.EAST:
			System.out.println("move east");
			break;
		case FinalField.WEST:
			System.out.println("move west");
			break;
		}
	}
	
	
	
}
