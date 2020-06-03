package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {


	public static void main(String[] args) {
		
		//1. 드라이브 로드한다.
		//Driver 객체를 메모리에 로드하여 Java Application과 
		//mariadb-java-client-xxx.jar과 연결한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("드라이버 로드 실패");
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2. 데이터 베이스와 연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",//url
					"kpc12",//user
					"kpc1234"//password
					);//
			
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			//? 바인딩 변수 : 바인딩 변수는 반드시 컬럼 값에만 사용해야 한다.
			StringBuffer sql = new StringBuffer();
			sql.append("select num, name, addr ");
			sql.append("from member ");
			sql.append("order by num DESC ");
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 설정
//			pstmt.setInt(1, 10);
//			pstmt.setString(2, "샤넬");
//			pstmt.setString(3, "프랑스");
//			
			//5. SQL문 전송
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				System.out.printf("%d, %s, %s %n",num,name,addr);
			}
			
			//select문을 사용할 경우 executeQuery 를 사용 
			// insert update delete 문을 사용할 경우에는 executeUpdate

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6. 모든 자원을 반납한다.
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
}
