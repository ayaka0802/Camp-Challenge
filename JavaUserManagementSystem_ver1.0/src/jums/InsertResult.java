package jums;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jums.UserDataBeans;

/**
 * insertresultと対応するサーブレット
 * フォームから入力された値をセッション経由で受け取り、データベースにinsertする
 * 直接アクセスした場合はerror.jspに振り分け
 * @author hayashi-s
 */
@WebServlet("/InsertResult")
public class InsertResult extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	  //セッションスタート
        HttpSession session = request.getSession();
        UserDataBeans UDB = (UserDataBeans) session.getAttribute("UDB");
        
        try{ //課題２　不正なアクセス防止
        	 request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
             String accesschk = request.getParameter("ac");
             if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
                 throw new Exception("不正なアクセスです");
                 }
               
            //ユーザー情報に対応したJavaBeansオブジェクトに格納していく
            UserDataDTO userdata = new UserDataDTO();
            userdata.setName(UDB.getName());
            Calendar cal = Calendar.getInstance(); 
            cal.set(UDB.getYear(),UDB.getMonth()-1,UDB.getDay());//課題６　入力された情報をDate型に変換
            Date birthday=new Date(cal.getTimeInMillis());
            userdata.setBirthday(birthday);
            userdata.setType(Integer.parseInt(UDB.getType()));
            userdata.setTell(UDB.getTell());
            userdata.setComment(UDB.getComment());
            //DBへデータの挿入
            UserDataDAO .getInstance().insert(userdata);
            request.getRequestDispatcher("/insertresult.jsp").forward(request, response);
        }catch(Exception e){
            //データ挿入に失敗したらエラーページにエラー文を渡して表示
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	doGet(request,response);
    	
    }
}
    

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

