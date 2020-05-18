package java_20200518;

public class Member {
private String name;
private String zipcode;
private String addr1;
private String addr2;
private String ssn1;
private String ssn2;
private int age;
private String regdate;

//setter getter 자동만들기 -> 알트 쉬프트 s R 전부체크 

public void setAge(int age) {
	this.age = age;
}
public int getAge() {
	return age;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public String getZipcode() {
	return zipcode;
}

public static void main(String[] args) {
	Member m = new Member();
	m.setAge(5);
	m.getAge();
	System.out.println(m.age);
	m.setAge(55);
	System.out.println(m.age);
	
	Calander c = new Calander();
	c.set(2002, 5, 20);
	c.print();
	
}



}
