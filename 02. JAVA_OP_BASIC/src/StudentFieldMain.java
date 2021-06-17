import java.util.Scanner;

public class StudentFieldMain {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String num, name, kor, eng,math, sum, aver, grade, rank;
		num = "번호"; name = "이름"; kor = "국어"; math = "수학"; eng = "영어";
		sum = "총점"; aver = "평균"; grade = "학점"; rank = "석차";
		
		/*
		 *학생객체 2명 생성
		 */
		
		Student stu1, stu2;
		stu1 = new Student();
		stu2 = new Student();
		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		stu1.num = 1; stu2.num = 2;
		stu1.name = "Kim"; stu2.name = "Lee";
		stu1.kor = 98; stu2.kor = 88;
		stu1.math = 72; stu2.math = 96;
		stu1.eng = 88; stu2.eng = 72;
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		stu1.sum = stu1.kor+stu1.math+stu1.eng;
		stu2.sum = stu2.kor+stu2.math+stu2.eng;
		
		stu1.aver = stu1.sum / 3;
		stu2.aver = stu2.sum / 3;
		
		if (stu1.aver > 90) {
			stu1.grade = 'A';
		} else if (stu1.aver > 80) {
			stu1.grade = 'B';
		} else if (stu1.aver > 70) {
			stu1.grade = 'C';
		} else if (stu1.aver > 60) {
			stu1.grade = 'D';
		} else {
			stu1.grade = 'F';
		}
		
		if (stu2.aver > 90) {
			stu2.grade = 'A';
		} else if (stu2.aver > 80) {
			stu2.grade = 'B';
		} else if (stu2.aver > 70) {
			stu2.grade = 'C';
		} else if (stu2.aver > 60) {
			stu2.grade = 'D';
		} else {
			stu2.grade = 'F';
		}
		
		
		/*
		 * 학생데이타출력2명
		 */
		
		System.out.println("==================================================");
		System.out.printf("%3s %s %3s %3s %3s  %-6s %-5s %2s %3s\n", num, name, kor, math, eng, sum, aver, grade, rank);
		System.out.println("==================================================");
		System.out.println();
		System.out.printf("%2d %4s %3d %3d %3d %5.2f %4.2f %3c \n", stu1.num, stu1.name, stu1.kor, stu1.math, stu1.eng, stu1.sum, stu1.aver, stu1.grade);
		System.out.printf("%2d %4s %3d %3d %3d %5.2f %4.2f %3c \n", stu2.num, stu2.name, stu2.kor, stu2.math, stu2.eng, stu2.sum, stu2.aver, stu2.grade);
		System.out.println();
		System.out.println("==================================================");
		
		
	}

}
