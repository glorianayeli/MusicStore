package music2;

import java.sql.*;
import com.mysql.jdbc.Connection;

import STORES.OUTLET;

public class Maintenance {
	public static Connection conn = (Connection) ConnectionManager.getInstance().getConnection();
	
	public static boolean addOutlet( String address, String city, String state, int zip, String phone ) throws SQLException {
		
		String sql = "INSERT INTO OUTLET(address, city, state, zip, phone) VALUES (?,?,?,?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, address);
			stmt.setString(2, city);
			stmt.setString(3, state);
			stmt.setInt(4,zip);
			stmt.setString(5,phone);
			int rs = stmt.executeUpdate();
			if(rs == 1) {
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
	
	public static boolean deleteOutlet(int outlet_number) {
		String sql = "DELETE FROM OUTLET WHERE OUTLET_NUMBER = ?";
		try(
				PreparedStatement stmt = conn.prepareStatement(sql);
			){
			stmt.setInt(1, outlet_number);
			int affected = stmt.executeUpdate();
			
			if(affected == 1) {
				System.out.println("row affect");
				return true;
			}else {
				System.out.println("row not affect");
				return false;
			}
		}
		catch(SQLException e) {
			System.err.println(e);
			return false;
		}

	}
	public static boolean updateOutlet(OUTLET outlet) {
		String sql =
				"UPDATE OUTLET SET " +
				"address = ?, city = ?, state = ?, zip = ?, phone = ?" +
				"WHERE adminId = ?";
		try (
				PreparedStatement stmt = conn.prepareStatement(sql);
				){
			
			stmt.setString(1, outlet.getAddress());
			stmt.setString(2, outlet.getCity());
			stmt.setString(3, outlet.getState());
			stmt.setInt(4, outlet.getZip());
			stmt.setString(5, outlet.getPhone());
			stmt.setInt(6, outlet.getOutlet_number());
			
			int affected = stmt.executeUpdate();
			
			if (affected == 1) {
				System.out.println("row affect");
				return true;
			} else {
				System.out.println("row not affect");
				return false;
			}
			
		}
		catch(SQLException e) {
			System.err.println(e);
			return false;
		}
	}
	/*Opciones Add/modify/drop employee*/
	public static boolean addEmployee(String emp_name, int FK_OUTLET_NUMBER) throws SQLException {
		
		String sql = "INSERT INTO OUTLET(emp_name, FK_OUTLET_NUMBER) VALUES (?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, emp_name);
			stmt.setInt(2, FK_OUTLET_NUMBER);
			int rs = stmt.executeUpdate();
			if(rs == 1) {
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
	public static boolean deleteEmployee(int emp_number) {
		String sql = "DELETE FROM OUTLET WHERE OUTLET_NUMBER = ?";
		try(
				PreparedStatement stmt = conn.prepareStatement(sql);
			){
			stmt.setInt(1, emp_number);
			int affected = stmt.executeUpdate();
			
			if(affected == 1) {
				System.out.println("row affect");
				return true;
			}else {
				System.out.println("row not affect");
				return false;
			}
		}
		catch(SQLException e) {
			System.err.println(e);
			return false;
		}

	}
	/*Add/modify/drop customer*/
	/*Add/modify/drop product*/
	
}
