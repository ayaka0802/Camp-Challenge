<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.* , java.text.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//課題１
	Calendar cal = Calendar.getInstance();
	cal.set(2016,1,1,0,0,0);
	Date calpast = cal.getTime();
	out.print(calpast.getTime());
	
	

	
%>

</body>
</html>