<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> ADD COMMENT </title>
    <link rel="stylesheet" type="text/css" href="/company-manage/resources/css/my-style-sheet.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">ADD COMMENT</div>
    <div class="content">
      <form action="processAddComment" modelAttribute="project" method="Post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">ID:</span>
            <input name="p_id" value="${project.p_id }"  required>
          </div>
          <div class="input-box">
            <span class="details"></span>
            
          </div>
          <div class="input-box">
            <span class="details">Comment</span>
            <input name="p_comment" value="${project.p_comment } " required>
          </div>

          
        <div class="button">
          <input type="submit" value="ADD COMMENT">
        </div>
      </form>
    </div>
  </div>

</body>
</html>