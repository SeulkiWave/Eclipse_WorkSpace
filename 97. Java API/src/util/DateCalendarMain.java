package util;

import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) {
		
		/*
		 * java.util.Date : The class Date represents a specific instant in time, with millisecond precision. 
		 */
		Date now = new Date();
		String nowStr = now.toString();
		System.out.println(nowStr);
		
		String nowLocaleStr = now.toLocaleString();
		System.out.println(nowLocaleStr);
		
		System.out.println("< 시간 저장 형식 >");
		Long currTimeMills1 = now.getTime();
		// Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date..
		System.out.println(currTimeMills1);
		
		long currTimeMills2 = now.getTime();
		System.out.println(currTimeMills2);
		
		
		
		
		
		
	}

}
