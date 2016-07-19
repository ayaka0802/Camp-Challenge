package org.camp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import org.camp.ResultData;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		final String result = "/WEB-INF/jsp/FortuneTellingResult.jsp";
		String luckList[] = { "大吉", "中吉", "小吉", "吉", "半吉", "末小吉", "凶", "小凶", "半凶", "中凶", "大凶" };
		// 乱数クラス生成
		Random rand = new Random();
		// 乱数取得
		Integer index = rand.nextInt(luckList.length);

		ResultData data = new ResultData();
		data.setD(new Date());
		data.setLuck(luckList[index]);

		request.setAttribute("DATA", data);
		RequestDispatcher rd = request.getRequestDispatcher(result);
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
