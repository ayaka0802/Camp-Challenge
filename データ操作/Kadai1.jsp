<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import ="javax.servlet.http.Cookie ,java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題１</title>
</head>
<body>


	<%
		/*１．以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
		・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）
		*/
		
	%>

	<form action="./Kadai2.jsp" method="post">
		名前：<input type="text" name="名前">
		性別：女<input type="radio" name="性別">
		男<input type="radio" name="性別">
		趣味：<textarea name="趣味"></textarea>
		  <input type="submit" value="送信">
		
		
		 </form>
</body>
</html>