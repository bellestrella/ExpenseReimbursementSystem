package projectone;

import static org.mockito.Mockito.*;
import java.io.*;
import javax.servlet.http.*;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import servlet.LoginServlet;

public class TestAssertionJava extends Mockito{

    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("username")).thenReturn("WizardHowl");
        when(request.getParameter("pass_word")).thenReturn("ilovesophie");

        StringWriter sw = new StringWriter();
        PrintWriter writer = new PrintWriter(sw);
        when(response.getWriter()).thenReturn(writer);

//        LoginServlet loginServlet = new LoginServlet();
        new LoginServlet().doPost(request, response);
//        loginServlet.doGet(request,response);
        String result = sw.getBuffer().toString().trim();
        assertTrue(sw.toString().contains("My expected string"));
        //assertEquals(result, new String("User validated"));
    }
}