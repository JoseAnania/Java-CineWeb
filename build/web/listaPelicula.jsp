<%-- 
    Document   : listaPelicula
    Created on : 23-ene-2019, 13:48:35
    Author     : José
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cine</title>
    </head>
    <body>
        <h1>Listado de Películas</h1>
        
        <table border="1">
            <tr><th>Número</th><th>Nombre</th><th>Descripción</th><th>Tipo</th><th>Calificación</th><th>Duración</th></tr>
            
            <c:forEach items="${lista}" var="P">
                <tr><td>${P.idP}</td><td>${P.nombreP}</td><td>${P.descripcion}</td><td>${P.nombreT}</td><td>${P.calificacion}</td><td>${P.duracion}</td></tr>
            </c:forEach>
        </table>   
        <br>
        <div>
            <a href="index.html">Volver</a>
        </div>
    </body>
</html>
