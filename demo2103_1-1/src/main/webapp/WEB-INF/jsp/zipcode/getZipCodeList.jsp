<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map" %>
<%
	List<Map<String,Object>> zipList =
	(List<Map<String,Object>>)request.getAttribute("zipList");
	int size = 0;
	if(zipList !=null){
		size = zipList.size();
	}
	out.print("�鿣�忡�� �Ѿ�� ���� ũ�� "+size);
	out.print("<br>");
	out.print("�鿣�忡�� �Ѿ�� ����"+zipList);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>