
public class WhileMultiTable {

	public static void main(String[] args) {
		
		int i = 2;
		
		
		while (i<10) {
			int j = 1; // 변수의 초기화 위치에 따라서 결과값이 달라진다..
			
			while (j<10) {
				int multi = i*j;
				System.out.printf("%2d*%2d=%3d ",i, j, multi);
				j++;
				
				if (j >= 10) {
					System.out.println();
				}
			}
			
			i++;
			
		}
		 
			
	}

}




	