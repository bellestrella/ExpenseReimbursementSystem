package projectone;

import static org.mockito.Mockito.*;
import java.io.*;
import java.sql.Connection;

import javax.servlet.http.*;
//import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.mockito.Mockito;


import services.ConnectionUtil;

import static org.junit.Assert.*;
import servlet.LoginServlet;

public class TestAssertionJava extends Mockito{

    @Test
    public void testConnection() throws Exception {
    	Connection con = ConnectionUtil.getConnection();
    	assertNotNull(con);
    }
}