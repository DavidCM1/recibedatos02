<%-- 
    Document   : output
    Created on : 6 sept. 2021, 12:07:08
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="persona" scope="request" class="com.emergentes.Persona" />
        <h1>RECIBE DATOS</h1>
        <p>Nombre: <jsp:getProperty name="persona" property="nombre" /></p>
        <p>Telefono: <jsp:getProperty name="persona" property="telefono" /></p>
        <p>Correo: <jsp:getProperty name="persona" property="correo" /></p>
        <a href="index.jsp">volver</a>
    </body>
</html>
