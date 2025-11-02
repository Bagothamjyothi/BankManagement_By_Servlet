package dao.org;

import java.sql.ResultSet;
import java.sql.SQLException;

import dto.org.AdminDetails;

public interface AdminDAO 
{

	int insertAccountDetails(AdminDetails details);
	ResultSet getAdminDetailsByEmail(String email);
	ResultSet getAdminDetails();
}
