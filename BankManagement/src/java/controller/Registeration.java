package controller.org;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.org.AdminDAO;
import dao.org.AdminDAOImp;
import dto.org.AdminDetails;

public class Registeration extends GenericServlet
{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("customername");
		String account=req.getParameter("accountno");
		long accountnumber=Long.parseLong(account);
		String branch=req.getParameter("branch");
		String phone=req.getParameter("phoneno");
		long phonenumber=Long.parseLong(phone);
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		
	   AdminDetails details=new AdminDetails();
		details.setCustomername(name);
		details.setAccountnumber(accountnumber);
		details.setBranch(branch);
		details.setPhonenumber(phonenumber);
		details.setEmail(email);
		details.setPassword(password);
		details.setGender(gender);
		details.setAmount(50000.0);
		
		
		
		AdminDAO admindao=new AdminDAOImp();
		int result=admindao.insertAccountDetails( details);
		
		if(result>0)
			{
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("Index.html");
				dispatcher.forward(req, res);
				
			}
			else
			{
				req.setAttribute("exist", "Account Already Exist In DataBase");
				RequestDispatcher dispatcher= req.getRequestDispatcher("AccountCreation.jsp");
				dispatcher.include(req, res);
				
		   
			}
		
	
		
		
		
			
	}
}