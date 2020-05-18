package java_20200518;

public class CalanderDemo {
public static void main(String[] args) {
	
	Calander c = new Calander();
	c.set(2020,05,18);
	// 멤버변수 private로 되어있어서 함수로만 접근가능
	c.print();
	c.setYear(2021);
	// private 변수 변경하려면 함수로 접근
	c.print();
	
	
}
	
}
