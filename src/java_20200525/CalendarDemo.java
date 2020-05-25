package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java_20200518.Calander;

public class CalendarDemo {

	public static void main(String[] args) {
		// 지금시간 뽑기
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(158917018);

//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH) + 1;
//		int day = cal.get(Calendar.DATE);
//		System.out.println(year + "년" + month + "월" + day + "일");
//		int hour = cal.get(Calendar.HOUR);
//		int minute = cal.get(Calendar.MINUTE);
//		int second = cal.get(Calendar.SECOND);
//		System.out.println(hour + "시" + minute + "분" + second + "초");
//
//		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}

}
