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
    padding-bottom: -30px;">User Projects List</h1>
<div style=" padding-top: -100px;"class="d-flex flex-column justify-content-center w-100 h-100">

	<div align="center" class="box">
		<!-- students -->
		<table border="1px solid black" class="table">
			
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Reporter</th>
					<th>Assignee</th>
					<th>Progress</th>
					<th>Priority</th>
					<th>Level</th>
					<th>Add Comment</th>

				</tr>
		


			<c:forEach var="project" items="${project}">
				<tr>
					<td>${project.p_id}</td>
					<td>${project.p_name}</td>
					<td>${project.p_reporter}</td>
					<td>${project.assignee}</td>
					<td>${project.p_progress}</td>
					<td>${project.p_priority}</td>
					<td>${project.p_level}</td>
					<td class="operation">${project.p_comment }<a
						href="addComment?p_id=${project.p_id}">Edit</a></td>
					
				</tr>
			</c:forEach>

		</table>
	</div>
	</div>
</body>

</html>