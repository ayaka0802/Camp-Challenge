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
		//基礎課題１
		out.print("Hello world.<br>");
		//基礎課題２
		out.print("groove" + "-" + "gear<br>");
		//基礎課題３
		String name = "Ayaka";
		int age = 22;
		out.print("私の名前は" + name + "です。<br>");
		out.print("年齢は" + age + "歳です。<br>");
		//基礎課題４
		int x = 5;
		final int y = 4;
		int tasi = x + y;
		int hiki = x - y;
		int kake = x * y;
		int wari = x / y;
		int amari = x % y;
		//基礎課題５
		out.println(tasi);
		out.println(hiki);
		out.println(kake);
		out.println(wari);
		out.print(amari + "<br>");
		//基礎課題６
		int z = 8;
		if(z == 1){
			out.print("１です！<br>");
		}else if(z == 2){
			out.print("プログラミングキャンプ！<br>");
		}else{
			out.print("その他です！<br>");
		}
		
	%>
</body>
</html>