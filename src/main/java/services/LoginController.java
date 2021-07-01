package services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String un = request.getParameter("username");
    String pw = request.getParameter("password");

//Connect to Oracle SQL and verify username password

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
//loads driver
        Connection c = ConnectionUtil.getConnection();
        PreparedStatement ps = c.prepareStatement("select username, pass_word from Employee where username=? and pass_word=?");
        ps.setString(1, un);
        ps.setString(2, pw);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            response.sendRedirect("success.html");
            return;
        }
        response.sendRedirect("error.html");
        return;
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}

}
