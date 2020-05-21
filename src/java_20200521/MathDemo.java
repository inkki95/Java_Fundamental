package java_20200521;

public class MathDemo {
public static void main(String[] args) {
	
	double d1 = Math.ceil(4.2);
	System.out.println(d1);
	
	d1 = Math.floor(4.9);
	System.out.println(d1);

	long l1 = Math.round(42.5);
	System.out.println(l1);
	
	d1 = 42.67;
	// 소수점 2자리에서 반올림하기
double d2 = 0;
d2 = Math.round(d1*10);
d2 = d2/10;
System.out.println(d2);
	
}
}
