package myjava;

import java.sql.*;
public class mysample{
	public static void main(String[] args) {
		try {
		Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Moorthy@8900");
        System.out.println("Connection established...");
		Statement st=cn.createStatement();
			//String query= "update student set name='vetri' where id=10";
			//int n=st.executeUpdate(query);
			//System.out.println(n+"updated successfully....");
		//st.execute("Delete from student where id=12");
		//System.out.println("deleted row succesfully...");
    
		//int n=st.executeUpdate("insert into student(id,name,dept) values(13,'theju ','IT')");
		//int n1=st.executeUpdate("insert into student(id,name,dept) values(13,'theju','IT')");
		//System.out.println(n+"row added succefully...");
	ResultSet rs=st.executeQuery("Select * from student "); 
       //ResultSet rs=st.execute("delete * from student where id=13");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
			
		}
	}
}