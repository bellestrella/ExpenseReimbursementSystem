package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Employee;

public class ViewInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //private LoginDao loginDao;

    public ViewInfoServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	request.getRequestDispatcher("/employeeInfo.html").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	PrintWriter pw = response.getWriter(); //get the stream to write the data
    	response.setContentType("text/html");
    	pw.println("<html><body>");  
		pw.println("This is your information:");
		pw.println("</body></html>"); 
    	
    }
    
}
