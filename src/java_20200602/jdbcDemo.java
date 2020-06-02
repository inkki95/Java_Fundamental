package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class jdbcDemo {
	public static void main(String[] args) {

		// 1. 드라이브 로드한다.
		// driver 객체를 메모리에 로드하여 자바 application과
		// mariadb java-client-xxx-.jar과 연결한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("로드성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("로드실패");
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
//		2.데이터 베이스와 연결
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", // url
					"kpc12", // user
					"kpc1234");// password
			System.out.println("데이터 베이스(MariaDB) 연결 성공...");

//		3. SQL문을 전송할수있는 preparedStatement 객체 생성
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES (?,?,?)");
			pstmt = con.prepareStatement(sql.toString());

//		4.바인딩 변수 설정
			pstmt.setInt(1, 10);
			pstmt.setString(2, "샤넬");
			pstmt.setString(3, "프랑스");

//		5.SQL문 전송
			int resultCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
//				6.모든 자원을 반납한다
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
