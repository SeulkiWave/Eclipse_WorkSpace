package lang;

public class MathMain {

	public static void main(String[] args) {
		
		// Math 클래스
		// - 수학 함수를 가지고 있는 클래스
		// - 모든 메소드는 static이다.
		// - 객체 생성이 불가능하다. (생성자의 접근 제한자가 private)
		
		double r = Math.abs(-6456.6310);
		System.out.println(r);
		System.out.println(Math.max(25, 681));
		System.out.println(Math.min(25, 681));
		System.out.println(Math.round(33.5468));
		System.out.println((Math.round(33.5468*10))/10.0);
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sin(3.14/2));
		
		System.out.println("1에서 10 사이의 정수를 랜덤으로 생성한다");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		
		System.out.println("1부터 45 사이의 정수를 랜덤하게 생성한다");
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		
	}

}
