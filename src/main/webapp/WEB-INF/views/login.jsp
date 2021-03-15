<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/jsp_header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
</head>
<body>
	<div align="center" class="body">
		<h2>로그인 화면</h2>
		<form:form modelAttribute="member" method="post" action="login.html">
			<spring:hasBindErrors name="member">
				<font color="red"><c:forEach items="${errors.globalErrors}"
						var="error">
						<spring:message code="${error.code}" />
					</c:forEach></font>
			</spring:hasBindErrors>
			<table>
				<tr height="40px">
					<td>유저ID</td>
					<td><form:input path="memberId" cssClass="memberId" /> <font
						color="red"><form:errors path="memberId" /></font></td>
				</tr>
				<tr height="40px">
					<td>패스워드</td>
					<td><form:input path="memberPw" cssClass="memberPw" /> <font
						color="red"><form:errors path="memberPw" /></font></td>
				</tr>
			</table>
			<table>
				<tr>
					<td align="center"><input type="submit" value="로그인" /></td>
					<td align="center"><input type="reset" value="리셋" /></td>
				</tr>
			</table>

		</form:form></div>
</body>
</html>