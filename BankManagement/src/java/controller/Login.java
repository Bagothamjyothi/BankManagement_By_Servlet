package controller.org;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.org.AdminDAO;
import dao.org.AdminDAOImp;

public class Login extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		AdminDAO admindao=new AdminDAOImp();
		ResultSet res=admindao.getAdminDetailsByEmail(email);
		try {
			if(res.next())
           {
		
		   if(res.getString("password").equals(password))
		    {
			
				RequestDispatcher dispatcher=req.getRequestDispatcher("Dashboard.html");
				dispatcher.forward(req, resp);
			
		}
		else
		{
			req.setAttribute("loginerror", "Invalid Credentials");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);
		}
			}else
			{
				req.setAttribute("loginerror", "Invalid Credentials");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
				dispatcher.forward(req, resp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
