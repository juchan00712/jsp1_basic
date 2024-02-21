<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>
<%@page import="project.dao.TblCustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>13_jdbc_jstl</title>
<style type="text/css">
	li {padding-bottom: 10px;}
	h3 {text-align: center;}
	p {text-align: center;}
	li {list-style: none;}
	td { border: 1px solid gray;  }
	fieldset {width: 400px; margin: auto; margin-bottom: 20px }
	
</style>
</head>
<body>
	<h3>2번 소스파일 스크립트릿과 출력식을 jstl과 el로 변경하기</h3>
	<hr>
<p>TBLCustomerDao 메소드로 db 접속 및 조회 결과 출력하는 연습이다. </p>
	
<% 

	TblCustomerDao dao = new TblCustomerDao();
	List<CustomerVo> list = dao.allCustomers();
	pageContext.setAttribute("list", list);
%>


	<c:forEach items="${list }" var="vo" varStatus="status">
<fieldset>	
	<ul>
		<td>
			<li><c:out value="${status.index + 1 }"/></li>
			<li><c:out value="${fn:toUpperCase(vo.customId) }"/></li>
			<li><c:out value="${vo.name }"/></li>
			<li><c:out value="${vo.email }"/></li>
			<li><c:out value="${vo.age }"/></li>
			<li><fmt:formatDate value = "${vo.reg_date }"
				 pattern="yyyy-MM-dd a hh:mm:ss"/></li>
		</td>
	</ul>
</fieldset>
	</c:forEach>
</body>
</html>