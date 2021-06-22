package com.itwill04.array;

public class LottoMain {
	
	public static void main(String[] args) {
		
		System.out.println("로또 번호 6개 생성, 중복 번호 허용 안 됨");
		
		int[] num = new int[6];

		// for (int i = 0; i<num.length; i++) { num[i] = (int)(Math.random()*45+1); } // 랜덤(중복허용) 숫자 6개 생성..
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) { // 굳이 안 만들어진 미래의 num[i] 값을 비교할 필요가 없는..
				// 현재 시점 이전에 만들어진 것끼리만 비교하면 처음엔 1개, 2개, ..., Sum-1개로 비교하게 될 것,,
				// j = i 같으면 당연히 같아서 <이어야하고.. (이걸 j=1로 초기화 후 <=로 바꿀 수 잇는지는 다시 생각해보기..)
				 if (i == j){ // 같은거 비교해봤자..
						continue;
					}
				if (num [i] == num [j]) {
					num[i] = (int) (Math.random()*45)+1;
					j--; // 현재 객체에 !!!비교되는!!! 인덱스를 하나 낮춰줘서
				} // if 문이 끝나고 for문이 끝날 때 같은 지점을 다시 반복검증하게 해보기..
				// 이것도 다른 방법이 있는지 고민해보기..
			}
			
			System.out.printf("%d \t", num[i]);
		}

	} // main end

} // class end
