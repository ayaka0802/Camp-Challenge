<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  import = "javax.servlet.http.Cookie "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題２</title>
</head>
<body>

	<%
		/** ２．以下の機能を実装してください。
		　　　１で作成したHTMLの入力データを取得し、画面に表示する
		*/

		request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("名前");
	String gen = request.getParameter("性別");
	String hobby =request.getParameter("趣味");
	
	if(gen=="女"){
		gen ="女"; 
	}else{
		gen = "男";
	}
	if(name != null){
	out.print(name +"<br>"+ gen +"<br>" + hobby +"<br>");
	}
	
	
	
	%>
		
</body>
</html>