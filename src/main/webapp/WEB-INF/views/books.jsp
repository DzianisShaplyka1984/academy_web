<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>List Books</title>
    </head>
    <body>

        <c:forEach items="${books}" var="book">
            <a href="<c:url value="/book?id=${book.id}"/>"> ${book.title} </a> <br>
        </c:forEach>

        <br>

        <a href="<c:url value="/authors"/>"> Authors </a> <a href="<c:url value="/showCreateBook"/>"> Create Book </a>
    </body>
</html>
