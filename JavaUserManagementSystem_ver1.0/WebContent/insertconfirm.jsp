<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
    HttpSession hs = request.getSession();
UserDataBeans UDB = (UserDataBeans) hs.getAttribute("UDB");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <!-- 課題４ 未入力がない時-->
    <% if(UDB.isCheck()==true){ %>
        <h1>登録確認</h1>
        名前:<%= UDB.getName() %><br>
        生年月日:<%= UDB.getYear() %>年<%= UDB.getMonth() %>月<%= UDB.getDay() %>日<br>
        種別:<%= UDB.getTypehyouji() %><br>
        電話番号:<%= UDB.getTell() %><br>
        自己紹介:<%= UDB.getComment() %><br>
        上記の内容で登録します。よろしいですか？
        <form action="InsertResult" method="POST">
          <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
            </form>
           
        <!-- 課題４　未入力があったとき -->
    <% }else{ %>
        <h1>入力が不完全です</h1>
       <% if("".equals(UDB.getName())){ %>
       	名前が未入力です。<br>
       <% }if(UDB.getYear()==0){ %>
    	生年月日の年が未入力です。<br>
    <% }if(UDB.getMonth()==0){ %>
    	生年月日の月が未入力です。<br>
    	<%}if(UDB.getDay()==0){ %>
    	生年月日の日が未入力です。<br>
    	<%}if("".equals(UDB.getTell())){ %>
    	電話番号が未入力です。<br>
    	<%}if("".equals(UDB.getComment())){ %>
    	自己紹介が未入力です。<br>
    <%}} %>
        <form action="Insert" method="GET">
        <input type="hidden" name="modoru"  value="modoru"%>
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <!-- トップページへ戻る -->
        <%= JumsHelper.getInstance().home()%>
    </body>
</html>
