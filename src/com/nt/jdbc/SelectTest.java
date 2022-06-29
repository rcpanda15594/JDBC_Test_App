//first jdbc program ...Page40

package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) throws Exception {
		
//register type4 jdbc driver
		Class.forName("oracle.jdbc.OracleDriver");
		
//establish the connection with the database 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
//create jdbc statement object
		Statement st=con.createStatement();
		
		
//execute the query and process the resultset
		ResultSet rs=st.executeQuery("select * from first");
		
//print database table records
		
		while(rs.next()!=false) {
			
			System.out.println(rs.getInt(1) + "  " +rs.getString(2) + "  " +rs.getInt(3));
			
		}//while
		
//close the all jdbc stream objects
		rs.close();
		st.close();
		con.close();
		
		
		
		
	}//main method

}//class
