<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Author's Details</title>
</head>
<body>
    ${author.id} - ${author.name}

    <br>
    <a href="<c:url value="/authors"/>"> Authors </a>
</body>
</html>