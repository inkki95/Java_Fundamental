package java_20200514;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1년 1월 1일 월요일 1년 365일, 윤년은 366 (2월 29일) 윤년은 4년마다 발생인데 그중 100의 배수는 윤년에서
		 * 제외하기, 400배수는 윤년
		 * 
		 * 2020년 5월 12일은 무슨요일 일까? 2019년까지 총 일수 + 4월까지 총일수 + 12 더해서7로 나눈 나머지가 1이면 월 2이면 화
		 * 
		 * 
		 * 2019*365 + ((2019/4-2019/100+2019/400) + (31+29+31+12))/7
		 */

		int y = 2020;
		int m = 10;
		int d = 25;
		int totalCount = 0;
		int YUN = 0;
		String message = null;

		totalCount = (y - 1) * 365 + ((y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400);
		// 전년도 합
//		System.out.println(totalCount);

		if (y % 4 == 0) {
			YUN = 1;
			if (y % 100 == 0) {
				YUN = 0;
			}
		}
		if (y % 400 == 0) {
			YUN = 1;
		}

		int[] mArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (YUN == 1) {
			System.out.println("윤달o");
			mArray[1] = 29;
			for (int i = 0; i <= m - 2; i++) {
				totalCount += mArray[i];
			}
		}
		if (YUN == 0) {
			System.out.println("윤달x");
			for (int i = 0; i <= m - 2; i++) {
				totalCount += mArray[i];
			}
		}
//		System.out.println(totalCount + d);

		totalCount = (totalCount + d) % 7;
		System.out.println(totalCount + "번째 요일");

		if (totalCount == 1) {
			message = "월요일";
		}
		if (totalCount == 2) {
			message = "화요일";
		}
		if (totalCount == 3) {
			message = "수요일";
		}
		if (totalCount == 4) {
			message = "목요일";
		}
		if (totalCount == 5) {
			message = "금요일";
		}
		if (totalCount == 6) {
			message = "토요일";
		}
		if (totalCount == 0) {
			message = "일요일";
		}

		System.out.println(y + "년 " + m + "월 " + d + "일은      " + message + "   입니다");

//		int beSum = 0;
//		int[] be = {1,10,100,1000,10000,100000,1000000};
//		

//		for(int i=0; i<=6; i++) {
//			beSum = beSum + be[i];
//		}
//		System.out.println(beSum);

	}
}
