<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Update Priority</title>
    <link rel="stylesheet" type="text/css" href="/company-manage/resources/css/my-style-sheet.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Update Priority</div>
    <div class="content">
      <form action="processPrior" modelAttribute="project" method="Post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">ID:</span>
            <input name="p_id" type="text" value="${project.p_id }" required>
          </div>
          </div>
          <div class="gender-details">
          <input type="radio"  name="p_priority" value="HIGH" id="dot-1">
          <input type="radio"  name="p_priority" value="MEDIUM" id="dot-2">
          <input type="radio"  name="p_priority" value="LOW" id="dot-3">
          <span class="gender-title">Priority</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">HIGH</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">MEDIUM</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">LOW</span>
            </label>
          </div>
        </div>
          <div class="gender-details">
          <input type="radio"  name="p_level" value="DIFFICULLT" id="dot-1">
          <input type="radio"  name="p_level" value="MEDIOCRE" id="dot-2">
          <input type="radio"  name="p_level" value="EASY" id="dot-3">
          <span class="gender-title">Level</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">DIFFICULT</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">MEDIOCRE</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">EASY</span>
            </label>
          </div>
        </div>
        <div class="gender-details">
          <input type="radio"  name="p_progress" value="TO-DO" id="dot-1">
          <input type="radio"  name="p_progress" value="IN-PROGRESS" id="dot-2">
          <input type="radio"  name="p_progress" value="COMPLETE" id="dot-3">
          <span class="gender-title">Progress</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">TO-DO</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">IN-PROGRESS</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">COMPLETE</span>
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