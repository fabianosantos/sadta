<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SADTA - Sistema de Armazenamento de Dados Tenshi Arts</title>
<!-- Bootstrap -->
<link href="/sadta/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="/sadta/js/bootstrap.min.js"></script>

	<div class="navbar navbar-inverse">
		<div class="navbar-inner">
			<a class="brand" href="#">SADTA</a>
			<ul class="nav">
				<li class="active"><a href="#">Home</a>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Cadastros</a>
					<ul class="dropdown-menu">
      					<li><a href="/sadta/employee/registerEmployee">Employee</a></li>
    				</ul>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Listas</a>
					<ul class="dropdown-menu">
						<li><a href="/sadta/employee/listEmployee">Employee</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>

	<div class="row-fluid">
		<div class="span1"></div>
		<div class="span7">
		