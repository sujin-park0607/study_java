package java_0930;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		System.out.println("���� �ð��� " + hour + "�� " + minute +"�� �Դϴ�.");
		if(hour> 4 && hour < 12) {
			System.out.println("Good Morning");
		}else if(hour <18) {
			System.out.println("Good Afternoon");
		}else if(hour < 22) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}

	}

}
