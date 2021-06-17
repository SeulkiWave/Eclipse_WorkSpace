
public class ReferenceVariableMain {

	public static void main(String[] args) {
		
		System.out.println("---------- S W A P ----------");
		int score1 = 90;
		int score2 = 100;
		System.out.println("Score1: "+score1);
		System.out.println("Score2: "+score2);
		int scoreTemp = score1;
		score1 = score2;
		score1 = scoreTemp;
		System.out.println("Score1: "+score1);
		System.out.println("Score2: "+score2);

		Member m1 = new Member(1, "이효리");
		Member m2 = new Member(2, "이소라");
		m1.print();
		m2.print();
		Member mTemp = m1;
		m1 = m2;
		m2 = mTemp;
		m1.print();
		m2.print();
		
		Member member1 = new Member(1111, "김슬기1");
		Member member2 = member1;
		member1.print();
		member2.print();
		
		if (member1 == member2) {
			System.out.println("member1와 2의 주소값이 동일하다. 같은 객체를 가리킨다.");
		}
		//주소 비교
		Member memberOne = new Member(111, "일일일");
		Member memberTwo = new Member(222, "이이이");
		Member memberThree = memberOne;
		if (memberOne != memberTwo) {
			System.out.println(memberOne + "!=" + memberTwo);
		}
		if (memberOne == memberThree) {
			System.out.println(memberOne + "==" + memberThree);
		}
		
		System.out.println("---------- 주소 교환 ----------");
		Member mm1 = new Member(1000, "김슬기1");
		Member mm2 = new Member(2000, "김슬기2");
		mm1.print();
		mm2.print();
		Member mmTemp = mm1;
		mm1 = mm2;
		mm2 = mmTemp;
		System.out.println("주소 교환 후: ");
		mm1.print();
		mm2.print();
		
		
		System.out.println("---------- 변수 값 초기화 ----------");
		int tot = 0;
		double avg = 0.0;
		boolean isMarried = false;
		System.out.println("---------- 참조형 변수 값 초기화 ----------");
		Member m3 = null;
		/*
		null : 객체 주소 리터럴(값) // 실제 주소가 아닌 주소가 없다는 값... 자리 있어요~ 같은 느낌
			 - 객체 주소 값의 초기화를 하기 위해 사용한다~
			 - null 주소 사용 시 Null Pointer Exception 발생..
			 
		 */		
		if (m3 == null) {
			m3 = new Member(3000, "삼삼삼");
		}
		m3.print();
		
	}

}
