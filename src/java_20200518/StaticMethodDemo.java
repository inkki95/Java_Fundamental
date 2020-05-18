package java_20200518;

public class StaticMethodDemo {
	String name;
	static double intererstRate;

	public void m1() {
//		instance 메서드에서는 instance 변수, static 변수 모두 사용가능
//		instance 메서드에서는 instance 메서드, static 메서드 모두 호출가능
		name = "성영한";
		// this. 이 생략되어있음, 자기자신객체
		intererstRate = 4.2;
		// 클래스이름. 이 생략되어있음
		m2();
		// this.
		m4();
		// 클래스이름.ㅋ
	}

	public void m2() {

		System.out.println("m2() 인스턴스 메서드 호출");

	}

	public static void m3() {
//	static 메서드에서는 static 변수만 사용가능
//	static 메서드에서는 static 메서드만 호출가능	

		name = "홍길동";
		intererstRate = 3.9;
		m2();
		m4();
	}

	public static void m4() {
		System.out.println("m4 static 메서드 호출");
	}

	public static void main(String[] args) {
m4(); //스태틱이라 가능
m3(); //스태틱이라 가능
intererstRate = 4.3;

//★★★★★★★ main 함수는 스태틱 이므로 스태틱은 그냥쓰고 인스탄스는 객체를 만들어야함

StaticMethodDemo m = new StaticMethodDemo();
m.m1();
m.m2();
m.name = "손정의";

	}

}
