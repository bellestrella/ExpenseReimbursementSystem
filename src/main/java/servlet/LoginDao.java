package servlet;
import models.Employee;
import services.ConnectionUtil;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * @author Belle
 *
 */
public class LoginDao {

    /**
     * @param emp
     * @return
     * @throws ClassNotFoundException
     * Validate will confirm wether the credentials passed are in fact in the
     * database table acquired from the connection
     */
    public boolean validate(Employee emp) throws ClassNotFoundException {
        boolean status = false;
        Connection con = ConnectionUtil.getConnection();

        try {
        	int index = 0;
        	PreparedStatement preparedStatement = con.prepareStatement("SELECT username FROM Login where username = ? and pass_word = ? ");
            // The integers correspond to the question marks in the query
        	preparedStatement.setString(++index, emp.getUsername());
            preparedStatement.setString(++index, emp.getPassWord());
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {

        	e.printStackTrace();
        }
        return status;
    }
}