package java_20200518;

public class MethodDemo {
	public boolean isLeafYear(int year) {
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;
	}

	public long plus(int first, int second) {
		return (long) (first) + (long) (second);
	}

	public int[] ascending(int[] array) {
		int re = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {

				if (array[j] > array[j + 1]) {
					re = array[j];
					array[j] = array[j + 1];
					array[j + 1] = re;

				}
			}

		}
		return array;
		// 메소드에도 static을 사용할수있음 클래스 이름과 객체를 통해서 바로 접근이 가능
		//못하는것이많음  상수로 접근 가능
		// JVM이 스태틱만 메모리로 올려버림 -> 메모리에 올려진것들끼리만 호출,사용가능
	}

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();
// 메서드데모 안에 있는 함수를 쓰기위한 변수 m 설정 (접근을 위한)(함수랑 main을 연결)	

//	System.out.println(isLeafYear(2005));
//	System.out.println(plus(5,7));
// 바로 접근을 위해서는 Static으로 메서드 함수를 설정해야함

		System.out.println(m.plus(5, 5));

		int[] temp = { 1, 45, 65456, 22, 4, 2, 7, 8 };

		int[] result = m.ascending(temp);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");

		}

	}
}
