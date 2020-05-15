package java_20200512;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;//

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = (double) b / a;
		System.out.println(d);
		System.out.println(d);
		c = b % a;
		System.out.println("나머지는" + (int) c);

		a += b;
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		a = 10;
		b = 20;
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);

		c = a++;
//		대입 후 증가  a가 11이면 c도 11
		System.out.println(c);
		System.out.println(a);

		c = ++b;
//		증가 후 대입 b가 21이므로 c는 22
		System.out.println(c);

//		c = a * b;
//		System.out.println(c);
// 컨트롤 쉬프트 F =>> 들여쓰기

		a = 10;
		b = 20;
		d = 10.0;
		// a와 d의 boolean 비교는 타입에 관계없이 값만 같으면 true false 판별
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == b;
		System.out.println(isSuccess);

		isSuccess = a == d;
		System.out.println(isSuccess);
		System.out.println();
		System.out.println();

//		비트연산 10진수로 표현됨.
		System.out.println(4 & 5); // 0100 0101 ->0100
		System.out.println(4 | 5); // -> 0101
		System.out.println(4 ^ 5); // -> 0001
		a = 10;
		b = 10;

//		논리연산  true false 맞으면 1 틀리면 0을 논리연산으로 비교 
		isSuccess = (a == b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		System.out.println();

		System.out.println("123" + 4 + (5 + 6));
		System.out.println("123" + 4 + 5 + 6);
//		+연산자의 계산순서 주의

	}
}
