package music2;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class REPORTS {
	/*	1 Produce yearly sales report for outlet
		2 Produce sales report for employee
		3 Produce the list of the top 10 selling items*/
	/*global variable*/
	public static Connection conn = (Connection) ConnectionManager.getInstance().getConnection();
	/*1 Produce yearly sales report for outlet*/
	public static void yearlyReport(String year) throws SQLException {

		String sql = "SELECT SALE_DATE, SALE_TIME, CUSTOMER.customer_name FROM sales INNER JOIN customer ON sales.FK_CUSTOMER_ID = customer.CUSTOMER_ID WHERE EXTRACT(YEAR FROM SALE_DATE) = ?";
		ResultSet rs = null;
		try(
				PreparedStatement stmt = conn.prepareStatement(sql);
				) {
			stmt.setString(1, year);
			rs = stmt.executeQuery();
			System.out.println("Sales in a year:");
			while (rs.next()) {
				StringBuffer bf = new StringBuffer();
				bf.append(rs.getString("customer_name"));
				bf.append(rs.getString("SALE_DATE") + ": ");
				bf.append(rs.getString("SALE_TIME") +", ");
				System.out.println(bf.toString());
			}
		}
	}

	
	
}
