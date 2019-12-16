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
              <a class="nav-link" href="indexEstudiante.jsp">Inicio <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="indexEstudiante.jsp">Buscar Proyectos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="indexEstudiante.jsp">Agregar Proyecto!!</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="indexEstudiante.jsp">Salir</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Mi Cuenta
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="indexEstudiante.jsp">Mi perfil</a>
                <a class="dropdown-item" href="indexEstudiante.jsp">Mis Proyectos</a>
                <a class="dropdown-item" href="indexEstudiante.jsp">Problemas</a>
                <a class="dropdown-item" href="indexEstudiante.jsp">Salir</a>

              </div>
            </li>
          </ul>
        </div>
      </nav>
    </div>