package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] a = new int[4];
		int[] b = { 100, 200, 300, 400, 500 };
		a[0] = 1;
		a[1] = 2222;
		a[2] = 3;
		a[3] = 4;

		System.out.println(a[2]);
		System.out.println(b[3]);

		for (int i = 0; i <= 3; i++) {
			System.out.printf("%d ", a[i]);
		}

		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.printf("%d ", b[i]);

		}

		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;

		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		System.out.println();
		for(int temp:b) {
			System.out.print(temp+" ");
		}
		//향상된 배열 출력법 (enhanced for loop)
		
		
		int [] c = a;
		c[0] = 11111;
		
		System.out.println();
		for(int temp:c) {
			System.out.print(temp+" ");
		}		
		//래퍼런스끼리 참조가능 (동기화)
		
		System.out.print(a[0]);
		System.out.print("\n");
		
		int[] cc = {12,23,4,5,65};
		for (int i : cc) {
			System.out.print("  "+i);
		}
		System.out.print("\n");
		for (int i = 0; i < cc.length; i++) {
			System.out.print("  "+cc[i]);
			
		}
		
		
	}
}
