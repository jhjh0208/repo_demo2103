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
	out.print("백엔드에서 넘어온 값의 크기 "+size);
	out.print("<br>");
	out.print("백엔드에서 넘어온 정보"+zipList);
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