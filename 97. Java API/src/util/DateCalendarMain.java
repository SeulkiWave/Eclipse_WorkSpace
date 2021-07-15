package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception {
		
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
		
		System.out.println("* SimpleDateFormat : Date --> String");
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		sdf1.applyPattern("yyyy년 MM월 dd일"); // formatter~
		String formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS");
		String formatStr2 = sdf1.format(now);
		System.out.println(formatStr2);
		
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(now);
		System.out.println(yearStr);
		
		System.out.println("* SimpleDateFormat : String --> Date");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirth = sdf2.parse("1998-02-12"); // 예외 처리를 해줍시당~
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date wipyBirth = sdf2.parse("1999/12/08 12:34:56");
		
		
		// java.util.Calendar (Abstract)
		Calendar cal1 = Calendar.getInstance();
			// Abstract 클래스라서 오버로드 해야하는 귀찮음을 굳이~ 이겨내지 말구 getInstance 를 하자~
		System.out.println(cal1.getCalendarType());
		cal1.getTimeInMillis();
		long currTimeMill3 = cal1.getTimeInMillis();
		System.out.println(currTimeMill3);
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH) +1; // 그레고리력은 0부터 시작..ㅡㅡ
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int hour = cal1.get(Calendar.HOUR);
		int minute = cal1.get(Calendar.MINUTE);
		int second = cal1.get(Calendar.SECOND);
		int msec = cal1.get(Calendar.MILLISECOND);
		
		System.out.println(year+"/"+month+"/"+day+"\t"+hour+":"+minute+":"+second+"."+msec);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.clear();
		cal2.set(2021, Calendar.DECEMBER, 8, 12, 34, 56);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.clear();
		cal3.set(Calendar.YEAR, 2021);
		cal3.set(Calendar.MONTH, Calendar.NOVEMBER);
		System.out.println(cal3);
		Calendar cal4 = Calendar.getInstance();
		cal4.setTimeInMillis(System.currentTimeMillis());
		System.out.println(cal4);
		
		System.out.println("* Date <-> Calendar");
		Date date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse("1999/12/08 12:34");
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeInMillis(date1.getTime());
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.clear();
		calendar2.set(2019, Calendar.JANUARY, 3);
		Date date2 = new Date(calendar2.getTimeInMillis());
		
		// C A L E N D A R   객체   메소드!
		Calendar calendar3 = Calendar.getInstance();
		calendar3.clear();
		calendar3.set(2019, Calendar.MAY, 20);
		
		Calendar calendar4 = Calendar.getInstance();
		calendar4.clear();
		calendar4.set(2019, Calendar.MAY, 20);
		
		Calendar calendar5 = Calendar.getInstance();
		calendar5.clear();
		calendar5.set(2019, Calendar.JANUARY, 14);
		
		System.out.println(calendar3.compareTo(calendar4));
		System.out.println(calendar3.equals(calendar4)); // 원래는 주소비교였는데 날짜비교로 override 되어잇는 메소드~
		System.out.println(calendar3.compareTo(calendar5));
		System.out.println(calendar5.compareTo(calendar3)); // 음, 양수가 존재한다 -> 비교, 정렬이 가능하다!
		
		System.out.println("원 날짜: "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		calendar3.add(Calendar.DATE, 5);
		System.out.println("5일 후: "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		calendar3.add(Calendar.DATE, -10);
		System.out.println("10일 전: "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		calendar3.add(Calendar.MONTH, 6);
		System.out.println("6개월 후: "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		calendar3.add(Calendar.YEAR, 1);
		System.out.println("1년 후: "+calendar3.get(Calendar.YEAR)+"년 "+(calendar3.get(Calendar.MONTH)+1)+"월 "+calendar3.get(Calendar.DAY_OF_MONTH)+"일");
		
		
		// D A T E   객체   메소드!
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-07");
		Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-07");
		Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-08");
		System.out.println("equals: "+date3.equals(date4));
		System.out.println("compareTo: "+date3.compareTo(date4));
		System.out.println("compareTo: "+date3.compareTo(date5));
		System.out.println("compareTo: "+date5.compareTo(date3));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
