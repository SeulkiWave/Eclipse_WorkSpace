package com.itwill04.array;

public class Lotto { // 로또 1회의 데이터를 가지는 클래스
	
	private int[] num;
	
	public Lotto() {
		num = new int[6];
		this.generateNum();
	}
	
	private void generateNum () {
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public void print() {
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	
}// class end
