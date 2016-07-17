
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.serialize.Printer;

import java.util.Random;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String luckList[] = {"大吉","中吉","小吉","吉","半吉","末小吉","凶","小凶","半凶","中凶","大凶"};
		//乱数クラス生成
		Random rand = new Random();
		//乱数取得
		Integer index = rand.nextInt(luckList.length);
		
		
		try{
			out.println("<!DOCTYPE heml>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>本日の運勢</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>今日のあなたの運勢は、"+ luckList[index] + "です。</p>");
			out.println("</body>");
			out.println("</html>");
			
		}finally
		{
		
		}

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
