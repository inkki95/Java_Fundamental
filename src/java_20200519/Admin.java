package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
//외부의 static main에서 private이기때문에 접근이 안됨
//각각 변수에 대한 Setter 메서드가 필요함 같은 클래스의 퍼블릭으로

	public Admin(String id, String pwd, String email, int level) {
		super(); // 부모 클래스 선정, 다른 클래스에서 이 디폴트를 호출
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
		// 이렇게 생성자를 만들면 Admin a = new Admin("assdd","ad22","awd",5); 이런식으로
		// 안만들면 디폴트 생성자가 됨 Admin a = new Admin(); 이렇게
	}

// 단축기 알트쉬프트s -> 생성자 세터 게터

	public Admin(String id, String pwd, String email) {
		this(id, pwd, email, 0);
	} // 생성자의 오버로딩 level을 빼고 3변수만 입력시

	public Admin(String id, String pwd) {

		this(id, pwd, null, 0);
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getpwd() {
		return pwd;
	}

}
