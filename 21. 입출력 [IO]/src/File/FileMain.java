package File;

import java.io.File;

public class FileMain {

	public static void main(String[] args) throws Exception {
		// 1. 현재 경로path, 기준 경로
		// 			eclipse --> K :\ Java \ Eclipse_WorkSpace \ 21. 입출력 [IO]
		// 2. 상대 경로 relative path
		// 			현재 경로를 기준으로 "relative하게~" 경로를 기술한다..
		// 3. 절대 경로 absolute path
		// 			C, D 드라이브를 기준으로 경로를 기술한다
		// 			드라이브명이 없으면 다 상대 경로가 된다. 인터넷은 http://
		
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
		
		File dir1 = new File ("sample");
		File dir2 = new File ("sample/subsample1");
		File dir3 = new File ("sample", "subsample1"); // dir2와 3은 같은 디렉토리를 지정하고 있다
		
		System.out.println("5. isDirectory, isFile");
		System.out.println(dir1.isDirectory());
		System.out.println(dir1.isFile());
		System.out.println(dir2.isDirectory());
		System.out.println(dir2.isFile());
		
		System.out.println("6. 디렉토리 안의 파일(+디렉토리)들의 목록: String[]");
		String[] fileNameList = dir1.list(); // 배열도 enhanced for를 사용할 수 있다...
		for (String fileName : fileNameList) {
			System.out.println("\t"+fileName);
		}
		
		System.out.println("7. 디렉토리 안의 파일(+디렉토리)들의 목록: File[]");
		File[] fileList = dir1.listFiles(); // 파일의 배열로 반환된다 --> 디렉토리인지 아닌지도 알 수 있다?
		for (File file : fileList) {
			if (file.isDirectory()) { // 파일 아니면 디렉토리!
				System.out.println("\t D: "+file.getName());
				File[] subFileList = file.listFiles(); // 디렉토리 안 디렉토리를 탐구하는...
				for (File subFile : subFileList) {
					System.out.println("\t\t DD: "+subFile.getName());
				}
			} else if (file.isFile()) {
				System.out.println("\t F: "+file.getName());
			}
		}
		
		System.out.println("8. root Directory 파일 목록");
		File[] rootFileList = File.listRoots();
		for (File rootFile : rootFileList) {
			System.out.println(rootFile.getPath());
		}
		System.out.println("	C:\\ 파일 목록");
		File[] cDriveFileList = rootFileList[0].listFiles();
		for (File cDriveFile : cDriveFileList) {
			System.out.println(cDriveFile.getName());
		}
		
		System.out.println("9. directory 생성");
		File newDir1 = new File("newDir1");
		File newDir2 = new File("newDir2"); // 정보만 가지고 있는 객체를 만들었다~
		File newDir3 = new File("sample", "subsample3");
		System.out.println("newDir1의 존재 여부: "+newDir1.exists()); // false!
		System.out.println("newDir1의 생성: "+newDir1.mkdir()); // make directory!
		System.out.println("newDir2의 생성: "+newDir2.mkdir());
		System.out.println("newDir3의 생성: "+newDir3.mkdir());
		// System.out.println("newDir3의 생성: "+newDir3.mkdir()); --> 중복 생성 불가능하다~ false로 출력됨
		
		System.out.println("10. directory 이름 변경");
		newDir2.renameTo(new File("renameDir2")); // 파일 형식의 객체로 받아줘야 한다
		
		System.out.println("11. directory 삭제");
		System.out.println("newDir3의 삭제: "+newDir3.delete());
		
		System.out.println(">> File 생성, 삭제, 이름 변경!");
		File newFile1 = new File("newDir1", "newFile1.txt");
		File newFile2 = new File("newDir2", "newFile2.txt");
		
		System.out.println("newFile1의 생성: "+newFile1.createNewFile());
		System.out.println("newFile2의 생성: "+newFile2.createNewFile());
		// public abstract boolean createFileExclusively (String pathname) throws Exception
		
		System.out.println("newFile2의 이름 변경: "+newFile2.renameTo(new File("newDir1","renameNewFile2.txt")));
		// System.out.println("newFile1 삭제: "+newFile1.deleteOnExit()); // 존재하면 지우고 아니면 말고?
		System.out.println("newFile1 삭제: "+newFile1.delete());
		
		
	} // main end

}
