package java_20200518;

public class Calander {
	
	private int year;
	private int month;
	private int day;

	
	public void setYear(int y) {
		year = y;
	}
	
	
public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
// c.set(2004,4,5); 이거로 변수설정 각각 year month day로 다른 함수 접근

	
	
	
	
	private int GetCount() {
		int totalCount = 0;
		int YUN = 0;

		totalCount = (year - 1) * 365 + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		if (year % 4 == 0) {
			YUN = 1;
			if (year % 100 == 0) {
				YUN = 0;
			}
		}
		if (year % 400 == 0) {
			YUN = 1;
		}

		int[] mArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (YUN == 1) {
			System.out.println("윤달ㅇ");
			mArray[1] = 29;
			for (int i = 0; i <= month - 2; i++) {
				totalCount += mArray[i];
			}
		}
		if (YUN == 0) {
			System.out.println("윤달x");
			for (int i = 0; i <= month - 2; i++) {
				totalCount += mArray[i];
			}
		}

		return totalCount;
	}

	
	
	
	
	
	public void print() {
		String message = null;

		int totalCount = GetCount();
//총 날짜를 구하도록 호출

		totalCount = (totalCount + day) % 7;

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

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다");

	}

	
	
	
	
	public static void main(String[] args) {
		Calander c = new Calander();
		c.set(2020, 5, 18);
		c.print();
	}

}
