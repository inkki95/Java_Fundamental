package java_20200514;

public class TwoArrayDemo {
	public static void main(String[] args) {
		int[][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;

		int[][]b = {{10,20},{30,40},{50,60}};
		
		// System.out.print(a[2][1]);
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//
//				System.out.print(a[j][i] + " ");
//			}
//			System.out.print("\n");
			
			for (int j = 0; j < a.length; j++) {
				
			for (int j2 = 0; j2 < a[j].length; j2++) {
				System.out.print(a[j][j2]+" ");
			}
				System.out.println();
			}

		}

	}

