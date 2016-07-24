<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,java.text.*,java.io.*" %>
<%
//同じ階層にあるファイルをオープン
File txt = new File("/Users/ayaka/Documents/test");

//読み込みモードでオブジェクト生成
FileWriter fw = new FileWriter(txt);

fw.write("西澤彩夏です。２２歳で東京都出身です");

fw.close();
//読み込み用にバッファリング(高速化)
FileReader fr = new FileReader(txt);
//一行読み込みして表示
BufferedReader br = new BufferedReader(fr);
out.print(br.readLine());

//ファイルクローズ
fr.close();
%>