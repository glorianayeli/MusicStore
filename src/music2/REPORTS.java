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
				bf.append(rs.getString("customer_name")+ ": ");
				bf.append(rs.getString("SALE_DATE") + ": ");
				bf.append(rs.getString("SALE_TIME") +", ");
				System.out.println(bf.toString());
			}
		}
	}
	/*Produce sales report for employee*/
	public static void employeeReports(int id) throws SQLException {

		String sql = "SELECT SALE_DATE, SALE_TIME, emp_name FROM sales INNER JOIN employee ON sales.FK_EMP_NUMBER = employee.EMP_NUMBER WHERE EMP_NUMBER = ?";
		ResultSet rs = null;
		try(
				PreparedStatement stmt = conn.prepareStatement(sql);
				) {
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			System.out.println("Sales for employee:");
			while (rs.next()) {
				StringBuffer bf = new StringBuffer();
				bf.append(rs.getString("emp_name") + ": ");
				bf.append(rs.getString("SALE_DATE") + ": ");
				bf.append(rs.getString("SALE_TIME") +", ");
				System.out.println(bf.toString());
			}
		}
	}
	/*3 Produce the list of the top 10 selling items*/
	public static void topTenProducts() throws SQLException {
		String sql = "SELECT SUM(quantity) AS quantity ,artist, title FROM sales INNER JOIN product ON FK_PRODUCT_CODE = PRODUCT_CODE GROUP BY PRODUCT_CODE ORDER BY quantity DESC LIMIT 10";

		ResultSet rs = null;
		try(
				PreparedStatement stmt = conn.prepareStatement(sql);
				) {
			rs = stmt.executeQuery();
			System.out.println("The top 10 are:");
			while (rs.next()) {
				StringBuffer bf = new StringBuffer();
				bf.append(rs.getString("artist"));
				bf.append(rs.getString("title") + ": ");
				bf.append(rs.getString("quantity") +", ");
				System.out.println(bf.toString());
			}
		}
	}	
}
