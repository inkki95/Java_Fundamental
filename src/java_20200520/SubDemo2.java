package java_20200520;

public class SubDemo2 {
	
	public static void change(Super sup) {
		sup.age = 25;
		// sub s1이 슈퍼로 형변환 되었기에 서브의 변수 접근 불가능 (height)
		sup.playBadook();
		sup.work(); // 슈퍼랑 서브에 둘다 있는 메서드인데 오버라이딩으로 서브거로 호출
	}
	
public static void main(String[] args) {
	Sub s1 = new Sub();
	System.out.println(s1.age);

change(s1);
System.out.println(s1.age);
	
}
}
