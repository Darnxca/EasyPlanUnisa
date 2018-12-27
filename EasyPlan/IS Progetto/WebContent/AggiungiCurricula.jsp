<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EasyPlan | Aggiungi Curricula</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- for social icon -->
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style type="text/css">
		.navbar-inverse {
		background-color: #ada2b2;
		border-color: #ada2b2;
		}
		</style>
	</head>
	<body>
		<nav class="navbar navbar-inverse ">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav navbar-right">
					<!-- "Login amministratore" --><li><a href="Login amministratore" style="color:#000000">Log out <span class="glyphicon glyphicon-log-out"></span></a></li> </ul>
				</div>
			</div>
		</nav>
		<div class="col-md-12">
			<div class="container">
				<center><h2>Aggiungi curricula</h2></center>
				<form class="form-horizontal">
					<div class="form-group">
						<label class="control-label col-sm-5" for="email">Nome curricula:</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" id="nomeCurricula" placeholder="Inserisci nome Curricula" name="nomeCurricula">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-7" for="scelta" style="margin:0px 0px 0px 65px">Da quale curricula vorresti inportare gli esami?</label><br>
					</div>
					<div class="form-group" >
						<div class="col-md-3" >
							<select class="form-control selcls" style="margin: 0px 0px 0px 435px">
							<option value="volvo">Nessuno</option>
							<option value="saab">Sicurezza</option>
							<option value="opel">Sits</option>
							<option value="audi">Cloud computing</option>
							</select>
						</div>
					</div>
					<div class="col-sm-offset-5 col-sm-10">
						<br><br>
						<button type="submit" class="btn btn-default">Aggiungi curricula</button>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>