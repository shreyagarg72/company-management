<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="p-3 mb-2 bg-info text-dark">

	
	<h1 align="center"> THE ADMIN DETAILS ARE HERE</h1>
	<div>
		<form action="showAddProjectPage" method="GET">
			<input type="submit" value="add">
		</form>
	</div>
	<br>

	<div align="center" class="p-3 mb-2 bg-info text-dark">
		<!-- students -->
		<table border="1px solid black" class="table table-striped  table-primary">
			<thead class="table-secondary">
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Reporter</td>
					<td>Assignee</td>
					<td>Progress</td>
					<td>Priority</td>
					<td>Level</td>
					<td>Add Comment</td>
					<td>Comment link</td>
					<td>Delete link</td>
				</tr>
			</thead>


			<c:forEach var="project" items="${project}">
				<tr>
					<td>${project.p_id}</td>
					<td>${project.p_name}</td>
					<td>${project.p_reporter}</td>
					<td>${project.assignee}</td>
					<td class="operation">${project.p_progress }<a
						href="updateProgress?p_id=${project.p_id}">Edit</a></td>
					<td class="operation">${project.p_priority }<a
						href="updatePriority?p_id=${project.p_id}">Edit</a></td>
					<td class="operation">${project.p_level }<a
						href="updateLevel?p_id=${project.p_id}">Edit</a></td>
					<td>${project.p_comment }</td>
					<td class="operation"><a
						href="updateProject?p_id=${project.p_id}">Update</a></td>
						<td class="operation"><a
						href="deleteProject?p_id=${project.p_id}">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>

</html>