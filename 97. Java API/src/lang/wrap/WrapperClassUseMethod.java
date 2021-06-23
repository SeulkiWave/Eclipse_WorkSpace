package lang.wrap;

public class WrapperClassUseMethod {

	public static void main(String[] args) {
		// int --> String
		int y = 123456789;
		String yStr1 = Integer.toString(y);
		System.out.println(yStr1);
		
		String yStr2 = y+""; // + 연산자는 앞을 문자열로 바꾼 후 대입 . . . ? 신기하네
		System.out.println(yStr2);
		
		String yStr3 = Integer.toBinaryString(y); // 2진법의 String 형태로 반환됨
		System.out.println(yStr3);
		
		String yStr4 = Integer.toHexString(y);
		System.out.println(yStr4);
		
		// String --> int, double, boolean
		int i1 = Integer.parseInt("56153212");
		System.out.println(i1);
		
		double d1 = Double.parseDouble("1.123456");
		System.out.println(d1);
		
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		
		
		// 연산자 오버로딩
		// - 항이 문자열인 경우 concat!
		int num = 123456;
		String numStr1 = num+"";
		String numStr2 = 1 + 2 + 3 + 4 + 5 + "6"; // 앞에서부터~ "" 앞은 연산을 하지만 6은 그냥 통째로 붙임! String
		System.out.println(num);
		System.out.println(numStr1);
		System.out.println(numStr2);
		
		// Char~~~
		Character wc1 = new Character('김');
		Character wc2 = '김'; // 자동 boxing
		char c1 = wc1.charValue();
		char c2 = wc2;
		
		// String --> char, char[]
		char firstChar = "김슬기".charAt(0);
		System.out.println(firstChar);
		char[] ca = "수요일, WrapperClass".toCharArray(); // Char[] 로 반환된대...
		System.out.println(ca[0]+""+ca[8]);
		
		// (char), char[] --> String
		char c3 = '속'; 
		String str3 = String.valueOf(c3);
		String str4 = c3 + "";
		System.out.println(str3 +","+str4);
		
		// ca4 어디간겨
		char[] ca5 = {'김', '슬', '기'};
		String str5 = String.valueOf(ca5);
		System.out.println("char[] --> String: "+str5);
		String str6 = new String(ca5);
		System.out.println("char[] --> String: "+str6);
		
		String strs = "Hello Java! Today is Wednesday~ 환자는 약간의 빈혈 증상을 가지고 있습니다.";
		for (int i = 0; i < strs.length(); i++) {
			char tempChar = strs.charAt(i);
			int  type = Character.getType(tempChar);
			// System.out.println(tempChar+"Type: "+type);
			if (type == Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER: "+tempChar);
			}
			if (type == Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER: "+tempChar);
			}
			if (type == Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER: "+ tempChar);
			}
			if (type == Character.SPACE_SEPARATOR) {
				System.out.println("SPACE_SEPARATOR: "+tempChar);
			}
			/* if (Character.isSpaceChar(tempChar)) {
				System.out.println("SPACE_SEPARATOR: "+tempChar);				
			} */
			if (Character.isAlphabetic(tempChar)) {
				System.out.println("Character.isAlphabetic: "+tempChar);
			}
			
			
		}
		
		
		
	}

}
