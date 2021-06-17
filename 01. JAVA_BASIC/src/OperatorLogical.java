  
/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형변수(or 리터럴) 이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false
*/
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		
		boolean result;
		
		/*
		 * 논리합(logical or) ||
		 * 
		 *   --> false||false 인경우에만 false를 반환
		 */
		result = b3 || b4;
		System.out.println("false || false -->"+result);
		/*
		 * 논리곱(logical and) &&
		 *   --> true || true 인경우에만 true를 반환
		 */
		result = b1 && b2;
		System.out.println("true && true -->"+result);
		
		System.out.println("--------------------------------");
		int kor=78;
		int math=34;
		System.out.println("--------A대학 국어,영어중에서 1과목만 90점이상합격-------");
		boolean isPass1 =  (kor>=90) || (math>=90) ;
		System.out.println("A 대학합격여부(||):"+isPass1);
		System.out.println("--------B대학 국어,영어모두 90점이상합격-------");
		boolean isPass2 =  (kor>=90) && (math>=90);
		System.out.println("B 대학합격여부(&&):"+isPass2);
		System.out.println();
		System.out.println("--------점수의 유효성체크(0~100)---------");
		int eng = -78;
		boolean isValid = eng>=0 && eng<=100;
		System.out.println("유효한점수여부:"+isValid);
		System.out.println("---------------배수판별------------------");
		int number=12;
		
		boolean bb1 = number%3 == 0;
		boolean bb2 = number%4 == 0;
		boolean bb3 = bb1 && bb2;
		
		System.out.println("3의배수여부:"+bb1);
		System.out.println("4의배수여부:"+bb2);
		System.out.println("3과4의공배수여부:"+bb3);
		
		
		
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		
		/*
		 * 연산 시의 형변환
		 * - 연산 항들 중에 가장 큰 타입으로, 모든 항이 형변환된다. (promotion)
		 */
		
		int ii = 100;
		char cc = 'A';
		long ll = 45L;
		double dd = 45.26;
		

	}

}