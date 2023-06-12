<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsive Update Form </title>
    <link rel="stylesheet" type="text/css" href="/company-manage/resources/css/my-style-sheet.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Update</div>
    <div class="content">
      <form action="processUpdate" modelAttribute="user" method="Post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">ID:</span>
            <input name="userid" type="text" value="${user.userid }"placeholder="Enter your id" required>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input name="username" type="text" value="${user.username }" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input name="u_city" type="text" value="${user.u_city}" placeholder="Enter your city" required>
          </div>

          <div class="input-box">
            <span class="details">Password</span>
            <input name="userpass" type="text" value="${user.userpass}" placeholder="Enter your password" required>
          </div>
        </div>
        <div class="gender-details">
          <input type="radio"  name="u_gender" value="${user.u_gender}" id="dot-1">
          <input type="radio"  name="u_gender" value="${user.u_gender}" id="dot-2">
          <input type="radio"  name="u_gender" value="${user.u_gender}" id="dot-3">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">Prefer not to say</span>
            </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Update">
        </div>
      </form>
    </div>
  </div>

</body>
</html>