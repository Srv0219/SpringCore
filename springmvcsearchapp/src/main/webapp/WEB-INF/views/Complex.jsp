<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-4">
		<div class="card">
			<div class="card-body ">
			<h3 class="text-center"> Form</h3>
				<form action="handleform" method="post">
                  <div class="alert alert-danger" role="alert">
                       <form:errors path="student.*"></form:errors>
                    </div>
						<label for="validationDefault01">First name</label> <input
							name="fname" type="text" class="form-control"
							id="validationDefault01" placeholder="First name" value="Mark"
							required>
					
					
						<label for="validationDefault02">Last name</label> <input
							name="lname" type="text" class="form-control"
							id="validationDefault02" placeholder="Last name" value="Otto"
							required>
					
					
						<label for="validationDefaultUsername">Username</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text" id="inputGroupPrepend2">@</span>
							</div>
							<input name="uname" type="text" class="form-control"
								id="validationDefaultUsername" placeholder="Username"
								aria-describedby="inputGroupPrepend2" required>
						</div>

                    <div class="card">
                    <div class="card-body">
					<div class="form-group">
					<h5>Address</h5>
					
						<label for="validationDefault03">City</label> <input name="address.city"
							type="text" class="form-control" id="validationDefault03"
							placeholder="City" required>
					
					
						<label for="validationDefault04">State</label> <input name="address.state"
							type="text" class="form-control" id="validationDefault04"
							placeholder="State" required>
					
					
						<label for="validationDefault05">Zip</label> <input name="address.zip"
							type="number" class="form-control" id="validationDefault05"
							placeholder="Zip" required>
							
					</div>
					</div>
					</div>
					<button class="btn btn-primary" type="submit">Submit form</button>
				</form>
			</div>
		</div>

	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>