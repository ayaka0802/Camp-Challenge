<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	ArrayList<String> list = new ArrayList<String>();
list.add(Taro());
list.add(Hanako());
list.add(Aya());
for (int i = 0; i < list.size(); i++) {
	if ( list.get(i) == null) {
		continue;
	}
	out.print(list.get(i));
}
%>
<%!
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
		String add = null;
		if(add == null){
			return null;
		}
		return name + birth + add;
	}

	String Aya() {
		int id = 3;
		String name = "あや";
		String birth = "１９９３年８月２日";
		String add = "東京都";
		return name + birth + add;
	}
	%>



</body>
</html>