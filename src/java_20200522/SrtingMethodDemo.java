package java_20200522;

import javax.print.DocFlavor.STRING;

public class SrtingMethodDemo {
	public static void main(String[] args) {

		String ssn = "111111-124";

		// 각 자릿수의 숫자를 따오기
		char c = ssn.charAt(6);
		// ssn의 6번째 문자 가져오기
		System.out.println(c);

		ssn = ssn.concat("asd");
		// 문자열 뒤에 추가 연결하기
		System.out.println(ssn);

		String fileName = "aasd.sdc.doc";
		if (fileName.endsWith("doc")) {
			System.out.println("워드문서입니다");
		}
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		System.out.println(fileName.length());
		// 배열의 길이 -> length 문자열의 길이 -> length()

		String dbId = "asdas21 31 ".trim();
		System.out.println(dbId);
		// 앞뒤 문자열 공백제거
		System.out.println();

		fileName = "abc.doc.wdvw.wdv2w";
		String first = fileName.substring(0, fileName.lastIndexOf("."));
		System.out.println(first);
		// indexOf로도 가능
		String last = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(last);
		System.out.println();
		// indexOf로도 가능
		// 중요★★★★★★★★★

		String html = "안녕하세요\n저는 성영한입니다.\n잘부탁드립니다.";
		System.out.println(html);
		// \n을 html로 할때는 다른거로 바꺼야함
		System.out.println();
		html = html.replace("\n", "<br>");
		System.out.println(html);

		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);
		System.out.println();

		char[] c1 = { 'a', 'b', 'c' };
		System.out.println(c1);

		String ssn2 = String.format("ㅇㅇ%,.2f", 123.456678);
		System.out.println(ssn2);

		ssn2 = String.format("%3$f %2$f %f", 111.45, 222.534, 333.545);
		System.out.println(ssn2);
		
		

	}
}
