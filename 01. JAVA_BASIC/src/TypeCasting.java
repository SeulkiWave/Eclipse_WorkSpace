
public class TypeCasting {

	public static void main(String[] args) {
		
		// 자 동 형 변 환 //
		
		int i1 = 56;
		long l1 = i1;
		System.out.println(l1);
		
		double d1 = l1;
		System.out.println(d1);
		
		
		char c1 = '김';
		int i2 = c1; // 숫자로 저장된 char형 변수가 int형 변수로 확장됨 (프로모션?)
		System.out.println(i2);
		System.out.println(c1);
		
		
		char c2 = 'A';
		int i2_2 = c2;
		
		double aver2 = 56.789;
		System.out.println(aver2);
		int inAver2 = (int)aver2;
		System.out.println(inAver2);
		// 낮은 바이트 수의 자료형으로 강제 형변환을 시킴으로써 소수점 아래 수를 버릴 수 있다.
		
	}

}
