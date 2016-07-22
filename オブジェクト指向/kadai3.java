package org.camp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class kadai3
 */
@WebServlet("/kadai3")
public class kadai3 extends HttpServlet {

		public String name = "";
		public int level = 0;

		public void setPokemon(String n, int l) {
			name = n;
			level = l;
		} 

		public void syuturyoku(){
			System.out.print(name);
			System.out.print("Lv" + level);
		}	        
	        
	        
	        
 /**
     * @see HttpServlet#HttpServlet()

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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
