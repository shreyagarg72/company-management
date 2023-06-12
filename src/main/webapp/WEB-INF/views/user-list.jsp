<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/company-manage/resources/css/userslist.css">
</head>
<body>
<h1 "align:center" style="
    padding-top: 10px;
    padding-bottom: -30px;">VIEW OTHER USERS</h1>
<div style="
    padding-top: -100px;"class="d-flex flex-column justify-content-center w-100 h-100">
	<div align="center" class="box">
		<!-- students -->
		<table border="1px solid black" class="table">
			<tr>

				<th>ID</th>

				<th>Name</th>

				<th>City</th>

				<th>Gender</th>

				

			</tr>

			<c:forEach var="user" items="${user}">
				<tr>
					<td>${user.userid}</td>
					<td>${user.username}</td>
					<td>${user.u_city}</td>
					<td>${user.u_gender}</td>                                                                      
					<!-- <td><a href="updateUser/${user.userid }">Update</a></td> -->
					


				</tr>
			</c:forEach>

		</table>
	</div>
	</div>
</body>

</html>