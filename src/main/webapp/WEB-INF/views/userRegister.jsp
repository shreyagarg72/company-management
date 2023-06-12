<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Signin</title>
<link rel="stylesheet" type="text/css" href="/company-manage/resources/css/stylesheet.css">
</head>
<body>

	<div class="outer-box">
		<div class="inner-box">
			<header class="signup-header">
				<h1 align="center">Login</h1>
				<p align="center">It just takes 30 seconds</p>
			</header>
			<main class="signup-body">
			
				<form action="process-login" method="post">
				<p>
						<label for="userid">Your ID:</label> <input type="text"
							name="userid" required/>
					</p>
					<p>
						<label for="cn">Your Name:</label> <input type="text"
							name="username" required/>
					</p>
					<p>
						<label for="pass">Your Password:</label> <input type="text"
							name="userpass" required/>
					</p>

					<p>
						<input type="submit" value="LOGIN">
					</p>
				</form>
			</main>

			<footer class="signup-footer">
				<p>
					If You are a New User <a href="registerMe">Register</a>
				</p>
				<p><a href="updateProfile">Update Profile</a></p>
			</footer>

		</div>
		<div class="circle c1"></div>
		<div class="circle c2"></div>
	</div>

</body>
</html>