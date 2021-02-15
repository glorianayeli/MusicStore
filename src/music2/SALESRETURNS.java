package music2;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import com.mysql.jdbc.Connection;
import STORES.SALE;

public class SALESRETURNS {
	public static Connection conn = (Connection) ConnectionManager.getInstance().getConnection();
	/*
	1 Process a sale
	2 Process a return
	3 View a sale (given date and customer id)
	4 View a return (given date and customer id)*/
	
	/*Process a sale*/
	public static boolean addSale(String SALE_DATE, String SALE_TIME, int quantity, int FK_OUTLET_NUMBER, int FK_EMP_NUMBER, int FK_CUSTOMER_ID, int FK_PRODUCT_CODE) throws SQLException {
		
		String sql = "INSERT INTO employee(SALE_DATE, SALE_TIME, quantity, FK_OUTLET_NUMBER, FK_EMP_NUMBER, FK_CUSTOMER_ID, FK_PRODUCT_CODE) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, SALE_DATE);
			stmt.setString(2, SALE_TIME);
			stmt.setInt(3, quantity);
			stmt.setInt(4, FK_OUTLET_NUMBER);
			stmt.setInt(5, FK_EMP_NUMBER);
			stmt.setInt(6, FK_CUSTOMER_ID);
			stmt.setInt(4, FK_PRODUCT_CODE);
			
			int rs = stmt.executeUpdate();
			if(rs == 1) {
				System.out.println("row affect");
				return true;
			}
			else {
				return false;
			}
		}catch(SQLException e) {
			System.err.println("Error:" + e);
			return false;
		}finally{
			ConnectionManager.getInstance().close();
			if (stmt != null) {
				stmt.close();
			}
		}
	}
	/*View a sale (given date and customer id)*/
	public static SALE viewSale(String date, int cutId) throws SQLException {
		/*generating a query for get the sql*/
		String sql = "SELECT * FROM sales WHERE SALE_DATE = ? AND FK_CUSTOMER_ID = ?";
		ResultSet rs = null;

		try (
				PreparedStatement stmt = conn.prepareStatement(sql);
				){
			stmt.setString(1, date);
			stmt.setInt(2, cutId);
			rs = stmt.executeQuery();
			/*run each date in the rs*/
			if (rs.next()) {
				SALE saleNew = new SALE();
				saleNew.setId(rs.getInt("id"));
				saleNew.setSALE_DATE(rs.getString("SALE_DATE"));
				saleNew.setSALE_TIME(rs.getString("SALE_TIME"));
				saleNew.setQuantity(rs.getInt("quantity"));
				saleNew.setFK_OUTLET_NUMBER(rs.getInt("FK_OUTLET_NUMBER"));
				saleNew.setFK_EMP_NUMBER(rs.getInt("FK_EMP_NUMBER"));
				saleNew.setFK_CUSTOMER_ID(rs.getInt("FK_CUSTOMER_ID"));
				saleNew.setFK_PRODUCT_CODE(rs.getInt("FK_PRODUCT_CODE"));
				return saleNew;
			} else {
				return null;
			}

		} catch (SQLException e) {
			System.err.println(e);
			return null;
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
		
	}
	
}
