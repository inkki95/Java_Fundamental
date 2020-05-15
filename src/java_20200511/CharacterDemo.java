package java_20200511;

public class CharacterDemo {
public static void main(String[] args){
	//유니코드 표현 '\u0000';
	char c1 = '\uC591';
	char c2 = '\uC778';
	char c3 = '\uAE30';
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	
	//아스키 코드
	//48~57 -> 0~9     65~90 -> A-Z      97~122 -> a-z
	char c4 = 97;
	System.out.println(c4);
	
	//문자 표현법
	char c5 = '인';
	char c6 = '기';   // 한글자씩 하는 경우에만 사용, 보통 스트링 문법사용
	String c7 = "인기";
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);
	
	
	char c8 = '\'';
	System.out.println(c8);
	char c9 = '\\';
	System.out.println(c9);
	// 문자 char에서  '  "  \  쓰는법 -> ★★★★★★★★★★앞에\붙이기
	
	
	String c11 = "as s'\\d ss/sd";
	System.out.println(c11);
	System.out.println("aa"+'\t' + "bb"); //텝
			System.out.println("aa"+'\n' + "bb"); //엔터
			System.out.println("aa"+'\r' + "bb"); //엔터
			
System.out.println(c8+c9); // 문자인데 int로 반환됨


System.out.println(); 
System.out.println(); 

int r1 = (int)(Math.random()*25)+97;
int r2 = (int)(Math.random()*25)+97;
int r3 = (int)(Math.random()*25)+97;
int r4 = (int)(Math.random()*25)+97;
System.out.print((char)r1); 
System.out.print((char)r2);
System.out.print((char)r3); 
System.out.print((char)r4);


}
}
