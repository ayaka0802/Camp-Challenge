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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Kadai9
 */
@WebServlet("/Kadai9")
public class Kadai9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession hs = request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Connection db_con =null;
		PreparedStatement db_st =null;
		ResultSet db_data = null;

		
		
		try{
			
			request.setCharacterEncoding("UTF-8");
			String ID= request.getParameter("ID");
			String name = request.getParameter("name");
			String tell = request.getParameter("tell");
			String age = request.getParameter("age");
			String birth = request.getParameter("birth");
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
			db_st = db_con.prepareStatement("insert into profiles(profilesID,name,tell,age,birthday)value(?,?,?,?,?)");
			int ID2 =Integer.parseInt(ID);
			int age2 =Integer.parseInt(age);
			
			db_st.setInt(1, ID2);
			db_st.setString(2, name);
			db_st.setString(3, tell);
			db_st.setInt(4, age2);
			db_st.setString(5, birth);
			
			int i =db_st.executeUpdate();
			out.print(i);
			
			
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
