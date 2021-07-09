package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import models.Employee;
import services.ConnectionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static Logger logger = LogManager.getLogger(LoginServlet.class);
	

	private static final long serialVersionUID = 1L;
	//private LoginDao loginDao;

	public LoginServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.html").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		// The values inside the strings need to match the inputs in the login.html file
		String username = request.getParameter("username");
		String password = request.getParameter("pass_word");
		
		System.out.println(username);
		System.out.println(password);

		Employee emp = new Employee();
		LoginDao ld = new LoginDao();

		emp.setUsername(username);
		emp.setPassWord(password);

		//.info does not display anything to the console

		logger.info("Attempting to validate credentials.......");

		try {
			if (ld.validate(emp)) {
				response.sendRedirect("employeeHomepage.html");
				logger.info("Credentials validated.... ");
			} else {
				response.sendRedirect("failure.html");
				logger.error("Credentias are incorrent, user must re-attempt to proceed.");
				
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}



}
