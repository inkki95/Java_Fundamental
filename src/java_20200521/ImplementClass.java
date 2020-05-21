package java_20200521;

public class ImplementClass implements InterA {
// 인터A는 B C도 상속받고 있기 때문에 오버라이딩해야함

	public void mA() {
// 인터 A거 오버라이딩
		System.out.println("mA()");
	}

	public void mB() {
//인터B 오버라이딩
		System.out.println("mB()");
	}

	public void mC() {
//인터C 오버라이딩
		System.out.println("mC()");
	}

}
