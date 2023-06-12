<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="processUpdateProfile" modelAttribute="user" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">ID:</span>
            <input name="userid" value="${ user.userid }"  required>
          </div>
          <div class="input-box">
            <span class="details"></span>
            
          </div>
        <div class="button">
          <input type="submit" value="update">
        </div>
      </form>
</body>
</html>