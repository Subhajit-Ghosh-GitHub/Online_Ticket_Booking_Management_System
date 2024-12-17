package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DButils {
	
	Connection c=null; // to pass information we pass through interface create connection object
	Statement s=null;
	DButils(){ // Create constructor  || create object in another class and used this class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","root","123456");
			
			s=c.createStatement();
			
			//jdbc is use to execute mysql's quarries with help of java 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
