package java_20200520;

public class SubDemo {
public static void main(String[] args) {
	
	Super s1 = new Super();
	System.out.println(s1.age);
	s1.playBadook();
	s1.work();
	System.out.println();
	System.out.println();
	
	Sub s2 = new Sub();
	System.out.println(s2.height);
	s2.playGame();
	s2.work(); // 부모랑 오버라이딩이라 호출이 안됨
	System.out.println(s2.age);
	s2.playBadook();
	System.out.println();
	System.out.println();
	
	Super s3 = s2;
	
//	Super s3 = new Sub();  // 슈퍼의 멤버변수만 접근가능 (age)
//	서브의 형을 왜 슈퍼로 만드냐, 슈퍼가 객체를 행성할 수 없을때
//	-> 추상 클래스 개념
//	추상 클래스에 객체를 형성하는 방법 (자식이 있어야 객체형성 가능)
	
	System.out.println(s3.age);
	s3.playBadook();
	s3.work();
	s3.age = 15;
	System.out.println(s3.age);
//	s3.height // 자식거 못씀
//	s3.playGame(); //자식거 못씀
	
}
}
