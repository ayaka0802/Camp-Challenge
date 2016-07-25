<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import=" javax.servlet.http.HttpSession,java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題４</title>
</head>
<body>
	<%
	HttpSession hs = request.getSession(true);
	
	if(hs.getAttribute("LastLogin")!=null){
		out.print("最後のログインは、" + hs.getAttribute("LastLogin"));
	}
		Date time = new Date();
		hs.setAttribute("LastLogin", time.toString());

		
	%>

</body>
</html>