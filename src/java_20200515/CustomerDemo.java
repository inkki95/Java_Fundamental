package java_20200515;

public class CustomerDemo {
//클래스 객체 생성
	public static void main(String[] args) {

		Customer c1 = new Customer();
		Customer c2 = new Customer();

		
		c1.name = "철수";
		c1.email = "11@qwe";
		c1.phone = "010-111-1111";
		c1.balance = 1_000_000;
		c1.isReleased = false;

		c2.name = "손정의";
		c2.email = "22@qweqw";
		c2.balance = 100_000_000;
		c2.phone = "010-222-2222";
		c2.isReleased = false;

		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);

		System.out.println();
		
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);

		Customer c3 = c2;
		
		System.out.println();

		System.out.println(c3.name);
		System.out.println(c3.email);
		System.out.println(c3.phone);
		
		
		System.out.println(c3.balance);
		System.out.println(c3.isReleased);

		c3.name = "손정의(N)";
		System.out.println();
		
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
