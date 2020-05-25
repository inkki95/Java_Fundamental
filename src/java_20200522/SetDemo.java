package java_20200522;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// 컨트롤 쉬프트 o(영문자) 자동 임포트
		// HashSet은 객체의 중복을 허용하지 X, 순서 없음.
		HashSet set = new HashSet();
		set.add(1);  // auto boxing
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1); //중복 x 사이즈는 4
		set.add(2); //중복 제외
		
//		System.out.println(set.size());
		
		Iterator i = set.iterator();
				while(i.hasNext()) {
					Integer number = (Integer)i.next();
				}
		
	}
}
