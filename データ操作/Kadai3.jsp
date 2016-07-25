<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "javax.servlet.http.Cookie ,java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>課題３</title>
</head>
<body>
<%

//３．クッキーに現在時刻を記録し、次にアクセスした際に、前回記録した日時を表示してください。

Date time = new Date();
Cookie c = new Cookie("LastLogin", time.toString());
response.addCookie(c);


Cookie cs[] = request.getCookies();
if (cs != null) {
    for (int i=0; i<cs.length; i++) {
        if (cs[i].getName().equals("LastLogin")) {
            out.print("最後のログインは、"+cs[i].getValue());
            break;
        }
    }
}


%>

</body>
</html>