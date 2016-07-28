<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン成功</title>
</head>
<body>
ログインに成功しました。
<br>
<br>
<% String str=(String)request.getAttribute("touroku");
if(str==null){
	str=" ";
}
%>
<%=str %>
<br>
<br>
商品情報登録
<form action="Oyokadai2" method="post">
	 
		商品番号<input type="text" name="syouhinID">
		<br>
		名前<input type="text" name="syouhinName">
		<br>
		値段<input type="text" name="nedan">
		<br>
		<br>
		<input type="submit" value="入力">
		<input type="reset" value="クリア">
		<br>
		<br>
		<input type="button" value="商品一覧ページへ" 
		onclick="location.href='http://localhost:8080/JAVASQL/Oyokadai3'">
				
	</form>
<form action="OyoKadai4" method="post">
<input type="submit" value="ログアウト">
</form>
</body>
</html>