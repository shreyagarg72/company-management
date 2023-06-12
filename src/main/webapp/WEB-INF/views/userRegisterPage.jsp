<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsive Registration Form </title>
    <link rel="stylesheet" type="text/css" href="/company-manage/resources/css/my-style-sheet.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form action="save-user" modelAtrribute="user" method="GET">
        <div class="user-details">
          <div class="input-box">
            <span class="details">ID:</span>
            <input name="userid" type="text" placeholder="Enter your id" required>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input name="username" type="text" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input name="u_city" type="text" placeholder="Enter your city" required>
          </div>

          <div class="input-box">
            <span class="details">Password</span>
            <input name="userpass" type="text" placeholder="Enter your password" required>
          </div>
        </div>
        <div class="gender-details">
          <input type="radio"  name="u_gender" value="male" id="dot-1">
          <input type="radio"  name="u_gender" value="female" id="dot-2">
          <input type="radio"  name="u_gender" value="other" id="dot-3">
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
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>

</body>
</html>