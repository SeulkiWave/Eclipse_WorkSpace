
public class VariableTypes {

	public static void main(String[] args) {
		/* 1byte = 8bit (ex: 01101011 - 2진수) / 비트가 커질수록 수용 가능한 수가 많아지거나 커진다.
		 * 표현한 수의 맨 앞자리가 0인 경우 양수를 의미함. sign용 수.
		 * 맨 오른쪽부터 2^0, 2^1, 2^2 ... 로 자리수가 상승한다.
		 * [ ex: 1011 (2) = (2^3)*1+(2^2)*0+(2^1)*1+(2^0)*1 (10) ]
		 
		 * 논리형 (1 byte)
		  - 논리형 변수 (variable)
		  - 논리형 리터럴 (값, 데이터, literal) : true / false
		 */
		boolean bool1, bool2, bool3;
		bool1 = true;
		bool2 = false;
		bool3 = true;
		//ctrl + alt + down(방향키) : 한 줄 복사
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		  
		/*
		 * 1개 문자형 (2 byte)
		  - 문자형 변수
		  - 문자형 리터럴 (값, 데이터): 'a', 'C', '1' ...  
		 */
		char munja1, munja2, munja3, munja4, munja5;
		munja1 = 'A';
		munja2 = 'B';
		munja3 = '김';
		munja4 = '슬';
		munja5 = '1';
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		
		/*
		 * 숫자형
		 * 각 자료형에 맞는 리터럴(값/데이터)를 가진다. ex: i1 = 90; //i1이 90이라는 정수형 리터럴을 가진다.
		 (1) 정수형: byte, short, long, int
		 	- int: 4 byte (32 bit)
		 (2) 실수형: float, double (소수점 아래 수를 가질 수 있음)
		 	- double: 8 byte, 가장 큰 수를 저장할 수 있다. long에 비해 double이 정밀도가 떨어지지만?(수를 저장하는 방법의 차이) 더 큰 수를 저장할 수 있다.
		 */
		int i1, i2, i3, i4;
		double d1, d2, d3;
		i1 = 90;
		i2 = 98;
		i3 = 48;
		i4 = 2147483647; // 정수형 변수의 최대값
		d1 = 3.141592;
		d2 = 123456789123456789.0; //E17 = 앞 수 *10^17
		d3 = 12345678912345678E-16;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		//String = 문자열 (문자 여러개!)
		String str1 = "오늘은";
		String str2 = "금요일~";
		String str3 = "집에 가서";
		String str4 = "선풍기";
		String str5 = "조립해야 해~";
		System.out.println("- - - S T R I N G - - -");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str1+" "+str2+" "+str3+" "+str4+" "+str5);
		System.out.println(str1+" 가짜 월요일 무서운 연산자");
		
		String name="김슬기";
		int age = 24;
		String address= "구석진 통영";
		char gender = 'F';
		char grade = 'A';
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
		System.out.println("성적: "+grade);
	}

}
