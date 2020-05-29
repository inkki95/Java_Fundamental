package java_20200528.echo.Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

import java_20200522.SrtingMethodDemo;

public class EchoClient {

	private String ip;
	private int port;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;
		try {
			socket = new Socket(ip, port);
			// 3. 소캣 객체를 생성하여 서버와 연결을 시도한다.
			// 4. 소캣 객체로 출력 스트림을 생성하여 서버로 메세지를 보낸다.
			OutputStream out = socket.getOutputStream();
			//스트림 체인
			OutputStreamWriter osw = new OutputStreamWriter(out);
			//스트림 체인
			BufferedWriter bw = new BufferedWriter(osw);
			//스트림 체인
			bw.write("안녕하세요....저는 양인기입니다.");
			bw.newLine();
			bw.flush();
//7. 소캣 객체로 입력 스트림을 생성하여 서버의 메세지를 읽는다.
			InputStream in = socket.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println("서버 메세지 : "+readLine);
			
			System.out.println("서버와 연결 성공");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoClient("192.168.0.4", 3000).run();
	}

}
