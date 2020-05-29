package java_20200528;

import java.io.IOException;
import java.net.ServerSocket;

public class SeverSocketDemo {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		for (int i = 0; i < 65000; i++) {

			try {
				serverSocket = new ServerSocket(i);
//		System.out.println(i+"포트를 사용 OOOOO"); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(i + "포트를 사용 XXXXX");
			}

		}

	}
}
