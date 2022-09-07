package com.quinnox;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.sql.Statement;




public class vDAO {

	public static LinkedList<fashion_details> getAllfashion() throws SQLException {
		
		
		Connection conn = ConnectionFactory.getConnection();
		
		// insert query
		
		/*String insertQuery = "INSERT INTO fashion VALUES(?,?,?,?)";
		
		PreparedStatement preparedStmt = conn.prepareStatement(insertQuery);
		preparedStmt.setInt(1,6);
		preparedStmt.setString(2, "comb");
		preparedStmt.setString(3,"hair");
		preparedStmt.setInt(4, 40);
		
		int rowsAffected = preparedStmt.executeUpdate();
		
		System.out.println("Data added to fashion, rows affected :"+rowsAffected);
		
		preparedStmt.setInt(1, 7);
		preparedStmt.setString(2, "skirt");
		preparedStmt.setString(3, "cloth");
		preparedStmt.setInt(1, 490);
		
		int rowsAff = preparedStmt.executeUpdate();
		System.out.println("Data added to fashion, rows affected :"+rowsAff);
		*/

		// select query
		
		String selectQuery = "select * from items.fashion";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectQuery);
		
		LinkedList<fashion_details> fashion = new LinkedList<fashion_details>();
		while(rs.next()) {
			fashion_details fashion_details = new fashion_details();
			
			fashion_details.setId(rs.getInt("id"));
			fashion_details.setType(rs.getString("type"));
			fashion_details.setItem_name(rs.getString("item_name"));
			fashion_details.setItem_price(rs.getString("item_price"));
			
			fashion.add(fashion_details);
		}
		return fashion;


	}
	
public static String addProduct() throws SQLException{
	Connection conn = ConnectionFactory.getConnection();
	
	String insertQuery = "INSERT INTO fashion VALUES(?,?,?,?)";
	
	PreparedStatement preparedStmt = conn.prepareStatement(insertQuery);
	preparedStmt.setInt(1,10);
	preparedStmt.setString(2, "skirt");
	preparedStmt.setString(3,"cloth");
	preparedStmt.setInt(4, 1570);
	
	int rowsAffected = preparedStmt.executeUpdate();
	
	System.out.println("Data added to fashion, rows affected :"+rowsAffected);
	
	String message="inserted into table";
	
	return message;
	
}



public static LinkedList<fashion_details> byID(int idNo) throws SQLException{
	
	Connection conn = ConnectionFactory.getConnection();
	int Id=idNo;
	PreparedStatement pstmt= conn.prepareStatement("select * from items.fashion where id=?");
	pstmt.setInt(1,Id);
	ResultSet rs= pstmt.executeQuery();
	
	LinkedList<fashion_details> fashion = new LinkedList<fashion_details>();
	while(rs.next()) {
		fashion_details fashion_details = new fashion_details();
		
		fashion_details.setId(rs.getInt("id"));
		fashion_details.setType(rs.getString("type"));
		fashion_details.setItem_name(rs.getString("item_name"));
		fashion_details.setItem_price(rs.getString("item_price"));
		
		fashion.add(fashion_details);
	}
	return fashion;
	

}


public static LinkedList<fashion_details> byType(String type)throws SQLException {
	Connection conn = ConnectionFactory.getConnection();
	String Type=type;
	PreparedStatement pstmt= conn.prepareStatement("select * from items.fashion where type=?");
	pstmt.setString(1,Type);
	ResultSet rs= pstmt.executeQuery();
	
	LinkedList<fashion_details> fashion = new LinkedList<fashion_details>();
	while(rs.next()) {
		fashion_details fashion_details = new fashion_details();
		
		fashion_details.setId(rs.getInt("id"));
		fashion_details.setType(rs.getString("type"));
		fashion_details.setItem_name(rs.getString("item_name"));
		fashion_details.setItem_price(rs.getString("item_price"));
		
		fashion.add(fashion_details);
	}
	return fashion;
}


public static LinkedList<fashion_details> Price() throws SQLException{
	
	Connection conn = ConnectionFactory.getConnection();
	
	String Query = ("select * from items.fashion ORDER BY item_price ASC ");
	
	
	
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(Query);
	
	LinkedList<fashion_details> fashion = new LinkedList<fashion_details>();
	while(rs.next()) {
		fashion_details fashion_details = new fashion_details();
		
		fashion_details.setId(rs.getInt("id"));
		fashion_details.setType(rs.getString("type"));
		fashion_details.setItem_name(rs.getString("item_name"));
		fashion_details.setItem_price(rs.getString("item_price"));
		
		fashion.add(fashion_details);
	}
	return fashion;
	
	
	
}




}
	

	
	
