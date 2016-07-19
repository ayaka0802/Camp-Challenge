<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	   String joho(int ID) {
		switch (ID) {
		case 1:
			String Taro = Taro();
			 return Taro;
		case 2:
			String Hanako = Hanako();
			 return Hanako;
		case 3:
			String Aya = Aya();
			 return Aya;
			
		}
	}

	String Taro() {
		int id = 1;
		String name = "太郎";
		String birth = "２０００年１月１日";
		String add = "東京都";
		return name + birth + add;
	}

	String Hanako() {
		int id = 2;
		String name = "花子";
		String birth = "１９９９年２月１日";
		String add = "神奈川県";
		return name + birth + add;
	}

	String Aya() {
		int id = 3;
		String name = "あや";
		String birth = "１９９３年８月２日";
		String add = "東京都";
		return name + birth + add;
	}%>
	<%
		out.print(joho(2));
	%>
</body>
</html>