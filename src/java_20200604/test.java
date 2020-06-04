package java_20200604;

import java.util.ArrayList;

public class test {
	public static String play(ArrayList<String> p1, ArrayList<String> c1) {
		for (int i = 0; i < p1.size(); i++) {
			for (int j = 0; j < c1.size(); j++) {
				if (p1.get(i).equals(c1.get(j))) {
					System.out.println(p1.get(i) + "완주");
					p1.add(i,"null");
				}
			}
		}
		String str = p1.get(0);
		return str;
	}

	public static void main(String[] args) {

		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> c1 = new ArrayList<String>();
		p1.add("ddd");
		p1.add("bbb");
		p1.add("ccc");
		p1.add("aaa");

		c1.add("aaa");
		c1.add("ccc");
		c1.add("bbb");

		String f = new String();

		f = play(p1, c1);
		System.out.println(f + "실패");
	}
}
