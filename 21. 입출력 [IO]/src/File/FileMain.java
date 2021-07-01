package File;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// 1. 현재 경로path, 기준 경로
		// 			eclipse --> K :\ Java \ Eclipse_WorkSpace \ 21. 입출력 [IO]
		// 2. 상대 경로 relative path
		// 			현재 경로를 기준으로 "relative하게~" 경로를 기술한다..
		// 3. 절대 경로 absolute path
		// 			C, D 드라이브를 기준으로 경로를 기술한다
		
		File file1 = new File("00주석.txt");
		File file2 = new File("sample/subsample2/AcademyStaff.java");
		File file3 = new File(".."); // 파일을? 담는? 객체를 생성할 떈 파일이 있는지 없는지 신경도 안 쓴다..
		// 파일의 정보를 사용할 때 그제서야 검증하는..
		// \뒤에는 쓸 수 있는 게 정해져 있음. 약속된 기호... 컨트롤 문자를 기술하기 위한 문자. 출력을 위해 \\라고 기술
		
		System.out.println("1. File Path");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		
		System.out.println("2. File Absolute Path");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		
		System.out.println("3. File name");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		
		System.out.println("4. File Parent: Directory"); // 디렉토리도 실제로는 파일이다....
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		
		
		
	}

}
