package java_20200521;

public class StringDemo {
public static void main(String[] args) {
	
//	String sql = "selcet asdjaskdaj";
//	sql += "sd";
//	sql += "sasdasdadd";
//	sql += "sasdasd";
//	sql += "ssdasdasdd";
//	sql += "sdasasdad";
//	
	//스트링 클래스는 불변 객체.
	//계속해서 메모리에 쌓아두고 저장하게됨

String s1 = new String("Hello");
String s2 = new String("Hello");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));


String s3 = "world";
String s4 = "world";
System.out.println(s3==s4);
System.out.println(s3.equals(s4));




}
}
