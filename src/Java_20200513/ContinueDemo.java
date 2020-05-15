package Java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				continue;
				// 컨티뉴 만나면 아래 반복문 실행 X 바로 i 증가
			}
			sum += i;
		}
		System.out.printf("1부터10까지 합은 %d (6은 제외)", sum);
	}
}

