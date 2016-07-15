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
		//商品種別
		String param1 = request.getParameter("syurui");

		switch (param1) {
		case "1":
			out.print("雑貨");
			break;
		case "2":
			out.print("生鮮食品");
			break;
		case "3":
			out.print("その他");
			break;

		}
		//総額
		String param2 = request.getParameter("sougaku");
		out.print(param2);
		//個数
		String param3 = request.getParameter("kosuu");
		//１個あたりの値段
		int x = Integer.parseInt("sougaku");
		int y = Integer.parseInt("kosuu");

		int nedan = x / y;
		out.print(nedan);
		
		//ポイント
		double point = 0;
		if (x >=5000){
			point = x * 0.05;
		}else if(x >=3000){
			point = x * 0.04;
		}
		out.print(point);
	%>

</body>
</html>