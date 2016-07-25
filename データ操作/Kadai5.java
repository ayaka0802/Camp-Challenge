package org.camp;

import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Kadai5
 */
@WebServlet("/Kadai5")
public class Kadai5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession hs = request.getSession();
		response.setContentType("text/html;charset=UTF-8");

		String name = request.getParameter("namae");
		hs.setAttribute("name", name);
		if (name == null) {
			name = "";
		}
		String gen = request.getParameter("gen");
		System.out.println(gen);
		System.out.println(request.getParameter("gen"));
		
		if(gen.equals("female")){
			hs.setAttribute("female", "checked");
			hs.setAttribute("male", "");
		}else if(gen.equals("male")){
			hs.setAttribute("male", "checked");
			hs.setAttribute("female", "");
		}
		System.out.println(hs.getAttribute("male"));
		System.out.println(hs.getAttribute("female"));
		

		String text = request.getParameter("mulText");
		hs.setAttribute("text", text);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/Kadai5.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
