<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-2.0.3.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table border="1px" width="300px">
		<thead>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>sex</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${page.results}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.sex}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a>共${page.totalRecord}页</a>
	</div>
</body>
</html>