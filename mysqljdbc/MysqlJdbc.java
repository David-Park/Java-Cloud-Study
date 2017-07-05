package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlJdbc {

	public static Connection conn;
	
	//Mysql Api
	public static Connection getMysqlConnection(){
		try{
		//driver load.. jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver load success...");
		//												내컴퓨터:mysql port /mysql db_name
		String url = "jdbc:mysql://localhost:3306/java203";
		String user="root";
		String passwd="autoset";
		
		//mysql connection
		conn = DriverManager.getConnection(url,user,passwd);
		System.out.println("mysql login .... success....");
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	//Oracle Api
	public static Connection getOracleConnection() {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver load success....");
		String url = "jdbc:oracle:thin:@localhost:1521:java203";
		String user = "java203";
		String passwd = "java203";
		conn = DriverManager.getConnection(url,user,passwd);
		System.out.println("oracle login .... success....");
		}catch(Exception e){e.printStackTrace();}
		return conn;
	}
	
	public static ArrayList MysqlLogin(){
		ArrayList array = new ArrayList();
		try{
			Statement stat = MysqlJdbc.getOracleConnection().createStatement();
			StringBuffer buffer = new StringBuffer();
			buffer.append("select userid, passwd from login");
			ResultSet rs = stat.executeQuery(buffer.toString());
			
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysqlJdbc mysql = new MysqlJdbc();
		MysqlJdbc oracle = new MysqlJdbc();
		mysql.getMysqlConnection();
		oracle.getOracleConnection();
		
		System.out.println(oracle.MysqlLogin());
	}

}
