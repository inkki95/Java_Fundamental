package java_20200528.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java_20200528.SeverSocketDemo;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
//1.서버소캣 객체를 생성
		try {
			serverSocket = new ServerSocket(port);

			while (true) {
				System.out.println("클라 접속을 기다림");
				Socket socket = serverSocket.accept();
// accept 클라이언트가 접속하면 클라와 통신할수 있는 소캣 객체를 생성해줌
// 기다리는 상태

				System.out.println("클라와 연결 성공");

				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				// 스트림 체인
				BufferedReader br = new BufferedReader(isr);

				String readline = br.readLine();
				System.out.println("클라이언트 메세지 : " + readline);
//6. 소캣 객체로 출력 스트림을 생성하여 클라이언트에게 메세지를 다시 보낸다

				OutputStream out = socket.getOutputStream();
//스트림 체인
				OutputStreamWriter osw = new OutputStreamWriter(out);
//스트림 체인
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readline);
				bw.flush();
				bw.newLine();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EchoServer(3000).run();

	}
}
