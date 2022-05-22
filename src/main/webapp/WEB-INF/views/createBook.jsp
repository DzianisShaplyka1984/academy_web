<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Book</title>
</head>
<body>
    <form action="<c:url value="/createBook"/>">
        <label>Title: </label> <input type="text" name="title"> <br>
        <label>Year: </label> <input type="text" name="year"> <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>