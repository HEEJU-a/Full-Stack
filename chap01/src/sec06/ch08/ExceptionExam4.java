package sec06.ch08;

import java.sql.*;

public class ExceptionExam4 {

	public static void main(String[] args) {
		
		//싱글톤 프로그램 안에서 객체 1개만 만들어지도록 유도
		//2개이상 만들수 없도록 한다
		
		DbUtils du = new DbUtils();
		Connection con = du.getCon();
		
//		DbUtils du = DbUtils.getInstance();
//		DbUtils du2 = DbUtils.getInstance();
//		
//		System.out.println(du == du2);
		
		
	}

}

class DbUtils{
	
//	private DbUtils() {}
//	private static DbUtils dbutils;
//	
//	public static DbUtils getInstance() {
//		if(dbutils == null) {
//			dbutils = new DbUtils();
//		}
//		return dbutils;
//	}
//	
	
	Connection getCon() {
		Connection con = null;
	
		try {
			//Class.forName("com.mysql.jdbc.Driver"); //-> 이거는 없어도 됨
			//                  jdbc:mysql://ip주소:포트번호/데이터베이스명
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("접속 성공!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		 catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		return con;
		
	}
}
