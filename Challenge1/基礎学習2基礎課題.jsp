<%@ page import="java.util.HashMap" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//課題１
		int num = 2;
		String message = "";
		switch (num) {
		case 1:
			message = "one";
			break;
		case 2:
			message = "two";
			break;
		case 3:
			message = "想定外";
		}
		out.print(message);

		//課題２
		String a = "A";
		String message2 = "";
		switch (a) {
		case "A":
			message2 = "英語";
		case "あ":
			message2 = "日本語";
		}
		out.print(message2);

		//課題３
		int x = 1;
		for (int i = 0; i < 20; i++) {
			x = x * 8;
		}
		//課題４
		String aa = "A";
		for (int j = 0; j < 30; j++) {
			out.print(aa);
		}
		//課題５
		int y = 0;
		for (int k = 0; k < 100; k++) {
			y = y + k;
		}

		//課題６
		int z = 1000;
		while (z > 100) {
			z = z / 2;
		}
		
		//課題７
		String kadai7[] ={"10", "100", "soeda", "hayashi", "-20", "118", "END"};
		kadai7[2]="33";
		
		//課題８
		HashMap<String,String> hMap=new HashMap<String,String>();
		hMap.put("1","AAA");
		hMap.put("hello","world");
		hMap.put("soeda","33");
		hMap.put("20","20");
		
	%>

</body>
</html>