<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <c:forEach items="${books}" var="book">
            ${book.title} <br>
        </c:forEach>
    </body>
</html>
