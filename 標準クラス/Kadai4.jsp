<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.* , java.text.* , java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 11, 31, 23, 59, 59);
		Date calpast = cal.getTime();
		
		
		Calendar cal2 = Calendar.getInstance();
		cal.set(2015, 0, 1, 0, 0, 0);
		Date calpast2 = cal.getTime();
		
		
		long x =calpast.getTime();
		long y =calpast2.getTime();
		
		
		out.print(x-y);
		 
	%>

</body>
</html>