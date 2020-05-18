package java_20200518;

public class MethodOverLoadingDemo {
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(int i) {
		System.out.println(i);
	}
	
	public void print(double d) {
		System.out.println(d);
	}
	
	public void print(boolean b) {
		System.out.println(b);
	}
	
	
public static void main(String[] args) {
	MethodOverLoadingDemo m = new MethodOverLoadingDemo();
	int a = 10;
	String c = "asfa";
	m.print(a);
	m.print(c);

}
}
