import java.util.Iterator;

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		
		System.out.println("test");
		
		// < 배열 객체의 초기화 >
		System.out.println("======= 학생 데이터를 저장하기 위한 객체 생성 초기화 =======");
		int[] noArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] nameArray = {"Kim", "Lee", "Park", "Kwon", "Song", "Namgung", "Hwang", "Jang", "Jeong", "Hong"};
		int[] korArray = {78, 56, 12, 91, 67, 88, 93, 67, 99, 56};
		int[] engArray = {44, 66, 89, 21, 73, 34, 78, 22, 99, 32};
		int[] mathArray = {83, 76, 42, 90, 47, 77, 95, 61, 78, 20};
		int[] totArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] avgArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char[] gradeArray = {'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F'};
		int[] rankArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		// 총점, 평균, 학점 계산
		for (int i=0;i < noArray.length; i++) {
			totArray[i] = korArray[i]+engArray[i]+mathArray[i];
			avgArray[i] = totArray[i]/3.0;
			
			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}
			
		}
		
		// Q U I Z 석차 계산
		// - 0번 학생의 석차 계산
		for (int i = 0; i < noArray.length; i++) {
			
			for (int j = 0; j < noArray.length; j++) {
				if (totArray[0] < totArray[j]) {
					rankArray[0]++;
				} 
			}
		}
		
		
		
		System.out.println("==================================================");
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.printf("%s %s %s %s %s %s %3s %s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("========================================");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);			
		}
		
		
		
		System.out.println("==================================================");
		// 3번 학생 찾아서 1명의 정보를 출력 (학생 번호는 중복되지 않는다..)
		// Create - Read - Update - Delete : CRUD방식으로 업무 진행~
		System.out.println(">> 3번 학생을 찾아서 1명 정보를 출력한다. (학생 번호 중복 X)");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break; // 3번을 가진 학생 1명을 찾았기 떄문에 굳이 더 찾을 필요 없으므로 중단~
				// break는 switch 블록을 벗어나거나. 루프를 중단한다~
			}
		}
		
		
		
		System.out.println("==================================================");
		// F 학점 학생을 모두 출력
		// 이 경우 break를 쓸 수 없음!
		System.out.println("F 학점 학생을 모두 찾아서 정보를 출력한다.");
		for (int i = 0; i < noArray.length; i++) {
			if (gradeArray[i] == 'F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		
		
		System.out.println("==================================================");
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.printf("%s %s %s %s %s %s %3s %s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("========================================");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);			
		}
		
		
		// 정렬: 오름, 내림차순~
		// Q U I Z 오름차순 정렬
		for (int i = 0; i < noArray.length-1; i++) {
			for (int j = 0; j < noArray.length-1; j++) {
				if (totArray[j] > totArray[j+1]) {
					// swap!
					// 번호 교환
					int noTemp = noArray[j];
					noArray[j] = noArray[j+1];
					noArray[j+1] = noTemp;
					
					// 이름 교환
					String nameTemp = nameArray[j];
					nameArray[j] = nameArray[j+1];
					nameArray[j+1] = nameTemp;
					
					// 국어, 수학, 영어, 성적 교환
					int korTemp = korArray[j];
					korArray[j] = korArray[j+1];
					korArray[j+1] = korTemp;
					
					int engTemp = engArray[j];
					engArray[j] = engArray[j+1];
					engArray[j+1] = engTemp;
					
					int mathTemp = mathArray[j];
					mathArray[j] = mathArray[j+1];
					mathArray[j+1] = mathTemp;
					
					int totTemp = totArray[j];
					totArray[j] = totArray[j+1];
					totArray[j+1] = totTemp;
					// 총점은 대전제에서 이미 했다! 그렇지만 정리를 위해 다시 하기..
					
					// 평균 교환
					double avgTemp = avgArray[j];
					avgArray[j] = avgArray[j+1];
					avgArray[j+1] = avgTemp;
					
					// 등급 교환
					char gradeTemp = gradeArray[j];
					gradeArray[j] = gradeArray[j+1];
					gradeArray[j+1] = gradeTemp;
					
					// 석차 교환
					int rankTemp = rankArray[j];
					rankArray[j] = rankArray[j+1];
					rankArray[j+1] = rankTemp;
				} 
			}
		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.printf("%s %s %s %s %s %s %3s %s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("========================================");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);			
		}
		
		
	} // main end

}
