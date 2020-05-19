package java_20200519;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
//		p.chicken("sd");   자식 클래스의 치킨이라 못접근
		Child c = new Child();
		c.money = 1_000_000_000;
		c.makeMoney();    // 부모 클래스 접근 다 가능
		c.gotoSchool();
		c.chicken=("교촌");
		c.play("omok");
	}
}
