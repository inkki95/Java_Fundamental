package Java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.printf("1~10합은 %d입니다%n", sum);
//	printf 는 int는 %d      %n은 줄 띄우기

		int sumH = 0;
		sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			} else {
				sumH += i;
			}
		}
		System.out.printf("1~10 짝수 합은 %d입니다%n", sum);
		System.out.printf("1~10 홀수 합은 %d입니다%n", sumH);
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				
//				System.out.printf("%dX%d=%d\t", i, j, i * j);
//
//			}
//
//			System.out.printf("%n");
//
//		}
		System.out.printf("%n");
		System.out.printf("%n");

//		for (int i = 9; i >= 2; i--) {
//			for (int j = 1; j <= 9; j++) {
//
//				System.out.printf("%dX%d=%d\t", i, j, i * j);
//				// System.out.printf("d");
//			}
//
//			System.out.printf("%n");
//			// System.out.printf("d");
//
//		}
//		System.out.printf("end\n");

//		for (int i = 5; i >= 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.printf("*");
//			
//
//			}

		
		for (int i = 0; i <= 7; i++) {
			for (int j2 = 0; j2 <= i; j2++)
				System.out.printf("*");
			{
				for (int j = 0; j < 7 - i; j++) {
					System.out.printf(" ");
				}
				System.out.printf("\n");
			}

		}
		
		
		
		for (int i = 0; i <= 7; i++) {
			for (int j2 = 0; j2 <= i; j2++)
				System.out.printf(" ");
			{
				for (int j = 0; j < 7 - i; j++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}

		}
		int ss=0;
		
		
		
		
		// 1 3 5 7 11 13 17 19
		// 소수 찾기
		
		
		asd:for (int i = 1; i <= 100; i++) {
			for (int j = 2; j <= i-1; j++) {
				ss= i%(j);
				if(ss==0) {
					continue asd;
				}
					
				
			}
			System.out.printf("%d ", i);
		}

	}

}
