package java_20200518;

public class Calander {
	
	static String message = null;
	private int year;
	private int month;
	private int day;

	public Calander(int year, int month, int day) {
		this.year =year;
		this.month =month;
		this.day =day;
	}
	
	public void setMonth() {
		month = month+1;
		day = 0;
	}
	
	public void setDay() {
		day = 1;
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
//			System.out.print("윤달ㅇ");
			mArray[1] = 29;
			for (int i = 0; i <= month - 2; i++) {
				totalCount += mArray[i];
			}
		}
		if (YUN == 0) {
//			System.out.print("윤달x");
			for (int i = 0; i <= month - 2; i++) {
				totalCount += mArray[i];
			}
		}

		return totalCount;
	}
	
	
	
	
	
	
	
	public void print() {
		

		int totalCount = GetCount();
//총 날짜를 구하도록 호출

		totalCount = (totalCount + day) % 7;

		if (totalCount == 1) {
			message = "월";
		}
		if (totalCount == 2) {
			message = "화";
		}
		if (totalCount == 3) {
			message = "수";
		}
		if (totalCount == 4) {
			message = "목";
		}
		if (totalCount == 5) {
			message = "금";
		}
		if (totalCount == 6) {
			message = "토";
		}
		if (totalCount == 0) {
			message = "일";
		}
	}
	
	public void PrintDay() {	
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다");
	}
	
	public void PrintMon() {
		System.out.print(message);
	}
	
	

	public void first() {
		setDay();
		print();
	}
	public void last() {
		setMonth();
		print();
	}
	
	
	
	public static void main(String[] args) {
		Calander c = new Calander(2020,6,18);
		 //날짜 선정
		c.print(); // 2020년 5월은 18일은 월요일입니다.
		c.PrintDay(); //2020년 5월은 18일은 월요일입니다.
		
		c.first();  // day를 1로해서 첫요일 구하기
		c.PrintMon();
		System.out.println();
		c.last();  // month+1 하고 day를 0으로 해서 마지막 요일 구하기
		c.PrintMon();
		
		
	
	}

}
