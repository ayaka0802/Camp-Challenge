package org.camp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Oyokadai3
 */
@WebServlet("/Oyokadai3")
public class Oyokadai3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oyokadai3() {
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
		ArrayList<OyoKadaibean> list = new ArrayList<OyoKadaibean>();
		
		
		try{
			
			request.setCharacterEncoding("UTF-8");
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Kadai","root","root");
			db_st = db_con.prepareStatement("select * from Syouhin");
			
			db_data =db_st.executeQuery();
			while(db_data.next()){
				String ID = db_data.getString("syouhinID");
				hs.setAttribute("ID", ID);
			String name =db_data.getString("syouhinName");
				hs.setAttribute("name",name);
			String nedan =db_data.getString("nedan");
				hs.setAttribute("nedan",nedan);
			
				list.add(new OyoKadaibean(ID,name,nedan));
			}
			hs.setAttribute("list", list);
			
			request.getRequestDispatcher("/Oyokadai3.jsp").forward(request,response);
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
