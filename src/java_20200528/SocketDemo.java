			package java_20200528;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {
public static void main(String[] args) {
	
	
	
	Socket socket = null;
for (int i = 22; i <= 80; i++) {
	
	try {
			socket = new Socket("13.209.180.253",i);
			System.out.println(i+"번 포트가 OOOOOO");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("잘못된 아이피");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(i+"번 포트가 XXXX");
			e.printStackTrace();
		}
		// IP주소에 어느 포트로 접속
		
	}
	
	
}

}