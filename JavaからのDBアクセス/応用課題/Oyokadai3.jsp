<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ page import ="java.util.ArrayList" 
    import="org.camp.OyoKadaibean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>
<%HttpSession hs = request.getSession(); 
ArrayList<OyoKadaibean> list = (ArrayList<OyoKadaibean>)hs.getAttribute("list");
%>
商品一覧
<br>
<table>
<tr>
<th>商品番号 </th> 
<th>名前　</th>
<th>値段　</th>
</tr>
<% for(int i = 0;  i <list.size(); i++){ %>
<tr>
<th><%= list.get(i).getId()%>
</th>
<th><%= list.get(i).getName() %>
</th>
<th><%= list.get(i).getNedan() %>
</th>
</tr>
<% }
%>

</table>

<input type="button" value="登録ページへ戻る" 
		onclick="location.href='http://localhost:8080/JAVASQL/OyoKadai2.jsp'">



</body>
</html>