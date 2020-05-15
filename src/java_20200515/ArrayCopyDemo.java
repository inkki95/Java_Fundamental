package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = new int[7];
		System.arraycopy(a, 1, b, 2, 3);
		// a의 1번째 배열부터 b의 2번째 배열부터 길이 3만큼 배열복사

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();

		String[] fruits = { "apple", "banana", "watermelon", "blueberry" };
		String[] temp = new String[6];
		
		System.arraycopy(fruits, 0, temp, 1, 4);

		for (int i = 0; i < temp.length; i++) {
		if(temp[i]=="null") {
			System.out.print("없음 ");
			
		}
		System.out.print(temp[i] + " ");
		}

		System.out.println();
		temp[5]="asdasd";
		temp[0]="peach";
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
for(int i = 0; i < temp[1].length(); i++) {
	System.out.println(temp[i]);
}		

	}
}
