package java_20200515;

public class CustomerStaticDemo {
public static void main(String[] args) {
	Customer c1 = new Customer();
	c1.name = "홍길동";
	c1.interestRate = 30.45;
	
	Customer c2 = new Customer()	;
	c2.name = "아무개";
	Customer.interestRate = 12.25;
	
	System.out.println(Customer.interestRate);
	
}
}
