
public class OperatorUnary {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		int ar = -a;
		int br = +b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean isPlay = false;
		System.out.println(isPlay);
		isPlay = !isPlay;
		System.out.println(isPlay);
		
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		
		int kor = 78;
		boolean isValid = !(kor < 0 || kor > 100);
		System.out.println(kor+" --> "+isValid);
		
		/*
		 * << 증가 감소 연산자 >>
		 * ++ , --
		 * a++, ++a, --a, --a
		 * 변수, 리터럴, 상수만 가능하며 수식은 불가능하다.
		 */
		
		int i = 5;
		int j = 5;
		
		i++; // i = i+1;와 동일하다~
		j--; // j = j-1;
		
		System.out.println(i);
		System.out.println(j);
		
		++i;
		--j;
		System.out.println(i);
		System.out.println(j);
		
		int ir;
		ir = i++; // i에 5가 대입된 후 ir이 6으로 대입된다.
		int jr;
		jr = j--; // 대입연산자가 예외적으로 먼저 처리된 후 증감연산자가 적용됨!
		System.out.println(ir);
		System.out.println(jr);
		
		++i;
		--j;
		ir = ++i;
		jr = --j;
		System.out.println(ir); // 이 경우는 동일하게 대입 연산자가 매일 마지막에 실행된다.
		System.out.println(jr); // ir = 6, jr = 4;
		
		
	}

}
