<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" type="text/css">

        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <title>Administracion | GitUnsa</title>
    </head>
    <body>
      <div class="container-fluid bg-secondary">
      <nav class=" container navbar navbar-expand-lg navbar-light ">
        <a class="navbar-brand" href="#">
          <img src="../img/logo.png" width="150" alt="">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.jsp">Inicio <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../mostrarestudiante">Sección Estudiante</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../mostrarvisitante">Sección Visitantes</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../mostraradmin">Sección Administradores</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../mostrarescuela">Escuela</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Profesor
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="../mostrarprofesor">Seccion Profesores</a>
                <a class="dropdown-item" href="../mostrarcurso">Seccion Cursos</a>

              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../cerrarsesion">Cerrar Sesión</a>
            </li>
          </ul>
        </div>
      </nav>
    </div>