<%@page contentType="text/html" pageEncoding="UTF-8"
	import="java.util.*,java.text.*,java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//開始時間
		Date date = new Date();
		Long sdate = date.getTime();

		File txt = new File("/Users/ayaka/Documents/test");
		FileWriter fw = new FileWriter(txt);

		fw.write(new Date(sdate) + "  start<br>");

		fw.close();

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "フシギダネ");
		map.put(2, "フシギソウ");
		map.put(3, "フシギバナ");
		map.put(4, "ヒトカゲ");
		map.put(5, "リザート");
		map.put(6, "リザードン");
		map.put(7, "ゼニガメ");
		map.put(8, "リザードン");
		map.put(9, "ゼニガメ");
		map.put(10, "カメール");
		map.put(11, "カメックス");
		//map.put(025, "ピカチュウ");

		FileWriter  fw2= new FileWriter(txt,true);
		for (int i = 1; i <= map.size(); i++){
			fw2.write("ナンバー"+String.format("%1$03d", i)+"のポケモンは" + map.get(i) + "<br>");
		}
		//終了時間
		Date date2 = new Date();
		Long sdate2 = date2.getTime();
		//追記書き込み
		fw2.write(new Date(sdate2) + "  end");
		//追記クローズ
		fw2.close();

		FileReader fr2 = new FileReader(txt);
		BufferedReader br2 = new BufferedReader(fr2);
		out.print(br2.readLine());

		fr2.close();
	%>
</body>
</html>