package sec06.ch08;

import java.sql.*;

public class ExceptionExam4 {

	public static void main(String[] args) {
		
		//�̱��� ���α׷� �ȿ��� ��ü 1���� ����������� ����
		//2���̻� ����� ������ �Ѵ�
		
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
			//Class.forName("com.mysql.jdbc.Driver"); //-> �̰Ŵ� ��� ��
			//                  jdbc:mysql://ip�ּ�:��Ʈ��ȣ/�����ͺ��̽���
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("���� ����!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		 catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		return con;
		
	}
}
