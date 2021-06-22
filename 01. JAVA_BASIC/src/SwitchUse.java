
public class SwitchUse {

	public static void main(String[] args) {
		// 짝수 홀수 판별
		
		int number = 34;
		
		switch (number%2) {
			case 0:
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
				break;
		}
		
		
		// 4의 배수 판별
		int number2 = 400;
		switch (number%4) {
		case 0:
			System.out.println(number2+"는 4의 배수입니다.");
			break;
		default:
			System.out.println(number2+"는 4의 배수가 아닙니다.");
		}
		
		char direction = 'D';
		
		switch(direction) {
		case 'W':
			System.out.println("UP");
			break;
		case 'A':
			System.out.println("LEFT");
			break;
		case 'S':
			System.out.println("DOWN");
			break;
		case 'D':
			System.out.println("RIGHT");
			break;
		default:
			System.out.println("Hey?");
			break;
		}
	} //main end

}
