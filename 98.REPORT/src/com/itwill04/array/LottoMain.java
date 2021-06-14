package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		
		System.out.println("로또 번호 6개 생성, 중복 번호 허용 안 됨");
		
		int[] num = new int[6];
		
		for (int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1);
			
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
		
		
	}

}
