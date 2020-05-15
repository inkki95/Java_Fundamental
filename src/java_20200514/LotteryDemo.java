package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
//		for(int t=0; t<=10; t++) {
		int[] a = new int[6];
		for (int i = 0; i <= 5; i++) {
			a[i] = (int) (Math.random() * 45) + 1;

			if (i == 0)
				continue;

			for (int j = 0; j <= i - 1; j++) {
				if (a[i] == a[j]) {

					System.out.print(a[i]);
					System.out.print(" 2번 나옴(" + (i + 1));
					System.out.printf("번째 자리에서 중복 )" + "\n");
					i--;

				}

			}
		}

		// 중복피하고 오름차순으로
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

		int re = 0;
		int index = 0;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0 ; j <= 4-i ; j++) {

				if (a[j] >= a[j + 1]) {
					re = a[j];
					a[j] = a[j + 1];
					a[j + 1] = re;
					
				}
				index++;
			}
			index++;
		}
		// 오름차순 코드

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.print("\n" + index);
// 깃 테스트

//	System.out.println();
//	System.out.println();
//		}
	}
}
