
public class SwitchTest {

	public static void main(String[] args) {
		
		int level = 2;
		String msg = ""; // 빈 문자열의 표현. 한 문자는 char c = ' ';
		
		//switch는 ()안에 조건문 대신 변수 기술. 정수 int만 가능하다... case 21억개 long 은 안됨. 문자열은 가능...
		switch (level) {
		case 1:
			msg = "뉴비";
			break;
		case 2:
			msg = "초보";
			break;
		case 3:
			msg = "중수";
			break;
		case 4: // 실행문이 같은 경우 이렇게...
		case 5:
			msg = "고수";
			break;
		default:
			msg = "레벨 값은 1~5 사이의 정수입니다.";
			break;
			
		
		}
		System.out.printf("레벨 %d의 칭호는 << %s >>입니다.", level, msg);
	}
}
