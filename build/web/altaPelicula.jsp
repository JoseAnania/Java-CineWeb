<%-- 
    Document   : altaPelicula
    Created on : 23-ene-2019, 12:49:15
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cine</title>
    </head>
    <body>
        <h1>Alta de Películas</h1>
        
        <form method="post" action="ServletAltaPelicula">
            
            <label form="nombreP">Nombre: </label>
            <input type="text" name="nombreP"/>
            <br>
            <br>
            <label form="descripcion">Descripción: </label>
            <input type="text" name="descripcion"/>
            <br>
            <br>
            <label form="idT">Tipo: </label>
            <select name="cboTipo" id="cboTipo" required="requiered">
                <option value="" disabled selected> Seleccione el Tipo </option>
                    <c:forEach items="${lista}" var="T">
                        <option value=${T.idT}>${T.nombreT}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            <label form="calificacion">Calificación (de 1 a 5) </label>
            <input type="text" name="calificacion"/>           
            <br>
            <br>
            <label form="duracion">Duración: </label>
            <input type="text" name="duracion"/>
            <br>
            <br>
            <input type="submit" value="Aceptar"/>
            
        </form>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
