<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String joho(int ID, String name, String birth, String add) {
		return name +birth + add;
	}

	Integer ID(){
		return 12345;
	}
String name(){
	return "太郎";
}
String birth(){
	return "２０００年１月１日";
}
String add(){
	return "東京都";
}
	%>
<%
out.print(joho(ID(),name(),birth(),add()));
%>
</body>
</html>