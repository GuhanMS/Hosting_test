<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register</title>
<link rel="stylesheet" href="../css/Register.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
body {
	padding: 0px;
	margin: 0px;
}

section {
	background-color: #63738a;
	padding: 10px 100px;
}

form {
	background-color: #f2f3f7;
	width: 40%;
}

.container {
	display: flex;
	justify-content: center;
	align-items: center;
}

input {
	width: 100%;
}

#check {
	width: auto;
}

#foot {
	color: #fff;
}

#foot a {
	color: #fff;
	text-decoration: underline;
}

.btn {
	width: 100%;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="/">Automation Task</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/Login">Login</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/Register">Register</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/AllUsers">All
						User</a></li>
			</ul>
		</div>
	</nav>

	<!-- welcome ${name}  -->

	<section>
		<div class="container m-4">
			<form class="p-4" action="addData" method="post">
				<div>
					<h1 class="text-center">Register</h1>
					<p>Create your account. It's free and only takes a minute.</p>
				</div>
				<div class="form-group">
					<input type="text" placeholder=" Register ID" name="id"
						value="${student.id}">
				</div>
				<div class="form-group">
					<div class="row">
						<div class="col">
							<input type="text" placeholder="First Name" name="firstname"
								value="${student.firstname}">
						</div>
						<div class="col">
							<input type="text" placeholder="Last Name" name="lastname"
								value="${student.lastname}">
						</div>
					</div>
				</div>
				<div class="form-group">
					<input type="email" placeholder="Email" name="email"
						value="${student.email}">
				</div>
				<div class="form-group">
					<input type="password" placeholder="Password" name="password"
						value="${student.password}">
				</div>
				<!--  <div class="form-group">
                    <input type="password" placeholder="Confirm Password" name="">
                </div>  -->
				<div class="form-group">
					<label class="form-check-label"> <input id="check"
						type="checkbox">I accept the <a href="#">Terms of Use</a>
						& <a href="#">Privacy Policy</a>
					</label>
				</div>
				<div class="form-group text-center">
					<button class="btn btn-success" type="submit">Register</button>
				</div>
			</form>
		</div>
		<div id="foot" class="text-center">
			Already have an account? <a href="/Login">Sign In</a>
		</div>
	</section>
	
	${Useremail}
	
</body>
</html>