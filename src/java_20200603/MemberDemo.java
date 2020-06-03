package java_20200603;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class MemberDemo {
	public static void main(String[] args) {

		MemberDao mdao = new MemberDao();
		int num = 12;
		String name = "택진형333";
		String addr = "한국333";
		

//	int resultCount = mdao.insert(num, name, addr);
		// 변수가 많아지면 객체로 넘겨주기
//		int resultCount = mdao.insert(m);
//		if (resultCount == 1) {
//			System.out.println("정상적인 회원가입 완료");
//		} else {
//			System.out.println("오류..");
//		}
//		
		ArrayList<MemberDto> list = mdao.select();
		
		for (int i = 0; i < list.size(); i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
	System.out.printf("%d , %s , %s",_num,_name,_addr);
	System.out.println();
		}
		int resultCount =0;
		if (resultCount == 1) {
			System.out.println("정상적인 삭제 완료");
		} else {
			System.out.println("오류..");
		}
		
		

	}
}
