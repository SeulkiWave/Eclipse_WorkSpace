package com.itwill05.service.student;

// Student 객체 전체에 관련된 업무를 실행할 클래스
// 학생 배열 객체를 사용하ㅣ나 ..

public class StudentService {
	private Student[] students={
			new Student(1,"KIM",89,93,94),
			new Student(2,"HIM",88,77,98),
			new Student(3,"AIM",65,87,99),
			new Student(4,"KIM",75,97,60),
			new Student(5,"XIM",85,98,90),
			new Student(6,"TIM",95,88,77),
			new Student(7,"KIM",99,93,95),
			new Student(8,"LIM",83,80,99),
			new Student(9,"QIM",73,90,80),
			
	};
	/*
	 *  0.전체학생출력
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		Student[] tempStu = new Student[students.length+1]; // 큰 배열 객체 생성..
		for (int i = 0; i < students.length; i++) { // 기존 배열 객체 데이터 이동..
			tempStu[i] = students[i];
		}
		tempStu[tempStu.length] = student; // 마지막 빈 칸에 새 객체 입력...
		this.students = tempStu; // 원래의 배열 객체에 새로 만든 배열 객체의 주소값을 대입...........
	}
	
	/*
	 * 1. 전체 학생 총점, 평균, 평점 계산
	 */
	public void calculate() {
		for (int i = 0; i < students.length; i++) {
			students[i].calSum(); // 학생의 총점
			students[i].calAver(); // 학생의 평균...
			students[i].calGrade(); // 평점...
		}
	}
	
	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	public void setRank() {
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(1);
			int j = i;
			for (j = 0; j < students.length; j++) {
				if (students[i].getSum() > students[j].getSum()) {
					students[i].setRank(students[i].getRank()+1) ; // 기존 값에서 +1 !
				}
			}
		}
	}
	
	/*
	 * 3. 전체 학생 반환 . . . . ? . . . .........................
	 *   - 전체 학생을 다 빼내는 건가...............? return여러개 안됨... 
	 *   - student[]를 하나하나 Student 새 객체로 옮겨서 그걸 하나로묶어서 꺼내야하나???
	 */
	public Student[] getStu() {
		return students; // <-- 이렇게 순순히 풀려줄 문제가 아닐텐데
	}
	
	/*
	 * 4. 번호 3번 학생 한 명 반환
	 */
	public Student findByNo(int no) {
		Student findStudent = null; // 반환할 학생 객체 하나 만들기
		for (int i = 0; i < students.length; i++) { // 전체 학생 객체 배열 중에서
			if(students[i].getNo()==no) { // 입력한 번호와 동일한 번호를 가진 학생 찾기
				findStudent = students[i]; // 그 번호를 가진 학생을 찾아서 대입시킨 후 아래 return에서 반환시킨다
				break; // 1명만 찾으면 되니까~
			}
		}
		return findStudent;
	}
	/*
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findByGrade (char grade) { // 학생들이니까 여러명!
		Student[] findStu = null;
		int count = 0;
		for (int i = 0, index = 0; i < students.length; i++) {
			if (students[i].getGrade() == grade) {
				count++;
			}
		}
		findStu = new Student[count];
		for (int i = 0, index = 0; i < students.length; i++) {
			if (students[i].getGrade() == grade) {
				findStu[index] = students[i];
				index++;
			}
		}
		
		return findStu;
	}
	
	/*
	 * 6. 학생석차로 오름차순정렬
	 */
	public void arrayStu() {
		Student tempStu = null;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].getSum() > students[j].getSum()) {
					tempStu = students[i+1];
					students[i+1] = students[i];
					students[i] = tempStu;
				}
			}
		}
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
}