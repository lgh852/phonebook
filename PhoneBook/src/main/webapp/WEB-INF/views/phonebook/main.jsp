<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>Themelight</title>
<!-- google fonts -->
<!-- Custom styles for this template -->

<link href="<%=request.getContextPath()%>/resources/dist/summernote.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/js/board2.js"></script>
<!-- Css link -->
<link rel="stylesheet"
	href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/owl.carousel.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/owl.transitions.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/animate.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/lightbox.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/preloader.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/image.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/icon.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/responsive.css">
<link href="<%=request.getContextPath()%>/resources/css/offcanvas.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/dist/summernote.css"
	rel="stylesheet">
<script
	src="<%=request.getContextPath()%>/resources/dist/summernote.min.js"></script>

<style>
.fontUp {
	font-size: 30px;
} 
</style>
<script type="text/javascript">
	
</script>

</head>
<body id="top">


	<header id="navigation" class="navbar-fixed-top animated-header">
		<div class="container">
			<div class="navbar-header">
				<!-- responsive nav button -->
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- /responsive nav button -->

				<!-- logo -->
				<h1 class="navbar-brand">
					<a href="#body"><h1>PhoneBook</h1></a>
				</h1>
				<!-- /logo -->
			</div>

			<!-- main nav -->
			<nav class="collapse navbar-collapse navbar-right" role="navigation">
				<ul id="nav" class="nav navbar-nav menu">
					<li><a href="<%=request.getContextPath()%>/phonebook/main">Home</a></li>
					<c:if test="${user==null}">
						<li><a
							href="<%=request.getContextPath()%>/phonebook/loginForm">Login</a></li>

						<li><a
							href="<%=request.getContextPath()%>/phonebook/memberRegForm">MemberShip</a></li>
					</c:if>
					<li><a href="<%=request.getContextPath()%>/loginck/logout">LogOut</a></li>
					<li><a href="<%=request.getContextPath()%>/loginck/regUnivForm">UniFriends</a></li>
					<li><a href="<%=request.getContextPath()%>/loginck/regComForm">ComFriends</a></li>
					<li><a href="<%=request.getContextPath()%>/loginck/ListView">AllView</a></li>
					<li><a href="<%=request.getContextPath()%>/loginck/boardlist">Board</a></li>
					<li><a href="<%=request.getContextPath()%>/loginck/boardForm">Board
							write</a></li>
					<li><a href="<%=request.getContextPath()%>/board/boardFrom">shopping</a></li>

				</ul>
			</nav>
			<!-- /main nav -->

		</div>
	</header>


	<div class="wrapper">
		<section id="banner">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="block">
							<h1>UserPhoneBook</h1>
							<div class="buttons">
								<c:if test="${user==null}">
									<a href="<%=request.getContextPath()%>/phonebook/loginForm"
										class="btn btn-learn">Login</a>
									<a href="<%=request.getContextPath()%>/phonebook/memberRegForm"
										class="btn btn-learn">MemberShip </a>
								</c:if>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section id="features">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="title">
							<c:if test="${msg!=null}">
								<h2>${msg}</h2>
							</c:if>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="title">

						<jsp:include page="${page}" />

					</div>

				</div>
			</div>
		</section>

		<footer>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="block">
							<!--수정-->
							<a class="fontUp">UserPhoneBook</a>

						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>


</body>
</html>


