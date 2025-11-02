package dao.org;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import dto.org.AdminDetails;

public class AdminDAOImp  implements AdminDAO
{
      
	public Connection createTable() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking?user=root&password=12345");
		Statement tablecreated=con.createStatement();
		String sql= "create table if not exists accountdetails("
				     +"customername varchar(100),"
				     + "accountnumber bigint primary key,"
				     + "branch varchar(200),"
				     + "phonenumber bigint,"
				     + "email varchar(200),"
				     + "password varchar(200),"
				     + "gender varchar(100),"
				     +"amount double)";
		tablecreated.execute(sql);
		
		return con;
	}

	@Override
	public int insertAccountDetails( AdminDetails details) {
		
		ResultSet res= getAdminDetails();
		 int acreated=0;
		 boolean exists=false;
			try {
				  if (res != null) {
				        
				    
				while(res.next())
				{
					if(res.getLong("accountnumber")==details.getAccountnumber())
					{
						exists=true;
						break;
					}
				}
			}
				  if(!exists)
					{
						Connection	con = createTable();
						PreparedStatement pst=  con.prepareStatement("insert into accountdetails(customername,accountnumber,branch,phonenumber,email,password,gender,amount)values(?,?,?,?,?,?,?,?)");
						pst.setString(1,details.getCustomername());
						pst.setLong(2,details.getAccountnumber());
						pst.setString(3,details.getBranch());
						pst.setLong(4, details.getPhonenumber());
						pst.setString(5,details.getEmail());
						pst.setString(6,details.getPassword());
						pst.setString(7,details.getGender());
						pst.setDouble(8,details.getAmount());
					    acreated=pst.executeUpdate();
						
					}
					
             
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return acreated;
	}
			


	@Override
	public ResultSet getAdminDetailsByEmail(String email) 
	{
		ResultSet res = null;
		 try {
		 	Connection	con = createTable();
		 	PreparedStatement pst=con.prepareStatement("select * from accountdetails where email=? ");
		 	pst.setString(1, email);
		 	res=pst.executeQuery();
		 	
		 
		 	
		   } 
		 catch (ClassNotFoundException | SQLException e)
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	
	@Override
	public ResultSet getAdminDetails()
	{
		ResultSet res=null;
	
		try {
			Connection	con = createTable();
			PreparedStatement pst=con.prepareStatement("select * from accountdetails");
			 res=pst.executeQuery();
			
		    }
		catch (ClassNotFoundException | SQLException e) 
		    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		     }
		return res;
	}
	
	
	
}
	
			
		
		
		
		
		
		
	    
		
		
		
	





		
	


