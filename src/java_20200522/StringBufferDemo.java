package java_20200522;

public class StringBufferDemo {
public static void main(String[] args) {
	
	StringBuffer s1 = new StringBuffer("test");
	StringBuffer s2 = new StringBuffer("test");
	System.out.println(s1==s2);
	// 스트링버퍼 클래스는 오프젝트의 이퀄스 메서드를 오버라이딩
	// 하지 않았기 떄문에 오프젝트의 이퀄스 메서드 사용한다.
	System.out.println(s1.equals(s2));
	System.out.println();
	
		
	String s3 = s1.toString();
	String s4 = s2.toString();
	// 문자열 비교를 하려면 스트링 클래스로 바꿔주고
	System.out.println(s3.equals(s4));
	
	StringBuffer sql = new StringBuffer();
	sql.append("selcet name, age");
	sql.append("from member");
	sql.append("where name = '성영한'");
	sql.append("order by name desc");
	
	System.out.println(sql);
}
}
