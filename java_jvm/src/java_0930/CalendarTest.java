package java_0930;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		
		int hour12 = now.get(Calendar.HOUR);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		int miliSecond = now.get(Calendar.MILLISECOND);
		int timeZone = now.get(Calendar.ZONE_OFFSET); //시스템상 시간
		int lastDay = now.getActualMaximum(Calendar.DATE); //이달의 마지막 달 
		
		System.out.println(year + ":" + month + ":" + date);
		System.out.println(hour12 + ":" + hour12 + ":" + minute + ":" + second + ":" + miliSecond);
		System.out.println(timeZone + ":" + lastDay);
	}
}
