package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {
	
    static String server = "jdbc:sqlserver://LAPTOP-JNGBS137\\SQLEXPRESS;databaseName=jdbcDemo;integratedSecurity=true;encrypt=false";
	
	static String un = "Manikandan";
	
	static String pwd = "Mani@7854";
	
	static Connection con;
	
	public static void dbConnection() throws SQLException {
		
        con  = DriverManager.getConnection(server, un, pwd);
		
		if(con != null)
		{
			System.out.println("DB Connected Successfully");
		}
		
		else 
			System.out.println("Not connected");
	}
	public static void getRecords() throws SQLException {
		
		dbConnection();
		
		String query = "Select * from employee";
		
        Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("NAME : "+rs.getString(2));
			System.out.println("SALARY : "+rs.getInt(3));	
		}
		
		con.close();
		
	}
	
	public static void insertRecords() throws SQLException {
		
		dbConnection();
		
		String query_1 = "INSERT INTO employee Values(103,'Lakshmi',2000000)";
		
		Statement stmt = con.createStatement();
			
		//Insertion
		int rows = stmt.executeUpdate(query_1);
		
		System.out.println("Number of rows affected : "+rows);
		
		con.close();
		
	}
	
	//Calling simple store procedure
	
	//using callable statement
     public static void storeProc() throws SQLException {
		
		dbConnection();
		
		CallableStatement cst = con.prepareCall("{Call GetEmployees}");
		
		ResultSet rs1 = cst.executeQuery();
		
		while(rs1.next())
		{
			System.out.println("ID : "+rs1.getInt(1));
			System.out.println("NAME : "+rs1.getString(2));
			System.out.println("SALARY : "+rs1.getInt(3));	
		}
		
		//with In put parameter
		int Id = 102;
        CallableStatement cst1 = con.prepareCall("{Call GetEmployeesById ?}");
		
        cst1.setInt(1, Id);
        
		ResultSet rs2 = cst.executeQuery();
		
		while(rs1.next())
		{
			System.out.println("ID : "+rs2.getInt(1));
			System.out.println("NAME : "+rs2.getString(2));
			System.out.println("SALARY : "+rs2.getInt(3));	
		}
		
		
		con.close();
		
	}
     
   //Calling simple store procedure
 	
 	//using callable statement
      public static void storeProcWithInParameter() throws SQLException {
 		
 		dbConnection();
		
 		//with In put parameter
 		int Id = 102;
 		
 		// ? is used to define parameter variable which can be done by both callable and Prepared statement
 		
        CallableStatement cst1 = con.prepareCall("{Call GetEmployeesById (?) }");
 		
        cst1.setInt(1, Id);
         
 		ResultSet rs2 = cst1.executeQuery();
 		
 		while(rs2.next())
 		{
 			System.out.println("ID : "+rs2.getInt(1));
 			System.out.println("NAME : "+rs2.getString(2));
 			System.out.println("SALARY : "+rs2.getInt(3));	
 		}
 		
 		
 		con.close();
 		
 	}
     
	//we can set the auto commit to false to let know the DB notto commit w/o my knowledge
      //con.setAutoCommit(false);
      
    //Batch processing
	public static void batchProcessRecords() throws SQLException {
		
		dbConnection();
		
		String query_1 = "Update employee set salary = 5000000 where emp_id = 101";
		String query_2 = "Update employee set salary = 5000000 where emp_id = 102";
		String query_3 = "Update employee set salary = 5000000 where emp_id = 103";
		
		con.setAutoCommit(false);
		
		Statement stmt = con.createStatement();
			
		stmt.addBatch(query_1);
		stmt.addBatch(query_2);
		stmt.addBatch(query_3);
		
		int[] batchArray = stmt.executeBatch();
		
		//if in case any errors in process, then any action should not be committed
		//so using Rollback method
		
		for(int i : batchArray)
		{
			if(i>0)
			{
				System.out.println("No Of Rows Affected : "+i);
				continue;			  
			}
		    else
			    con.rollback();			
		}
			
		con.commit();
		
		con.close();
		
	}
	public static void main(String[] args) throws SQLException {
		
		batchProcessRecords();
		//storeProcWithInParameter();
		//storeProc();
		//insertRecords();
		//getRecords();
		
	}

}
