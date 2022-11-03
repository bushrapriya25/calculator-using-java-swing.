package java;

import java.sql.*;
public class DbConnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	DbConnect(){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost;3306/Student","root"," ");
			st = con.createStatement();
			
		    }catch (Exception e) {
			
			
			
			System.out.println(" Connection Faild");
			
		}
		
	}	
		
		void insert(String query) {
			try {
				ResultSet rs =	st.executeQuery(query);
			
			}catch(Exception e) {
				
				System.out.println("Insertion Failed");
		}
			
		}		
			void select(String query) {
				try {
					ResultSet rs =  st.executeQuery(query);
					
					while(rs.next()) {
						
						System.out.println(rs.getString(1)+""+rs.getString(2));
						}
					
					
				}catch(Exception e) {
					
					System.out.println("Insertion Failed");
				}		
					
		
		
		
	}

}

