package java_20200515bb;

import java_20200515.aa.Notice;
//서로다른 패키지라 인포트 해줘야함

public class NoticeDemo extends Notice {
							// extends Notice로 상속받기
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 2;
// 다른 패키지라 퍼블릭만 접근가능
// default 는 같은 패키지 내에서 접근 가능
// protected 는 서로 다른 캐지지 일경우에는 상속 받은 경우에만 접근 가능
// private은 같은 클래스 내에서 접근 가능
		
		
		NoticeDemo n2 = new NoticeDemo();
		// Notice 클래스를 NoticeDemo로 자식을 선정해서 접근-> protected까지 접근가능
		// 부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public, protected
		n2.number = 3;
		n2.title = "제목2";
		
		
	}
}
