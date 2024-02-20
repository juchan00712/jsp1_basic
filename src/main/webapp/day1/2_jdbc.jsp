<%@page import="java.sql.Connection"%>
<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>
<%@page import="project.dao.TblCustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2_JDBC</title>
</head>
<body>
	<h3>모든 고객을 조회하여 출력하기</h3>
	<hr>
	<p>TBLCustomerDao 메소드로 db 접속 및 조회 결과 출력하는 연습이다. </p>
	
<% 

	TblCustomerDao dao = new TblCustomerDao();
	List<CustomerVo> list = dao.allCustomers();
%>
<table>
<%
	for(CustomerVo vo : list) {	
%>
	<tr>
		<td><%= vo.getCustomId()%></td>	
		<td><%= vo.getName()%></td>	
		<td><%= vo.getEmail()%></td>	
		<td><%= vo.getAge()%></td>	
		<td><%= vo.getReg_date()%></td>
	</tr>
<%
	}
%>
	
</table>
</body>
</html>