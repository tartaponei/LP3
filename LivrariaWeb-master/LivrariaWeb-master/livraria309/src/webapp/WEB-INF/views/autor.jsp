<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width-device-width" />
<title>SmartCompras</title>
</head>
<body ng-controller="FotosController" class="ng-scope">

	
	<div class="container">


		<form class="form-horizontal form-autores" action="/addautor" method="POST">
			<fieldset>
				<legend>Autor</legend>
				<div class="form-group">
					<label class="control-label" for="nome">Nome</label> <input
						class="form-control" type="text" id="nome" name="nome"
						size="40"/>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="sobrenome">Sobrenome</label> <input
						class="form-control" type="text" id="sobrenome" name="sobrenome"
						size="40"/>
				</div>

				<div class="form-group">
					<label class="control-label" for="biografia">Biografia</label> <input
						class="form-control" type="text" id="biografia" name="biografia"
						size="40" />

				</div>
				
				

				<div class="col-lg-10 col-lg-offset-4 botoes">
					<input type="submit" class="btn btn-primary" value="Cadastrar" />
					<button type="reset" class="btn btn-warning">Cancelar</button>
				</div>





			</fieldset>
		</form>


	</div>


</body>
<!-- CSS -->
<link rel="stylesheet" href="css/estiloprodutos.css" />
<link rel="stylesheet" href="css/stylehome.css" />
<!-- CSS -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Catamaran|Hammersmith+One|Imprima"
	rel="stylesheet" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Angular -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.1/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.1/angular-resource.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.1/angular-route.min.js"></script>
<script src="js/main.js"></script>
<script src="js/controllers/fotos-controller.js"></script>
<script src="js/droplist.js"></script>
<!-- Angular -->


</html>