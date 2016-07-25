<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="org.camp.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題５</title>
</head>
<body>
	<%
		/**5．以下の機能を実装してください。
		
		名前・性別・趣味を入力するページを作成してください。
		また、入力された名前・性別・趣味を記憶し、次にアクセスした際に
		記録されたデータを初期値として表示してください。
		 */

			HttpSession hs = request.getSession();

	%>

	<form action="Kadai5" method="post">
	
			
<FONT size="5" color="teal">名前：</FONT><input type="text" name="namae" value="<%=hs.getAttribute("name") %>"> 
		<br>
		<FONT size="5" color="teal">性別：女</FONT><input type="radio" name="gen" value="female" <%=hs.getAttribute("female") %>>
		<FONT size="5" color="teal"> 男</FONT><input type="radio" name="gen" value="male" <%=hs.getAttribute("male") %>> 
		 <br>
		<FONT size="5" color="teal">趣味:</FONT><textarea name="mulText" ><%=hs.getAttribute("text") %></textarea>
		<input type="submit" value="送信">
	</form>



	
</body>
</html>