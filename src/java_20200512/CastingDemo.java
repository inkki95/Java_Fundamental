package java_20200512;

public class CastingDemo {
public static void main(String[] args) {
	//asd
//	byte a = 128;
//	 바이트 범위 초과
	byte a = (byte)128;
//	-128   ~~~~~~  127 의 범위인데 127에서 처음으로 돌아가서
//	-128이 나오게됨. (circuit 오류!)
System.out.println(a);


	int b = (int)42.755;
	System.out.println(b);
//	int로 형변환하면 소수점 짤라서 들어감 (cut 현상!)

//	circuit 과 cut이 같이 일어날 수 있음
	
	int ss = 10;
	System.out.println(Integer.toBinaryString(ss));
}
}
