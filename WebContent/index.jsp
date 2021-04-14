<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="all_Component/allComponent.jsp"%>
<title>JSON DEMO</title>

<style type="text/css">
.image-design {
	background-repeat: no-repeat;
	background-size: cover;
	background-position: fixed;
	width: 100%;
	height: 15vh;
}

.json-design {
	font-family: galindo;
	text-shadow: 1px 1px red;
	font-size: 40px;
}
</style>
</head>
<body>
	<%@include file="all_Component/navbar.jsp"%>

	<div class=" container-fluid image-design">
		<h2 class="text-center p-3 mt-4 json-design">
			<i class='fa fa-sticky-note'></i> Welcome To JSON Demo
		</h2>
		<img alt="Home" src="images/index.jpeg">
	</div>

	<%@include file="all_Component/footer.jsp"%>
</body>
</html>