<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book's Details</title>
</head>
<body>
    ${book.id} - ${book.title} - ${book.year}
    <br>
    Authors
    <br>

    <c:forEach items="${book.authors}" var="author">
        ${author.name}<br>
    </c:forEach>

    <a href="<c:url value="/books"/>"> Books </a>
</body>
</html>