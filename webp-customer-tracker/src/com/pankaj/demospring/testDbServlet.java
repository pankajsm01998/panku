package com.pankaj.demospring;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class testDbServlet
 */
@WebServlet("/testDbServlet")
public class testDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pass="springstudent";
		String user="springstudent";
		
		String jdbcurl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String driver ="com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database... "+ jdbcurl);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcurl,user, pass);
			out.println("\nSUCCESS...!");
			myConn.close();
			
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
