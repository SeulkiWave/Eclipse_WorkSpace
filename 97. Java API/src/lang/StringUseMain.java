package lang;

public class StringUseMain {

	public static void main(String[] args) {
		
		String str1 = "Have a nice day!";
		String str2 = "목 - 추상 클래스";
		
		System.out.println(" Length; ==============================");
		
		int length1 = str1.length();
		int length2 = str2.length();
		System.out.println(length1);
		System.out.println(length2);
		
		int length3 = "피곤하다!".length();
		System.out.println(length3);
		
		System.out.println(" Null, \"\": ==============================");

		int length4 = "".length(); // empty String
		System.out.println(length4); // 0
		
		String id = null; // String id는 참조변수니까 자동으로 null로 초기화되는...
		// String id = ""; // 얘는 주소가 잇긴 한데 null은 진짜 주소가 없는... 머시기
		if (id == null || id.equals("")) {
			System.out.println("아이디를 입력ㅎ ㅐ");
		}
		
		System.out.println(" String.substring: ==============================");
		
		/*
		 * << Substring >>
		 * public String substring (int beginIndex)
		 * 인덱스가 0번부터 시작!!! 배열이니까!
		 * : "unhappy".substring(2) returns "happy"
		 * : "emptiness".substring(9) returns "" (an empty string)
		 * Returns a string that is a substring of this string.
		 * The substring begis with the character at the specified index and extends to the end of this string.
		 * beginIndex - the beginning index, "inclusive" 포함!
		 * 
		 * public String substring (int beginIndex, int endIndex)
		 * beginIndex - incluse
		 * endIndex - exclusive
		 * "hamburger".substring(4, 8) returns "urge" 
		 */
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7, 11));
		System.out.println("Have a nice day!!!".substring(7, 11).length());
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(3, 5));
		
		System.out.println(" String.charAt(index): ==============================");
		
		String userId="test#3F00FF";
		char firstChar = userId.charAt(0);
		System.out.println(firstChar);
		// 문자 1!! 숫자가 아님!
		System.out.println((int)firstChar);
		// 문자 1의 ASCII 코드 값~ (인코딩테이블에서 10진으로 번역된..)
		
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			System.out.println(tempChar +": "+(int)tempChar);
		}
		
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			if (tempChar >= 'a' && tempChar <= 'z') {
				System.out.println(tempChar +"--> 영문 소문자~");
			}
			if (tempChar >= 48 && tempChar <= 57) {
				System.out.println(tempChar +"--> 숫자~");				
			}
		}
		
		/*
		 * Q U I Z
		 * 아이디로 적합한지 판단하세요
		 *  - 아이디가 3~7자 사이여야 한다
		 *  - 영문, 숫자로만 이루어져 있어야 한다.
		 *  
		 *  - 첫 글자가 숫자여서는 안 된다!
		 */
		
		String[] idArray = {"guard", "7up", "test", "dkdf", "mt id", "%super%", "가나다", "aaaaaaaaa", "c"};
		
		for (int i = 0; i < idArray.length; i++) {
			
			for (int j=0; j < idArray[i].length(); j++){
				if (idArray[i].charAt(j) >= '0' && idArray[i].charAt(j)<= '9' || idArray[i].charAt(j)>= 'A' && idArray[i].charAt(j) <= 'Z' || idArray[i].charAt(j) >= 'a' && idArray[i].charAt(j) <= 'z'){
				
				} else {
					System.out.println("아이디는 영어와 숫자 조합으로만 이루어져야 합니다.");
					System.out.println(idArray[i]+"는 적합하지 않은 아이디 입니다.");
				}
			}
				
			if (idArray[i].length() < 3 || idArray[i].length()>7) {
				System.out.println("아이디는 3~7글자로 이루어진 문자열이어야 합니다.");
				System.out.println(idArray[i]+"는 적합하지 않은 아이디 입니다.");
			} else if (idArray[i].charAt(0) < 'A' || idArray[i].charAt(0) > 'z') {
				System.out.println("아이디의 첫 글자는 영문자여야 합니다.");
				System.out.println(idArray[i]+"는 적합하지 않은 아이디 입니다.");
			}
			
		}
		
		System.out.println(" String.split(index): ==============================");
		String cardNum = "5389-2000-5296-1675";
		String ssn = "123456-7891234";
		String nameList = "김슬기, 김슬긱, 김슬긴, 김슬긷, 김슬길";
		
		String[] cardNumArray = cardNum.split("-");
		String[] ssnArray = ssn.split("-");
		String[] nameArray = nameList.split(",");
		for (int i = 0; i < cardNumArray.length; i++) {
			System.out.println(i +" --> "+cardNumArray[i]);
		}
		for (int i = 0; i < ssnArray.length; i++) {
			System.out.println(i +" --> "+ssnArray[i]);
		}
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(i +" --> "+nameArray[i]);
		}
		
		System.out.println(" String.replace(): ==============================");
		String str3 = "우리는 자바를 공부합니다. 자바는 객체 지향 언어입니다.";
		String result3 = str3.replace('자', '다');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		System.out.println(str3.replaceFirst("자바", "파이썬"));
		
		System.out.println(" String.toUppercase / toLowercase: ==============================");
		System.out.println("jaVA".toUpperCase());
		System.out.println("jaVA".toLowerCase());
		
		System.out.println(" equals / equalsIgnoreCase: ==============================");
		System.out.println("yes".equals("Yes"));
		System.out.println("yes".equalsIgnoreCase("Yes"));
		
		System.out.println(" String.indexOf() : ==============================");
		String fileName = "backup.zip";
		int dotIndex = fileName.indexOf(".");
		System.out.println("DotIndex: "+dotIndex);
		String fileNameNoExt = fileName.substring(0, dotIndex); // 자르고
		String fileNameExt = fileName.substring(dotIndex+1); // +1 하는 거 신경써보기..
		System.out.println(fileNameNoExt+"ㅋㅋ"+fileNameExt);
		
		String copyFileName = fileNameNoExt+"-사본."+fileNameExt;
		System.out.println("CopyFileName: "+copyFileName);
		
		
		
		
		
	} // main end

} // class end
