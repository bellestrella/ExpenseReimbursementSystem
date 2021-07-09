package servlet;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Employee;
import services.ConnectionUtil;

public class ViewInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private LoginDao loginDao;

	public ViewInfoServlet() {
		super();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{  
		PrintWriter out = res.getWriter();  
		Connection con = ConnectionUtil.getConnection();

		res.setContentType("text/html");  
		out.println("<html><body>");  

		try 
		{  

			PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM Employees");
			ResultSet rs = preparedStatement.executeQuery();

			out.println("<table border=1 width=50% height=50%>");  
			out.println("<tr><th>First Name</th><th>Last Name</th><th>Employee ID</th><th>Country</th><th><font color=red>Pending Requests</font color></th></tr>");  
			while (rs.next()) 
			{  
				String n = rs.getString("FirstName");  
				String nm = rs.getString("LastName");  
				int s = rs.getInt("EmpID");
				String c = rs.getString("Country");
				String pr = rs.getString("PendingRequests");
				out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + c + "</td><td>" + pr + "</td></tr>");   
			}  
			out.println("</table>");  
			out.println("</html></body>");  
			con.close();  
		}  
		catch (Exception e) 
		{  
			out.println("Error displaying employee data");  
		}  
	}  

}
