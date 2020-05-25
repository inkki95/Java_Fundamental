package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Delayed;

public class FileDemo {

	public static void main(String[] args) {

		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		// 파일만드는 명령어
		if (success) {
			System.out.println("생성완료");
		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}

		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long filesize = f2.length() / 1024;
		System.out.println(filesize + "KB");
		// 크기 알려줌

		String fileName = f2.getName();
		System.out.println(fileName);
		// 이름만

		fileName = f2.getPath();
		// 경로까지
		System.out.println(fileName);

		if (fileName.endsWith("exe")) {
			System.out.println("응용프로그램");

		} else if (fileName.endsWith("pdf")) {
			System.out.println("pdf 문서파일");

		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일");

		}

		long lastModified = f2.lastModified();
//		lastModified = Math.round(lastModified / 1000);
//		System.out.println(lastModified);
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

		String date = sdf.format(c.getTime());
		System.out.println(date);

		File f3 = new File("C:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		f3.delete();
		File f4 = new File("C:\\dev\\Hi.java");
		f3.renameTo(f4);

	}
}
