<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Authors</title>
</head>
<body>

    <c:forEach items="${authors}" var="author">
        <a href="<c:url value="/author?id=${author.id}"/>"> ${author.id} </a> <br>
    </c:forEach>

    <br>

    <a href="<c:url value="/books"/>"> Books </a>
</body>
</html>