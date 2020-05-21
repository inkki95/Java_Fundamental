package java_20200521;

public class EqualsDemo {
public static void main(String[] args) {
	String s1 = new String("avc");
	String s2 = new String("avc");
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println();
	System.out.println();
	System.out.println();
	//문자안에 글자가 같으면 참 리턴 (오버라이딩 된것)
	Custmer c1 = new Custmer("성영한", "제주도");
	Custmer c2 = new Custmer("성영한", "제주도");

System.out.println(c1==c2); 
// 메모리로 접근  같은 참조를 하는지 확인
System.out.println(c1.equals(c2)); 
//메모리로 접근하니까 다르다라고 프린트
// 		오버라이딩 자동으로 만들어주기
//		(안에 글씨가 같으면 헤쉬코드가 다르더라도 
//		같다고 인식해주기)
System.out.println(c1.hashCode());
System.out.println(c2.hashCode());
System.out.println();
System.out.println();

System.out.println(c1); //레퍼런스를 찍음-> .toString 주소가 값으로 나옴
System.out.println(c1.toString()); //같은 표현 (생략) 
//		이거도 오버라이딩으로 가능

System.out.println(s1); //레퍼런스를 찍엇는데 값이 나옴
System.out.println(s1.toString()); //같은 표현 (생략) 


}
}
