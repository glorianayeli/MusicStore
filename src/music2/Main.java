package music2;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.jdbc.Connection;

import STORES.SALE;

public class Main {
//	private static final String USERNAME = "dbuser";
//	private static final String PASSWORD = "dbpassword";
//	private static final String CONN_STRING =
//	"jdbc:mysql://localhost/musicstore";
		
		public static void main(String[] args) throws SQLException {
			
			//Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = null;
//			try {
//				conn = (Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
//				System.out.println("Connected!");
//			}catch(SQLException e){
//				System.err.println(e);
//			}finally {
//				if(conn != null) {
//					conn.close();
//				}
//			}
			 
		
			
			REPORTS.yearlyReport("2021");
			REPORTS.employeeReports(1);
			
//			System.out.println("Enter address");
//			String address = enter.nextLine();
//			System.out.println("Enter city");
//			String city = enter.nextLine();
//			System.out.println("Enter state");
//			String state = enter.nextLine();
//			System.out.println("Enter zip");
//			int zip = enter.nextInt();
//			Scanner phoneEnter = new Scanner(System.in);
//			System.out.println("Enter phone");
//			String phone = phoneEnter.nextLine();
			
			
//			Maintenance.addOutlet(address, city, state, zip, phone);
//			Maintenance.deleteOutlet(1);
			
			
		}
}
