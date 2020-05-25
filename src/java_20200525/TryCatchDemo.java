package java_20200525;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {

		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
//	args 0번지와 1번지에서 입력값 2가지 받을 것임
			double average = getAvg(korean, english);
			System.out.println("평균 = " + average);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 메세지 : " + e.getMessage());
			// arg에 값이 없으면 예외 메시지 출력
			System.out.println("arg 값 2개 넣으세요");
//			System.err.println("에러"); // 빨간 글씨로 출력하는 문장
//			e.printStackTrace();

		} catch (NumberFormatException e) {
			System.err.println("예외 메세지 :" + e.getMessage());
			System.out.println("문자 말고 숫자로");
//			캐치 블럭이 여러개 있을 경우 위에서부터 하위 클래스가 와야함
//			시작부터 빡씨게 다 잡아버리면 나중 코드에서 예외를 못잡음
		} finally {
			System.out.println("finally");
		}
	}
}