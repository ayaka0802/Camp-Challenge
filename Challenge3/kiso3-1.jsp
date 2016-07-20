<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!//課題１
	String name() {
		return "彩夏";
	}

	String birth() {
		return "1993年8月2日";
	}

	String syoukai() {
		return "東京都出身です";
	}
%>
<%
	
	for(int i = 0;i<10;i++){
		out.println(name() + "<br>");
		out.println(birth() + "<br>");
		out.println(syoukai() + "<br>");
	}%>

</body>
</html>