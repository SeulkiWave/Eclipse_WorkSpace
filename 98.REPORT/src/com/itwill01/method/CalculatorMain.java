package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cc1 = new Calculator();
		
		// 메소드를 새 변수에 대입해서 출력하자~
		int result = cc1.add(1, 54);
		System.out.println(result);
		
		
		// 메소드를 사용한 직접 출력도 가능하다~
		System.out.println(cc1.sub(965,546));
		
		System.out.println(cc1.mul(8,65));
		
		System.out.println(cc1.div(8469,64));
		
	}

}
