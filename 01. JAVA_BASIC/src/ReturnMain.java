
public class ReturnMain {

	public static void main(String[] args) {
		
		int eng = -45;
		
		if(eng < 0 || eng > 100) {
			System.out.printf("입력된 점수 %d는 0과 100 사이의 정수가 아닙니다.",eng);
			return; // 유효성 검사에서 탈락해 반환됨
		} else if (eng>=90) { // 유효성을 가진 값으로 실행문 실행
			char grade = 'A';
			System.out.printf("입력된 점수 %d의 학점은 %c입니다.", eng, grade);
		} else if (eng>=80) {
			char grade = 'B';
			System.out.printf("입력된 점수 %d의 학점은 %c입니다.", eng, grade);
		} else if (eng>=70) {
			char grade = 'C';
			System.out.printf("입력된 점수 %d의 학점은 %c입니다.", eng, grade);
		} else if (eng>=60) {
			char grade = 'D';
			System.out.printf("입력된 점수 %d의 학점은 %c입니다.", eng, grade);
		} else if (eng<60) {
			char grade = 'F';
			System.out.printf("입력된 점수 %d의 학점은 %c입니다.", eng, grade);
		}
		
		return;
		// System.out.println("stmt"); : unreachable code
		
		/*
		
		int eng = -45;
		if (true) {
		sysout...
		return; // 이 경우 위 if문이 항상 true라서 항상 실행되기 때문에
		}
		sysout... // 이 출력문이 dead code로 분류되며 작동하지 못하게 된다.
		return;
		 */
		
	} // main end

} // class end
