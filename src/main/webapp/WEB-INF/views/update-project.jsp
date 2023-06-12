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
      <form action="processUpdateProject" modelAttribute="project" method="Post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">ID:</span>
            <input name="p_id" type="text" value="${project.p_id }"placeholder="Enter your id" required>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input name="p_name" type="text" value="${project.p_name }" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">Comment</span>
            <input name="p_comment" type="text" value="${project.p_comment }" placeholder="Enter your city" required>
          </div>
        
        <div class="button">
          <input type="submit" value="Update">
        </div>
      </form>
    </div>
  </div>

</body>
</html>