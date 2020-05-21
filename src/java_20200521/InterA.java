package java_20200521;

public interface InterA extends InterB, InterC{
	// 인터페이스의 변수 public static final이 생략돼 있음.
	double PI = 3.14;
	// static 이여야 접근이 가능

	// 인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략
	// abstract 생략가능
	void mA();

}
