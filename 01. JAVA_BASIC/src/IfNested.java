
public class IfNested {

	public static void main(String[] args) {
		/*
		 * 평점 산출: A, B, C, D, F
		 */
		
		int kor = -3000;
		char grade;
		
		if (kor < 0 || kor > 100) {
			System.out.println("유효한 점수가 아닙니다.");
			return; //유효성 검사를 통과하지 않으면 아래 실행문을 실행시키지 않고 JVM으로 반환된다.
		}
		
		if (kor>=90) {
			grade = 'A';
		} else {
			if (kor>=80) {
				grade = 'B';
			} else {
				if (kor >= 70) {
					grade = 'C';
				} else {
					if (kor >= 60) {
						grade = 'D';
					} else {
						if (kor < 60) {
							grade = 'F';
						}
					}
				}
			}
		}
		
		
		// 다중 if문
		if (kor>=90) {
			grade = 'A';
		} else if(kor>=80) {
			grade = 'B';
		} else if (kor>=70) {
			grade = 'C';
		} else if(kor>=60) {
			grade = 'D';
		} else if(kor<60) {
			grade = 'F';
		}
		
		/*
		 * Q U I Z :: 각 학점별 메세지를 출력하세요
		 * - A(98점 이상): 최우수
		 * - B: 선방
		 * - C: 으이그..
		 * - D: 재수강
		 * - F: ㅋㅋ
		 */
		
		
	} // main end

} // class end