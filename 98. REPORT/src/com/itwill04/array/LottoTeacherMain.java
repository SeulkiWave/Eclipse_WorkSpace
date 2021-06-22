package com.itwill04.array;

public class LottoTeacherMain {

	public static void main(String[] args) {
		
		int[] lottonum = {0, 0, 0, 0, 0, 0};
		
		for (int i=0; i<lottonum.length;i++) {
			lottonum[i] = (int)(Math.random()*45)+1;
			for (int j=0; j<lottonum.length; j++) {
				if (lottonum[i] == lottonum[j]) {
					i--; // 중복되니까 다시 뽑아!!!!!
					break; // 값 줄인 후 탈출 시켜서 다시 뽑게 시킴~
				}
			}
		}
		
		for (int i=0; i<lottonum.length; i++) {
			System.out.println(lottonum[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Lotto 객체 ====================");
		Lotto lotto1 = new Lotto();
		lotto1.print();
		
		System.out.println("Lotto 객체 ====================");
		Lotto[] lottoArray = new Lotto[5];
		lottoArray[0] = new Lotto();
		lottoArray[1] = new Lotto();
		lottoArray[2] = new Lotto();
		lottoArray[3] = new Lotto();
		lottoArray[4] = new Lotto();
		
		for (int i=0; i<lottoArray.length; i++) {
			lottoArray[i].print();
		}
		
	}

}
