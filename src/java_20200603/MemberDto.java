package java_20200603;

//멤버 테이블의 데이터를 관리하는 클래스
//멤버 테이블의 컬럼(num name addr)을 멤버변수로 정하면 됨.
//DTO -> data Transfer Object
public class MemberDto {
	private int num;
	private String name;
	private String addr;

	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//디폴트 생성자
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}// 매개변수있는 생성자

	public int getNum() {
		return num;
	}// 세터게터

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
