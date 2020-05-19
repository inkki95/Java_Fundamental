package java_20200519;

public class AdminDemo {
public static void main(String[] args) {
	Admin a = new Admin("assdd","ad22","awd",5)	;
	//이때 setter 한번에 하는법 -> ★★생성자★★
//	a.id = "sds";
//	a.setId("sds");
	
	String ad= a.getId();
	System.out.println(ad);
	System.out.println(a.getId());
	
	System.out.println();
	System.out.println();
	System.out.println(a.getpwd());
	a.setPwd("546");
	System.out.println(a.getpwd());
	
	
}
}
