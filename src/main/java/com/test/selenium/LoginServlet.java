package com.test.selenium;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {
	final Logger logger = (Logger) LoggerFactory.getLogger(LoginServlet.class);

try
{	    
	logger.debug("Getting the bean properties");
     UserBean user = new UserBean();
     logger.debug("Getting the bean properties username");
     user.setUserName(request.getParameter("username"));
     logger.debug("Getting the bean properties password");
     user.setPassword(request.getParameter("password"));

    // user = UserDAO.login(user);
	   		    
     if (user.getUsername().equalsIgnoreCase("Govind") && user.getPassword().equalsIgnoreCase("Singh"))
     {
    	 logger.debug("Validate the login Valid");
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user); 
          response.sendRedirect("userLogged.jsp"); //logged-in page      		
     }
	        
     else 
    	 logger.debug("Validate the login invalid");
          response.sendRedirect("invalidLogin.jsp"); //error page 
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}
