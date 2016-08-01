<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
    HttpSession hs = request.getSession();
UserDataBeans UDB = (UserDataBeans) session.getAttribute("UDB");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
      
        <h1>登録結果</h1><br>
        名前:<%= UDB.getName()%><br>
        生年月日:<%= UDB.getYear()+"年"+UDB.getMonth()+"月"+UDB.getDay()+"日"%><br>
        種別:<%= UDB.getTypehyouji() %><br>
        電話番号:<%= UDB.getTell() %><br>
        自己紹介:<%= UDB.getComment()%><br>
        以上の内容で登録しました。<br>
        
      
        <%= JumsHelper.getInstance().home() %>
        <!-- 課題７　セッションを破棄 -->
        <% session.invalidate(); %>
    </body>
</html>