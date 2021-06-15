package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {

		Student[] student = { new Student(1, "AAA", 41, 16, 35), new Student(2, "BBB", 98, 78, 84),
				new Student(3, "CCC", 37, 91, 19), new Student(4, "DDD", 48, 94, 75), new Student(5, "EEE", 98, 84, 87),
				new Student(6, "FFF", 78, 98, 99), new Student(7, "GGG", 75, 78, 98), new Student(8, "HHH", 78, 78, 68),
				new Student(9, "III", 48, 58, 98), };

		System.out.println("1. 전체 학생의 총점, 평균, 등급 계산 =========================");
		for (int i = 0; i < student.length; i++) {
			student[i].calSum();
			student[i].calAver();
			student[i].calGrade();
		}

		System.out.println("2. 전체 학생의 총점으로 석차 계산 =============================");

		for (int i = 0; i < student.length; i++) {
			student[i].setRank(1);
			int j = i;
			for (j = 0; j < student.length - 1; j++) {
				if (student[i].getSum() < student[j].getSum()) {
					student[i].setSum(student[i].getRank() + 1); // 이게 되네...
				} // if end
			} // for j end
		} // for end

		System.out.println("3. 전체 학생 출력 ===================================");

		Student.printHead();

		for (int i = 0; i < student.length; i++) {
			student[i].print(); // 아니 이거 도대체 exception in thread main 왜 뜨냐고요
		}

		System.out.println("4. 번호가 3번인 학생 1명의 정보를 출력 ====================");

		for (int i = 0; i < student.length; i++) {
			if (student[i].getNum() == 3) {
				student[i].print(); // 위에꺼 없애도 여기서 또 뜸!
				break;
			}
		}

		System.out.println("5. 학점이 A인 학생들을 모두 출력 =========================");

		for (int i = 0; i < student.length; i++) {
			if (student[i].getGrade() == 'A') {
				student[i].print();
			}
		}

		System.out.println("6. 학생총점으로 내림(오름)차순정렬");

		for (int i = 0; i<student.length; i++) {
			
			for (int j=0; j<student.length-1; j++) {
				if (student[j].getSum() < student[j+1].getSum()) {
					Student stuTemp = student[j];
					student[j] = student[j+1];
					student[j+1] = stuTemp;
				}
			}
			
		}

		System.out.println("6. 학생학점순으로 오름차순정렬");
		
		for (int i = 0; i<student.length; i++) {
			
			for (int j=0; j < student.length-1; j++) {
				if (student[j].getGrade() > student[j+1].getGrade()) {
					Student stuTemp = student[j];
					student[j] = student[j+1];
					student[j+1] = stuTemp;
				}
			}
			
		}

	} // main end

} // class end