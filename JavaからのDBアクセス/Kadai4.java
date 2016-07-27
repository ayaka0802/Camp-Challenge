package org.camp;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 * Servlet implementation class Kadai4
 */
@WebServlet("/Kadai4")
public class Kadai4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Connection db_con =null;
		PreparedStatement db_st =null;
		ResultSet db_data = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
			
			db_st = db_con.prepareStatement("select * from profiles");
			
			db_data =db_st.executeQuery();
			db_data.next();
				int profilesID = db_data.getInt("profilesID");
				out.print(profilesID);
				out.print("<br>");
			String name =db_data.getString("name");
			out.print(name);
			out.print("<br>");
			String tell =db_data.getString("tell");
			out.print(tell);
			out.print("<br>");
			int age =db_data.getInt("age");
			out.print(age);
			out.print("<br>");
			String birthday =db_data.getString("birthday");
			out.print(birthday);
			out.print("<br>");
			
			 
			
			db_data.close();
			db_con.close();
			db_st.close();
			
			
		
		}catch (SQLException e_sql){
			out.println("接続時にエラーが発生しました。"+e_sql.toString());
		}catch(Exception e){
			out.println("接続時にエラーが発生しました"+e.toString());
		}finally{
			if(db_con != null){
				try{
					db_con.close();
				}catch(Exception e_con){
					System.out.println(e_con.getMessage());
				}
			}
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
