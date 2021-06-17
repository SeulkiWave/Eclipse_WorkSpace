
public class StudentScorePrint {

	public static void main(String[] args) {
		
		
		// 성적관리에서 학생2명 데이타를 담을 변수선언
		String stu1, stu2; 
		
		
		// 번호', 이름', 국어', 영어', 수학', 총점', 평균', 평점(A,B,C), 석차
		int stu1Num, stu1Kor, stu1Eng, stu1Math, stu1Rank;
		int stu2Num, stu2Kor, stu2Eng, stu2Math, stu2Rank;
		
		double stu1Sum, stu1Aver;
		double stu2Sum, stu2Aver;
		
		char stu1Grade=' ';
		char stu2Grade=' ';
		
		
		// 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		stu1 = "Kim"; 		stu2 = "Lee";
		stu1Num = 1; 		stu2Num = 2;
		stu1Kor = 84;		stu2Kor = 94;
		stu1Eng = 63; 		stu2Eng = 42;
		stu1Math = 96; 		stu2Math = 72;
		
	
		
		
		// 학생2명의 국어, 영어, 수학점수의 유효성체크
		// - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		if (stu1Kor<0 || stu1Kor > 100) {
			System.out.printf("학생 %s의 국어 점수 %d은(는) 0과 100 사이의 정수가 아닙니다.", stu1, stu1Kor);
			return;
		} else if(stu1Math < 0 || stu1Math > 100) {
			System.out.printf("학생 %s의 수학 점수 %d은(는) 0과 100 사이의 정수가 아닙니다.", stu1, stu1Math);
			return;
		} else if(stu1Eng < 0 || stu1Eng > 100) {
			System.out.printf("학생 %s의 영어 점수 %d은(는) 0과 100 사이의 정수가 아닙니다.", stu1, stu1Eng);
		} else if(stu2Kor < 0 || stu2Kor > 100) {
			System.out.printf("학생 %s의 국어 점수 %d은(는) 0과 100 사이의 정수가 아닙니다.", stu2, stu2Kor);
		} else if(stu2Math < 0 || stu2Math > 100) {
			System.out.printf("학생 %s의 수학 점수 %d은(는) 0과 100 사이의 정수가 아닙니다.", stu2, stu2Math);
		} else if(stu2Eng < 0 || stu2Eng > 100) {
			System.out.printf("학생 %s의 영어 점수 %d은(는) 0과 100 사이의 정수가 아닙니다.", stu2, stu2Eng);
		}
		

		// 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		// 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		
		stu1Sum = stu1Kor + stu1Eng + stu1Math;
		stu2Sum = stu2Kor + stu2Eng + stu2Math;
		
		stu1Aver = stu1Sum / 3;
		stu2Aver = stu2Sum / 3;
		
		if (stu1Aver >= 90) {
			stu1Grade = 'A';
		} else if (stu1Aver >= 80) {
			stu1Grade = 'B';
		} else if (stu1Aver >= 70) {
			stu1Grade = 'C';
		} else if (stu1Aver >= 60) {
			stu1Grade = 'D';
		} else if (stu1Aver < 60) {
			stu1Grade = 'F';
		}
		
		if (stu2Aver >= 90) {
			stu2Grade = 'A';
		} else if (stu2Aver >= 80) {
			stu2Grade = 'B';
		} else if (stu2Aver >= 70) {
			stu2Grade = 'C';
		} else if (stu2Aver >= 60) {
			stu2Grade = 'D';
		} else if (stu2Aver < 60) {
			stu2Grade = 'F';
		}
		
		
		if (stu1Grade > stu2Grade) {
			stu1Rank = 1;
			stu2Rank = 2;
		} else {
			stu1Rank = 2;
			stu2Rank = 1;
		}
		
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 2째자리수에서 반올림하세요(%f)
 		- 석차는 구하지마세요
		-------------------학생 성적출력------------------- .
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		----------------------------------------------
		*/
		
		stu1Aver = stu1Aver *100;
		int stu1AverInt = (int)stu1Aver;
		stu1AverInt = stu1AverInt+5;
		stu1Aver = (double) stu1AverInt / 10;
		stu1AverInt = (int) stu1Aver;
		stu1Aver = (double) stu1AverInt /10;
		
		stu2Aver = stu2Aver *100;
		int stu2AverInt = (int)stu2Aver;
		stu2AverInt = stu2AverInt+5;
		stu2Aver = (double) stu2AverInt / 10;
		stu2AverInt = (int) stu2Aver;
		stu2Aver = (double) stu2AverInt /10;
		
		String num, name, kor, eng, math, sum, aver, grade, rank;
		num = "학번"; name = "이름" ; kor = "국어" ; eng = "영어" ; math = "수학" ; sum = "총점" ; aver = "평균" ; grade = "평점" ; rank = "석차";
		
		System.out.println("-------------------학생 성적 출력-------------------");
		System.out.printf("%3s %s %3s %3s %3s %3s %3s %2s %2s \n",num,name,kor,eng,math,sum,aver,grade,rank);
		System.out.println("----------------------------------------------");
		System.out.printf("%3d %s %3d %3d %3d %5.1f %5.1f %2c %2d \n",stu1Num,stu1,stu1Kor,stu1Eng,stu1Math,stu1Sum,stu1Aver,stu1Grade,stu1Rank);
		System.out.printf("%3d %s %3d %3d %3d %5.1f %5.1f %2c %2d",stu2Num,stu2,stu2Kor,stu2Eng,stu2Math,stu2Sum,stu2Aver,stu2Grade,stu2Rank);
		
		
	}

}
