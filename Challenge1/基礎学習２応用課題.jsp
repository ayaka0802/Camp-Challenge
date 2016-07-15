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
		String param1 = request.getParameter("param1");
		 int x = Integer.parseInt(param1);
		

		out.println(x);
		int count =0;
		while (x % 2 == 0) {
			x /= 2;
			count++;
		}
		for(int i = 0; i<count ;i++){
			out.print(2 +" ");
		}
		
		int count2 =0;
		while (x % 3 == 0) {
			x /= 3;
			count2++;
		}
		for(int i = 0; i<count2 ;i++){
			out.print(3 +" ");
		}
		
		int count3 =0;
		while (x % 5 == 0) {
			x /= 5;
			count3++;
		}
		for(int i = 0; i<count3 ;i++){
			out.print(5 +" ");
		}
		int count4 =0;
		while (x % 7 == 0) {
			x /= 7;
			count4++;
			
		}
		for(int i = 0; i<count4 ;i++){
			out.print(7 +" ");
		}
		if(x>10){	
			
			out.println("その他");
		}

		
	%>

</body>
</html>