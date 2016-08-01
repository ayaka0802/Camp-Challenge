package jums;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jums.UserDataBeans;

/**
 * insertconfirm.jspと対応するサーブレット
 * フォーム入力された情報はここでセッションに格納し、以降持ちまわることになる
 * 直接アクセスした場合はerror.jspに振り分け
 * @author hayashi-s
 */
@WebServlet("/InsertConfirm")
public class InsertConfirm extends HttpServlet {
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
    	try{
            HttpSession session = request.getSession();
            request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
            String accesschk = request.getParameter("ac");
            if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
                throw new Exception("不正なアクセスです");
            }
            
            UserDataBeans UDB = new UserDataBeans();
            
            //フォームからの入力を取得
            String name = request.getParameter("name");
            String year = request.getParameter("year");
            String month = request.getParameter("month");
            String day = request.getParameter("day");
            String type = request.getParameter("type");
            String tell = request.getParameter("tell");
            String comment = request.getParameter("comment");
            
           //生年月日が未入力の場合
            if(year.equals("")){
            	year="0";
            }
            if(month.equals("")){
            	month="0";
            }
            if(day.equals("")){
            	day="0";
            }
            
            //beansに入れる
            UDB.setName(name);
            UDB.setYear(year);
            UDB.setMonth(month);
            UDB.setDay(day);
            UDB.setType(type);
            UDB.setTell(tell);
            UDB.setComment(comment);
            UDB.setTypehyouji(type);
            
            session.setAttribute("UDB", UDB);
            
            if(type.equals("1")){
    			session.setAttribute("1", "checked");
    			session.setAttribute("2", "");
    			session.setAttribute("3", "");
    		}else if(type.equals("2")){
    			session.setAttribute("2", "checked");
    			session.setAttribute("1", "");
    			session.setAttribute("3", "");
    		}else if(type.equals("3")){
    			session.setAttribute("3", "checked");
    			session.setAttribute("1", "");
    			session.setAttribute("2", "");
    			
    		}
            
            request.getRequestDispatcher("/insertconfirm.jsp").forward(request, response);
        }catch(Exception e){
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