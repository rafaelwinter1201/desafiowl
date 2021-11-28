<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html5>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="CSS/style.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" type="imagex/png" href="images/icons8-hungry-100.png">
	
    <title>Café da Manhã</title>
  </head>
  <body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="home.jsp">
	    <img src="images/icons8-food-bar-100.png" alt="" width="30" height="30" class="d-inline-block align-text-top">
	      Café da manhã
	    </a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNav">
	      <ul class="navbar-nav mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="cadastra-funcionario.jsp">Cadastrar Funcionário</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="cadastra-lanche.jsp">Cadastrar Café da manhã</a>
	        </li>
	       </ul>
	    </div>
	  </div>
	</nav>
	<section class="container-fluid larguracard">
		<form class="card mt-5" action="cadastraFuncionario" method="post">
			  <div class="card-body">
				<div class="mb-3">
				  <label for="nome" class="form-label">Nome Completo</label>
				  <input type="text" class="form-control" name="nome" autocomplete="off" id="input" required placeholder="Nome Completo">
				</div>
				<div class="mb-3">
				  <label for="cpf" class="form-label">CPF</label>
				  <input type="text" class="form-control" pattern="\d{3}\.\d{3}\.\d{3}\-\d{2}" autocomplete="off" required onKeyDown="mascara(this)" minlength="14" name="cpf" id="cpf" placeholder="000.000.000-00">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlTextarea1"  class="form-label">Item para café da manhã</label>
				  <textarea class="form-control" name="item" required id="input" rows="3"></textarea>
				</div>
				<div class="d-grid gap-2 col-6 mx-auto">
					<button type="submit" id="botao" class="btn btn-outline-secondary pt-2 pb-2 mt-2 mb-3">Cadastrar</button>
				</div>
				<%
					String mensagem = null;
					mensagem = (String) request.getAttribute("mensagem");
					if (mensagem!=null)
						out.print(mensagem);
				%>
			  </div>
		</form>
	
	</section>








    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	<script src="JS/javascript.js"></script>
	<script src="JS/valid.js"></script>
	
    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
 	 -->
  </body>
</html>