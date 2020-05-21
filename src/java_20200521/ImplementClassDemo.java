package java_20200521;

public class ImplementClassDemo {
	public static void main(String[] args) {

		InterA i = new ImplementClass();
		i.mA();
		i.mB();
		i.mC();
		System.out.println(InterA.PI);
		// Final 변수이기때문에 상수값, 못바꿈, 공개해도됨

	}
}
