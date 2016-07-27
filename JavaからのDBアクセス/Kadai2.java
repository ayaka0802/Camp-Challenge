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

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class Kadai2
 */
@WebServlet("/Kadai2")
public class Kadai2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai2() {
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
		{//課題２
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
			db_st = db_con.prepareStatement("serect * from profiles");
			String sql="insert into profiles(profilesID,name,tell,age,birthday)VALUES(5,'高橋 清','090-9900-1234',24,'2000-12-24')";
			int result = db_st.executeUpdate(sql);
			
			
			
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
