package com.msp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msp.model.MSPModel;

/**
 * Servlet implementation class LoginUser
 */
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		
		System.out.println("User name is: "+userName);
		System.out.println("Password is: "+password);
		
		String result= MSPModel.loginUser(userName, password);
		
		RequestDispatcher rd= null;
		
		if(result.equalsIgnoreCase("success"))
		{
			rd= request.getRequestDispatcher("demo.php");
		}
		else
		{
			rd= request.getRequestDispatcher("index.php");
		}
		
		rd.forward(request, response);
	}

}
