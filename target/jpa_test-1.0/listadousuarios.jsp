<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de usuarios</title>
    </head>
    <body>
        <h1>Listado de usuario</h1>
        <ul>
            <c:forEach items="${usuarios}" var="usuario">
                <li>
                    <p><strong>Usuario: </strong>${usuario.username}</p>
                    <p><strong>Contraseña: </strong>${usuario.password}</p>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
