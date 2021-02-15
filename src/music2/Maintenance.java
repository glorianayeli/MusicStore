package music2;

import java.sql.*;
import com.mysql.jdbc.Connection;

import STORES.CUSTOMER;
import STORES.EMPLOYEE;
import STORES.OUTLET;
import STORES.PRODUCT;

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
				"WHERE OUTLET_NUMBER = ?";
		PreparedStatement stmt = null;
		try {
				stmt = conn.prepareStatement(sql);
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
		
		String sql = "INSERT INTO employee(emp_name, FK_OUTLET_NUMBER) VALUES (?,?)";
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
		String sql = "DELETE FROM OUTLET employee EMP_NUMBER = ?";
		PreparedStatement stmt = null;
		
		try{
			stmt = conn.prepareStatement(sql);
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
	public static boolean updateEmployee(EMPLOYEE employee) {
		String sql =
				"UPDATE employee SET" +
				"FK_OUTLET_NUMBER = ?, emp_name = ?"  +
				"WHERE EMP_NUMBER = ?";
		PreparedStatement stmt = null;
		try {
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, employee.getFK_OUTLET_NUMBER());
				stmt.setString(2, employee.getEmp_name());
				stmt.setInt(3, employee.getEMP_NUMBER());
			
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
	/*Add/modify/drop customer*/
public static boolean addCustomer(String customer_name, String address, String city, String state, int zip, int phone) throws SQLException {
		
		String sql = "INSERT INTO customer (customer_name, address, city, state, zip, phone) VALUES (?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, customer_name);
			stmt.setString(2, address);
			stmt.setString(3, city);
			stmt.setString(4, state);
			stmt.setInt(6, zip);
			stmt.setInt(7, phone);
			
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

	public static boolean deleteCustomer(int customer_id) {
		String sql = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = ?";
		try(
				PreparedStatement stmt = conn.prepareStatement(sql);
		){
			stmt.setInt(1, customer_id);
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
	
	public static boolean updateCUSTOMER(CUSTOMER customer) {
		String sql =
				"UPDATE CUSTOMER SET " +
				"customer_name = ?, address = ?, city = ?, state = ?, zip = ?, phone = ?" +
				"WHERE CUSTOMER_NUMBER = ?";
		try (
				PreparedStatement stmt = conn.prepareStatement(sql);
				){
			
			stmt.setString(1, customer.getCustomer_name());
			stmt.setString(2, customer.getAddress());
			stmt.setString(3, customer.getCity());
			stmt.setString(4, customer.getState());
			stmt.setInt(5, customer.getZip());
			stmt.setInt(6, customer.getPhone());
			
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
	
	/*Add/modify/drop product*/
	
	public static boolean addProduct(String artist, String title, float cost, int sale_price) throws SQLException {
		
		String sql = "INSERT INTO product(artist, title, cost, sale_price) VALUES (?,?,?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, artist);
			stmt.setString(2, title);
			stmt.setFloat(3, cost);
			stmt.setInt(4, sale_price);
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
	public static boolean deleteProduct(int PRODUCT_CODE) {
		String sql = "DELETE FROM OUTLET employee PRODUCT_CODE = ?";
		PreparedStatement stmt = null;
		
		try{
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, PRODUCT_CODE);
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
	public static boolean updateProduct(PRODUCT product) {
		String sql =
				"UPDATE product SET" +
				"artist = ?, title = ?, cost = ?, sale_price = ?"  +
				"WHERE PRODUCT_CODE = ?";
		PreparedStatement stmt = null;
		try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, product.getArtist());
				stmt.setString(2, product.getTitle());
				stmt.setFloat(3, product.getCost());
				stmt.setInt(4, product.getSale_price());
				stmt.setInt(5, product.getProduct_code());
			
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
}
