import java.util.Scanner;

public class ConsoleInput {
  
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		
		
		System.out.print("국어 점수를 입력하세요: ");
		int kor = console.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		int eng = console.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		int math = console.nextInt();
		
		System.out.print("------------ 입력한 점수 ------------");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		
		System.out.println("점수를 입력하세요 (34 67 89)"); // 한번에 하고.. 아래로 뜨고.. 어렵다
		kor = console.nextInt();
		eng = console.nextInt();
		math = console.nextInt();
		
		System.out.println("------------ 입력한 점수 ------------");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		
		
		System.out.println("이름을 입력하세요");
		String name = console.next();
		System.out.println("입력한 이름: "+name);
		System.out.println("키를 입력하세요: ");
		double height = console.nextDouble();
		System.out.println("입력한 키: "+height);
	}

}
