<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
HttpSession hs = request.getSession();
int year=0;
int month=0;
int day=0;

String modoru = request.getParameter("modoru");
if(modoru !=null){
	UserDataBeans UDB = (UserDataBeans) session.getAttribute("UDB");
	 year = UDB.getYear();
	 month = UDB.getMonth();
	 day = UDB.getDay();
}
	
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="InsertConfirm" method="GET">
    <!-- 課題５　値の維持 -->
        名前:
        <input type="text" name="name" value="${UDB.getName()}">
        <br><br>

        生年月日:　
        <select name="year">
        <%if(year==0){ %>
            <option value="">----</option>
          <% }else{ %>
        	  <option value="<%=year%>"><%=year%></option>
         <% } for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%>  </option>
            <%} %>
        </select>年
        
        <select name="month">
        <%if(month==0){ %>
              <option value="">--</option>
             <%}else{ %> 
             <option value="<%=month%>"><%=month%></option>
           <%} for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"><%=i%></option>
               <%} %>
        </select>月
        
        <select name="day">
        <%if(day==0){ %>
            <option value="">--</option>
            <%}else{ %>
            <option value="<%=day%>"><%=day%></option>
            <% }for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
          <% }%>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1" <%=hs.getAttribute("1")%>>エンジニア<br>
        <input type="radio" name="type" value="2" <%=hs.getAttribute("2") %>>営業<br>
        <input type="radio" name="type" value="3" <%=hs.getAttribute("3") %>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" value="${UDB.getTell()}">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard" value="">${UDB.getComment()}</textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <!-- TOPページへ戻る -->
        <%= JumsHelper.getInstance().home() %>
    </body>
</html>
