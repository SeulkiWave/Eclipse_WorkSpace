/*
 배열 (타입)  
	- 같은 자료형을 가진 기억장소 여러개의 모음 
	- 배열변수의 선언형식 : << 데이터타입[] 변수이름; >>
		이때 데이터타입[]을 배열 데이터 타입이라고 언급하기도 한다~
	- 사용
		1. 배열 객체의 생성
		2. 배열 객체 멤버의 초기화 : 멤버 변수니까! 멤버 변수는 자동 초기화된다~)
      - 특징
		1. 모든 배열형의 변수는 참조변수이다. !!!배열은 객체다!!!
			// 주소 값을 가진다, 객체 생성을 해야한다? ... 등의 의미를 함께 내포~
		2. 같은 타입만 정의 가능하다.
		3. 길이가 고정되어있다.
 */

public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		
		int intType = 0;
		intType = 99;
		
		int[] intArray; // 모든 배열 타입의 변수는 참조변수!!!
		intArray = null; // 참조타입~
		intArray = new int[5]; // 멤버의 개수!
				// new : 객체 생성 연산자~
				// intArray 에는 배열의 주소값이 대입됨???
		intArray[0] = 11;
		intArray[1] = 22;
		intArray[2] = 33;
		intArray[3] = 44;
		intArray[4] = 55;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("---------- for loop ----------");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("========== 배열의 길이: "+intArray.length);
		System.out.println("========== 기본형 1차원 ==========");
		int[] korArray = new int[10];
		korArray[0] = 80;
		korArray[1] = 56;
		korArray[2] = 78;
		korArray[3] = 99;
		korArray[4] = 34;
		korArray[5] = 78;
		korArray[6] = 93;
		korArray[7] = 13;
		korArray[8] = 91;
		korArray[9] = 77;
		int korTot = 0;
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i];
		}
		System.out.println("우리 반 국어 총점: "+korTot);
		System.out.println("우리 반 국어 평균: "+(korTot/korArray.length));
		
		System.out.println("========== char[] 배열 연습~ ==========");
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'E';
		ca[2] = 'L';
		ca[3] = 'L';
		ca[4] = 'O';
		ca[5] = '!';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		
		System.out.println("========== String[] ==========");
		String[] strArray = new String[5];
		strArray[0] = "Kim";
		strArray[1] = "Lee";
		strArray[2] = "Song";
		strArray[3] = "Park";
		strArray[4] = "Namgung";
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println();
		
		
		
		
		
		
		
	} // main end

}
